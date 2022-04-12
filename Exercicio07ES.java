package com.company;

import java.util.Scanner;

public class Exercicio07ES {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o lado ou a base de um quadrado: ");
        double ladobase = scanner.nextDouble();
        double areaDoQuadrado = ladobase * ladobase;
        System.out.println("A área do quadrado é: " + areaDoQuadrado);
    }
}
