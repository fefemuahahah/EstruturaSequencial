package com.company;

import java.util.Scanner;

public class Exercicio10ES {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira uma temperatura em Celsius: ");
        double c = scanner.nextDouble();
        double conversao = (c * 1.8) + 32;
        System.out.println( c + "em Celsius, pode ser transfrmado para " + conversao + " ºFahrenheit.");
    }
}
