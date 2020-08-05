package com.coinconvertor.view;
import java.util.Scanner;
import com.coinconvertor.controller.ConvertController;

public class MainConvertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert file path");
        ConvertController convertController = new ConvertController(scanner.nextLine());

        double[] data = convertController.convert();

        System.out.println("Converted values:");
        for(int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
}
