package com.company;

import java.util.Scanner;

public class Exercicio06ES {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o raio de um circulo: ");
        double raio = scanner.nextDouble();
        double area = 3.14 * (raio*raio);
        System.out.println("A área do círculo é: " + area);
    }
}
