package com.angel.bpitest;

public class EUR {

    private String code;
    private String symbol;
    private String rate;
    private String description;
    private float rateFloat;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getRateFloat() {
        return rateFloat;
    }

    public void setRateFloat(float rateFloat) {
        this.rateFloat = rateFloat;
    }

    @Override
    public String toString() {
        return "EUR{" +
                "code='" + code + '\'' +
                ", symbol='" + symbol + '\'' +
                ", rate='" + rate + '\'' +
                ", description='" + description + '\'' +
                ", rateFloat=" + rateFloat +
                '}';
    }
}
