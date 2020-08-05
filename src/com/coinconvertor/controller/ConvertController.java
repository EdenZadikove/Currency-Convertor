package com.coinconvertor.controller;
import com.coinconvertor.model.ConvertService;

public class ConvertController {
    private ConvertService convertService;

    public ConvertController(String path) {
        this.convertService = new ConvertService(path);
    }

    public double[] convert() {
        return convertService.convert();
    }
}
