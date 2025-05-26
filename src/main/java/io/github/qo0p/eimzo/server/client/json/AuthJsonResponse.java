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
public class AuthJsonResponse extends JsonResponse {

    private SubjectCertificateInfoJson subjectCertificateInfo;

    public AuthJsonResponse() {
    }

    public SubjectCertificateInfoJson getSubjectCertificateInfo() {
        return subjectCertificateInfo;
    }

    public void setSubjectCertificateInfo(SubjectCertificateInfoJson subjectCertificateInfo) {
        this.subjectCertificateInfo = subjectCertificateInfo;
    }

}
