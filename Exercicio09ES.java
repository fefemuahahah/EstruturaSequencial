package com.company;

import java.util.Scanner;

public class Exercicio09ES {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a temperatura em Fahreinheit: ");
        double f = scanner.nextDouble();
        double conversao =  5 * ((f-32) / 9);
        System.out.println( f + "em fahrenheit, pod ser transfrmado para " + conversao + " Celsius");
    }
}
