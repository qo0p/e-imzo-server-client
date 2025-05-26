/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.qo0p.eimzo.server.client.http;

/**
 *
 * @author administrator
 */
public class HttpStatusExcepion extends Exception {

    private final int statusCode;
    private final String statusMessage;

    public HttpStatusExcepion(int statusCode, String statusMessage) {
        super(statusCode + " - " + statusMessage);
        this.statusCode = statusCode;
        this.statusMessage = statusMessage;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

}
