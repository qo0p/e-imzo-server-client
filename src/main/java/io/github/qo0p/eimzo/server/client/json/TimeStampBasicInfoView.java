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
public class TimeStampBasicInfoView {

    /**
     * информация о подписчике штампа времени
     */
    private SignerIdView signerId;
    /**
     * политика TSA
     */
    private String tsaPolicy;
    /**
     * время
     */
    private String time;
    /**
     * название алгоритма хеширования
     */
    private String hashAlgorithm;
    /**
     * серийный номер токена
     */
    private String serialNumber;
    /**
     * название TSA
     */
    private String tsa;
    /**
     * объектный идентификатор алгоритма хеширования
     */
    private String messageImprintAlgOID;
    /**
     * хеш
     */
    private String messageImprintDigest;
    /**
     * признак верификации подписи
     */
    private boolean verified;
    /**
     * строка текста исключения
     */
    private String exception;

    public SignerIdView getSignerId() {
        return signerId;
    }

    public void setSignerId(SignerIdView signerId) {
        this.signerId = signerId;
    }

    public String getTsaPolicy() {
        return tsaPolicy;
    }

    public void setTsaPolicy(String tsaPolicy) {
        this.tsaPolicy = tsaPolicy;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getHashAlgorithm() {
        return hashAlgorithm;
    }

    public void setHashAlgorithm(String hashAlgorithm) {
        this.hashAlgorithm = hashAlgorithm;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getTsa() {
        return tsa;
    }

    public void setTsa(String tsa) {
        this.tsa = tsa;
    }

    public String getMessageImprintAlgOID() {
        return messageImprintAlgOID;
    }

    public void setMessageImprintAlgOID(String messageImprintAlgOID) {
        this.messageImprintAlgOID = messageImprintAlgOID;
    }

    public String getMessageImprintDigest() {
        return messageImprintDigest;
    }

    public void setMessageImprintDigest(String messageImprintDigest) {
        this.messageImprintDigest = messageImprintDigest;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }
}
