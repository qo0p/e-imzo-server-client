/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.qo0p.eimzo.server.client.json;

/**
 *
 * @author administrator
 */
public class RevokedStatusInfoView {

    /**
     * время отзыва
     */
    private String revocationTime;
    /**
     * причина отзыва
     */
    private String crlReason;

    public RevokedStatusInfoView() {
    }

    public RevokedStatusInfoView(String revocationTime, String crlReason) {
        this.revocationTime = revocationTime;
        this.crlReason = crlReason;
    }

    public String getRevocationTime() {
        return revocationTime;
    }

    public void setRevocationTime(String revocationTime) {
        this.revocationTime = revocationTime;
    }

    public String getCrlReason() {
        return crlReason;
    }

    public void setCrlReason(String crlReason) {
        this.crlReason = crlReason;
    }
}
