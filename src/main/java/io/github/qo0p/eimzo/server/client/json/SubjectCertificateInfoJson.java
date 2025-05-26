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
public class SubjectCertificateInfoJson {

    private String serialNumber;
    private String X500Name;
    private Map<String, String> subjectName;
    private String validFrom;
    private String validTo;

    public SubjectCertificateInfoJson() {
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getX500Name() {
        return X500Name;
    }

    public void setX500Name(String X500Name) {
        this.X500Name = X500Name;
    }

    public Map<String, String> getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(Map<String, String> subjectName) {
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
}
