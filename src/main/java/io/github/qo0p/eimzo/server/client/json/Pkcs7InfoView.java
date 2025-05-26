/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.qo0p.eimzo.server.client.json;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author administrator
 */
public class Pkcs7InfoView {

    /**
     * список информации о подписчиках
     */
    private List<Pkcs7SignerInfoView> signers = new LinkedList();
    /**
     * документ
     */
    private String documentBase64;

    public Pkcs7InfoView() {
    }

    public String getDocumentBase64() {
        return documentBase64;
    }

    public void setDocumentBase64(String documentBase64) {
        this.documentBase64 = documentBase64;
    }

    public List<Pkcs7SignerInfoView> getSigners() {
        return signers;
    }

    public void setSigners(List<Pkcs7SignerInfoView> signers) {
        this.signers = signers;
    }

}
