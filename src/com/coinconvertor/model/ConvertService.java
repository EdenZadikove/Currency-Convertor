package com.coinconvertor.model;
import java.util.*;

public class ConvertService {
    private CurrencyRepository currencyRepository;
    private CurrencyFactory currencyFactory;
    private Currency toCurrency;
    private Currency fromCurrency;
    private Currency middleStationCurrency;
    private ArrayList<String> data = null;
    /* convert formula:
       (fromCurrency * middleStationCurrency) / toCurrency
        middle_station_currency is used to convert from any currency to NIS.
    */

    public ConvertService(String path) {
        currencyRepository = CurrencyRepository.getInstace(path);
        currencyFactory = new CurrencyFactory();
        data = currencyRepository.getData();
        setCurrencies();

    }

    public double[] convert(){
        double[] convertedData = new double[data.size()];
        double result;
        for(int i = 2; i < data.size(); i++) {
            result = convertStringToDouble(data.get(i));
            result = (fromCurrency.getExchangeRate() * result) / toCurrency.getExchangeRate();
            convertedData[i-2] = result;
        }
        return convertedData;
    }

    private void setCurrencies() {
        this.toCurrency = currencyFactory.getCurrency(data.get(1));
        this.fromCurrency = currencyFactory.getCurrency(data.get(0));
        this.middleStationCurrency = currencyFactory.getCurrency("NIS");
    }

    private double convertStringToDouble(String value) {
        return Double.parseDouble(value);
    }
}
