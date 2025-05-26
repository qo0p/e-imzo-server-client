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
public class TimeStampInfoView extends TimeStampBasicInfoView {

    /**
     * сертификаты
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
     * признак соответствия хеша
     */
    private boolean digestVerified;
    /**
     * признак верификации сертификата
     */
    private boolean certificateVerified;

    private CertificateView trustedCertificate;
    /**
     * признак подписания во время действительности сертификата
     */
    private boolean certificateValidAtSigningTime;
    /**
     * информация об отзыве
     */
    private RevokedStatusInfoView revokedStatusInfo;

    public TimeStampInfoView() {
    }

    public CertificateView[] getCertificate() {
        return certificate;
    }

    public void setCertificate(CertificateView[] certificate) {
        this.certificate = certificate;
    }

    public boolean isDigestVerified() {
        return digestVerified;
    }

    public void setDigestVerified(boolean digestVerified) {
        this.digestVerified = digestVerified;
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

}
