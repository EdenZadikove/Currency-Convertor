package com.coinconvertor.model;

public class CurrencyFactory {
    public Currency getCurrency(String currencyName) {
        Currency currency = null;
        switch(currencyName) {
            case "USD":
                currency = new Currency(currencyName, 3.4150);
                break;
            case "NIS":
                currency = new Currency(currencyName, 1);
                break;
            case "EURO":
                currency = new Currency(currencyName, 4.0059);
                break;
        }
        return currency;
    }
}
