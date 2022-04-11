import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um 1º número: ");
        double numero1 = scanner.nextDouble();
        System.out.println("Insira um 2º numero: ");
        double numero2 = scanner.nextDouble();
        double soma = numero1 + numero2;
        System.out.println("A soma dos dois números é: " + soma);
    }
}
