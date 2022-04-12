package com.company;

import java.util.Scanner;

public class Exercicio08ES {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o quanto você ganha por hora: ");
        double ganhoPorHora = scanner.nextDouble();
        System.out.println("Insira quantas horas você trabalhou esse mês: ");
        double horasTrabalhadas = scanner.nextDouble();
        double salario = ganhoPorHora * horasTrabalhadas;
        System.out.println("Seu salário é: R$" + salario);
    }
}
