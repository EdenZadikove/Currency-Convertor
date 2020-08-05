package com.coinconvertor.model;

public class Currency {
    private String currencyName;
    private double exchangeRate;

    public Currency(String currencyName, double exchangeRate) {
        this.currencyName = currencyName;
        this.exchangeRate = exchangeRate;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public String getCurrencyName(){
        return currencyName;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }
}
