/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.qo0p.eimzo.server.client.http;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.github.qo0p.eimzo.server.client.Client;
import io.github.qo0p.eimzo.server.client.json.AuthJsonResponse;
import io.github.qo0p.eimzo.server.client.json.Pkcs7VerifyJsonResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author administrator
 */
public class HttpClient implements Client {

    private final URL baseUrl;
    private final Gson gson;
    private Proxy proxy = null;
    private int connectionTimeout;
    private int readTimeout;

    final static int DEFAULT_CONNECTION_TIMEOUT = 5000;
    final static int DEFAULT_READ_TIMEOUT = 30000;

    public HttpClient(URL baseUrl) {
        this(baseUrl, DEFAULT_CONNECTION_TIMEOUT, DEFAULT_READ_TIMEOUT);
    }

    public HttpClient(URL baseUrl, int connectionTimeout, int readTimeout) {
        this.baseUrl = baseUrl;
        this.gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").setFieldNamingStrategy(FieldNamingPolicy.IDENTITY).create();
        this.connectionTimeout = connectionTimeout;
        this.readTimeout = readTimeout;
    }

    public HttpClient setProxy(Proxy proxy) {
        this.proxy = proxy;
        return this;
    }

    public HttpClient setConnectionTimeout(int connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
        return this;
    }

    public HttpClient setReadTimeout(int readTimeout) {
        this.readTimeout = readTimeout;
        return this;
    }

    @Override
    public AuthJsonResponse auth(String userRealIP, String host, String pkcs7b64) throws Exception {
        URL authUrl = new URL(baseUrl, "/backend/auth");
        Map<String, String> headers = new HashMap();
        headers.put("X-Real-IP", userRealIP);
        headers.put("Host", host);
        headers.put("X-Forwarded-Host", host);
        headers.put("X-Real-Host", host);
        Result r = post(authUrl, headers, pkcs7b64.getBytes(), proxy, connectionTimeout, readTimeout);
        if (r.responseCode != 200) {
            throw new HttpStatusExcepion(r.responseCode, r.responseMessage + ": " + r.responseBody);
        }
        AuthJsonResponse res = gson.fromJson(r.responseBody, AuthJsonResponse.class);
        return res;
    }

    @Override
    public Pkcs7VerifyJsonResponse verifyPkcs7Attached(String userRealIP, String host, String pkcs7b64) throws Exception {
        URL authUrl = new URL(baseUrl, "/backend/pkcs7/verify/attached");
        Map<String, String> headers = new HashMap();
        headers.put("X-Real-IP", userRealIP);
        headers.put("Host", host);
        headers.put("X-Forwarded-Host", host);
        headers.put("X-Real-Host", host);
        Result r = post(authUrl, headers, pkcs7b64.getBytes(), proxy, connectionTimeout, readTimeout);
        if (r.responseCode != 200) {
            throw new HttpStatusExcepion(r.responseCode, r.responseMessage + ": " + r.responseBody);
        }
        Pkcs7VerifyJsonResponse res = gson.fromJson(r.responseBody, Pkcs7VerifyJsonResponse.class);
        return res;
    }

    @Override
    public Pkcs7VerifyJsonResponse verifyPkcs7Detached(String userRealIP, String host, String data64, String pkcs7b64) throws Exception {
        URL authUrl = new URL(baseUrl, "/backend/pkcs7/verify/detached");
        Map<String, String> headers = new HashMap();
        headers.put("X-Real-IP", userRealIP);
        headers.put("Host", host);
        headers.put("X-Forwarded-Host", host);
        headers.put("X-Real-Host", host);
        Result r = post(authUrl, headers, (data64 + "|" + pkcs7b64).getBytes(), proxy, connectionTimeout, readTimeout);
        if (r.responseCode != 200) {
            throw new HttpStatusExcepion(r.responseCode, r.responseMessage + ": " + r.responseBody);
        }
        Pkcs7VerifyJsonResponse res = gson.fromJson(r.responseBody, Pkcs7VerifyJsonResponse.class);
        return res;
    }

    public static class Result {

        public int responseCode;
        public String responseMessage;
        public String responseBody;
    }

    public static Result post(URL url, Map<String, String> headers, byte[] body, Proxy proxy, int connectionTimeout, int readTimeout) throws IOException {
        Result r = new Result();
        HttpURLConnection con;
        if (proxy != null) {
            con = (HttpURLConnection) url.openConnection(proxy);
        } else {
            con = (HttpURLConnection) url.openConnection();
        }
        con.setRequestMethod("POST");
        con.setConnectTimeout(connectionTimeout);
        con.setReadTimeout(readTimeout);
        for (String key : headers.keySet()) {
            con.setRequestProperty(key, headers.get(key));
        }
        con.setRequestProperty("Content-Type", "application/octet-stream");
        con.setRequestProperty("Content-Length", String.valueOf(body.length));
        con.setDoOutput(true);
        try (OutputStream out = con.getOutputStream()) {
            out.write(body);
            out.flush();
            r.responseCode = con.getResponseCode();
            r.responseMessage = con.getResponseMessage();

            StringBuilder sb = new StringBuilder();
            InputStreamReader in;
            try {
                in = new InputStreamReader(con.getInputStream());
            } catch (Throwable t) {
                in = new InputStreamReader(con.getErrorStream());
            }
            BufferedReader br = new BufferedReader(in);
            String text = "";
            while ((text = br.readLine()) != null) {
                sb.append(text).append("\n");
            }
            r.responseBody = sb.toString();
        } finally {
            con.disconnect();
        }
        return r;
    }

}
