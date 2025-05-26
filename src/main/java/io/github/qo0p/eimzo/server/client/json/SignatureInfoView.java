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
public class SignatureInfoView {

    /**
     * название алгоритма подписи
     */
    private String signAlgName;
    /**
     * подпись
     */
    private String signature;

    public SignatureInfoView() {
    }

    public SignatureInfoView(String signAlgName, String signature) {
        this.signAlgName = signAlgName;
        this.signature = signature;
    }

    public String getSignAlgName() {
        return signAlgName;
    }

    public void setSignAlgName(String signAlgName) {
        this.signAlgName = signAlgName;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
