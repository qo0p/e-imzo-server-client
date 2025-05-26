/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.qo0p.eimzo.server.client;

import io.github.qo0p.eimzo.server.client.json.AuthJsonResponse;
import io.github.qo0p.eimzo.server.client.json.Pkcs7VerifyJsonResponse;

/**
 *
 * @author administrator
 */
public interface Client {

    public AuthJsonResponse auth(String userRealIP, String host, String pkcs7b64) throws Exception;

    public Pkcs7VerifyJsonResponse verifyPkcs7Attached(String userRealIP, String host, String pkcs7b64) throws Exception;

    public Pkcs7VerifyJsonResponse verifyPkcs7Detached(String userRealIP, String host, String data64, String pkcs7b64) throws Exception;
}
