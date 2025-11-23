/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.qo0p.eimzo.server.client.json;

import java.util.Map;

/**
 *
 * @author administrator
 */
public class CertificateView {

    /**
     * серийный номер
     */
    private String serialNumber;
    /**
     * название субъекта
     */
    private String subjectName;

    private Map<String, String> subjectInfo;
    /**
     * дата начала действия
     */
    private String validFrom;
    /**
     * дата окончания действия
     */
    private String validTo;
    /**
     * название издателя
     */
    private String issuerName;

    private Map<String, String> issuerInfo;
    /**
     * информацио об открытом ключе
     */
    private PublicKeyInfoView publicKey;
    /**
     * информация о подписи
     */
    private SignatureInfoView signature;

    public CertificateView() {
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }

    public String getValidTo() {
        return validTo;
    }

    public void setValidTo(String validTo) {
        this.validTo = validTo;
    }

    public String getIssuerName() {
        return issuerName;
    }

    public void setIssuerName(String issuerName) {
        this.issuerName = issuerName;
    }

    public PublicKeyInfoView getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(PublicKeyInfoView publicKey) {
        this.publicKey = publicKey;
    }

    public SignatureInfoView getSignature() {
        return signature;
    }

    public void setSignature(SignatureInfoView signature) {
        this.signature = signature;
    }

    public Map<String, String> getSubjectInfo() {
        return subjectInfo;
    }
    public void setSubjectInfo(Map<String, String> subjectInfo) {
        this.subjectInfo = subjectInfo;
    }

    public Map<String, String> getIssuerInfo() {
        return issuerInfo;
    }

    public void setIssuerInfo(Map<String, String> issuerInfo) {
        this.issuerInfo = issuerInfo;
    }
}
