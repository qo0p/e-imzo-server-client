/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.qo0p.eimzo.server.client.json;

import java.util.List;

/**
 *
 * @author administrator
 */
public class Pkcs7SignerInfoView {

    /**
     * идентификатор подписчика
     */
    private SignerIdView signerId;
    /**
     * время подписи
     */
    private String signingTime;
    /**
     * подпись
     */
    private String signature;
    /**
     * хеш
     */
    private String digest;
    /**
     * информация о штампе времени
     */
    private TimeStampInfoView timeStampInfo;
    /**
     * массив сертификатов
     */
    private CertificateView[] certificate;
    /**
     * ответ OCSP сервиса
     */
    private String OCSPResponse;
    /**
     * Дата обновление статуса
     */
    private String statusUpdatedAt;
    /**
     * Дата следующего обновления статуса
     */
    private String statusNextUpdateAt;
    /**
     * признак верификации подписи
     */
    private boolean verified;
    /**
     * признак верификации сертификата
     */
    private boolean certificateVerified;

    private CertificateView trustedCertificate;
    /**
     * Идентификаторы политики применения сертификата подписчика
     */
    private List<String> policyIdentifiers;
    /**
     * признак подписании на время действительности сертификата
     */
    private boolean certificateValidAtSigningTime;
    /**
     * информация об отзыве
     */
    private RevokedStatusInfoView revokedStatusInfo;
    /**
     * строка текста исключения
     */
    private String exception;

    public Pkcs7SignerInfoView() {
    }

    public SignerIdView getSignerId() {
        return signerId;
    }

    public void setSignerId(SignerIdView signerId) {
        this.signerId = signerId;
    }

    public String getSigningTime() {
        return signingTime;
    }

    public void setSigningTime(String signingTime) {
        this.signingTime = signingTime;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    public TimeStampInfoView getTimeStampInfo() {
        return timeStampInfo;
    }

    public void setTimeStampInfo(TimeStampInfoView timeStampInfo) {
        this.timeStampInfo = timeStampInfo;
    }

    public CertificateView[] getCertificate() {
        return certificate;
    }

    public void setCertificate(CertificateView[] certificate) {
        this.certificate = certificate;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public boolean isCertificateVerified() {
        return certificateVerified;
    }

    public void setCertificateVerified(boolean certificateVerified) {
        this.certificateVerified = certificateVerified;
    }

    public boolean isCertificateValidAtSigningTime() {
        return certificateValidAtSigningTime;
    }

    public void setCertificateValidAtSigningTime(boolean certificateValidAtSigningTime) {
        this.certificateValidAtSigningTime = certificateValidAtSigningTime;
    }

    public RevokedStatusInfoView getRevokedStatusInfo() {
        return revokedStatusInfo;
    }

    public void setRevokedStatusInfo(RevokedStatusInfoView revokedStatusInfo) {
        this.revokedStatusInfo = revokedStatusInfo;
    }

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }

    public String getOCSPResponse() {
        return OCSPResponse;
    }

    public void setOCSPResponse(String OCSPResponse) {
        this.OCSPResponse = OCSPResponse;
    }

    public String getStatusUpdatedAt() {
        return statusUpdatedAt;
    }

    public void setStatusUpdatedAt(String statusUpdatedAt) {
        this.statusUpdatedAt = statusUpdatedAt;
    }

    public String getStatusNextUpdateAt() {
        return statusNextUpdateAt;
    }

    public void setStatusNextUpdateAt(String statusNextUpdateAt) {
        this.statusNextUpdateAt = statusNextUpdateAt;
    }

    public CertificateView getTrustedCertificate() {
        return trustedCertificate;
    }

    public void setTrustedCertificate(CertificateView trustedCertificate) {
        this.trustedCertificate = trustedCertificate;
    }

    public List<String> getPolicyIdentifiers() {
        return policyIdentifiers;
    }

    public void setPolicyIdentifiers(List<String> policyIdentifiers) {
        this.policyIdentifiers = policyIdentifiers;
    }
}
