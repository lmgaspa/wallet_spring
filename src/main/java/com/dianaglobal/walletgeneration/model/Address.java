package com.dianaglobal.walletgeneration.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "exchangeAddress")
public class Address {

    @Id
    private String _id;

    private String userId;
    private String btcAddress;
    private String solAddress;
    private String dogeAddress;
    private String dianaAddress;

    // Getters e Setters
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBtcAddress() {
        return btcAddress;
    }

    public void setBtcAddress(String btcAddress) {
        this.btcAddress = btcAddress;
    }

    public String getSolAddress() {
        return solAddress;
    }

    public void setSolAddress(String solAddress) {
        this.solAddress = solAddress;
    }

    public String getDogeAddress() {
        return dogeAddress;
    }

    public void setDogeAddress(String dogeAddress) {
        this.dogeAddress = dogeAddress;
    }

    public String getDianaAddress() {
        return dianaAddress;
    }

    public void setDianaAddress(String dianaAddress) {
        this.dianaAddress = dianaAddress;
    }
}
