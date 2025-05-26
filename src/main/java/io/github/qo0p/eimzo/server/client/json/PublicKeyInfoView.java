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
public class PublicKeyInfoView {  
    /**
     * название алгоритма ключа 
     */
    private String keyAlgName;
    /**
     * открытый ключ
     */
    private String publicKey;

    public PublicKeyInfoView() {
    }

    public PublicKeyInfoView(String keyAlgName, String publicKey) {
        this.keyAlgName = keyAlgName;
        this.publicKey = publicKey;
    }

    public String getKeyAlgName() {
        return keyAlgName;
    }

    public void setKeyAlgName(String keyAlgName) {
        this.keyAlgName = keyAlgName;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }
    
}
