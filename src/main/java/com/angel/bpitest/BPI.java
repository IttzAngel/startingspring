package com.angel.bpitest;

public class BPI {

    private USD usd;
    private GBP gbp;
    private EUR eur;

    public USD getUsd() {
        return usd;
    }

    public void setUsd(USD usd) {
        this.usd = usd;
    }

    public GBP getGbp() {
        return gbp;
    }

    public void setGbp(GBP gbp) {
        this.gbp = gbp;
    }

    public EUR getEur() {
        return eur;
    }

    public void setEur(EUR eur) {
        this.eur = eur;
    }

    @Override
    public String toString() {
        return "BPI{" +
                "usd=" + usd +
                ", gbp=" + gbp +
                ", eur=" + eur +
                '}';
    }
}
