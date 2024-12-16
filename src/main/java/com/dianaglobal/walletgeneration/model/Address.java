package com.dianaglobal.walletgeneration.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "exchangeAddress")
public class Address {

    @Id
    private String id;
    private String btcAddress;
    private String solAddress;
    private String dogeAddress;
    private String dianaAddress;

    // Getters e Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
