package com.coinconvertor.model;
import java.util.ArrayList;

public class CurrencyRepository {
    private static CurrencyRepository currencyRepositoryInstance = null;
    private ArrayList<String> data = null;

    private FileManger fileManager;
    private String path;

    private CurrencyRepository(String path) {
        this.fileManager = new FileManger((path));
        this.data = this.fileManager.readFromFile();
    }

    //Singleton
    public static CurrencyRepository getInstace(String path) {
        if(currencyRepositoryInstance == null) {
            currencyRepositoryInstance = new CurrencyRepository(path);
        }
        return currencyRepositoryInstance;
    }

    public ArrayList<String> getData() {
        return this.data;
    }
}
