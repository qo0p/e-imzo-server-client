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
public class Pkcs7VerifyJsonResponse extends JsonResponse {

    private Pkcs7InfoView pkcs7Info;

    private Pkcs7SignerInfoView failedSignerInfo;

    public Pkcs7InfoView getPkcs7Info() {
        return pkcs7Info;
    }

    public Pkcs7SignerInfoView getFailedSignerInfo() {
        return failedSignerInfo;
    }

}
