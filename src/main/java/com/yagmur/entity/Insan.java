package com.yagmur.entity;

public class Insan {
    private String ad;
    private int id;

    public Insan() {
    }

    public Insan(String ad, int id) {
        this.ad = ad;
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
