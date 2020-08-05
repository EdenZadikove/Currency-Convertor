package com.coinconvertor.model;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManger {
    private File file = null;

    public FileManger(String path) {
        file = new File(path);
    }

    public ArrayList readFromFile() {
        ArrayList<String> data = new ArrayList<String>();
        Scanner scanner = null;
        try{
            scanner = new Scanner(file);
        } catch(FileNotFoundException e) {
            return null;
        }

        while (scanner.hasNextLine()) {
               data.add(scanner.nextLine());
        }
        return data;
    }
}
