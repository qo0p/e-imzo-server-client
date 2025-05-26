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
public class SignerIdView {

    /**
     * название издателя
     */
    private String issuer;
    /**
     * серийный номер сертификата субъекта
     */
    private String subjectSerialNumber;

    public SignerIdView() {
    }

    public SignerIdView(String issuer, String subjectSerialNumber) {
        this.issuer = issuer;
        this.subjectSerialNumber = subjectSerialNumber;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public String getSubjectSerialNumber() {
        return subjectSerialNumber;
    }

    public void setSubjectSerialNumber(String subjectSerialNumber) {
        this.subjectSerialNumber = subjectSerialNumber;
    }
}
