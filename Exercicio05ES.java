import java.util.Scanner;

public class Exercicio05ES {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um valor em metros para converter para centímetros: ");
        double valor = scanner.nextDouble();
        double conversao = valor * 100;
        System.out.println("Convertendo: " + valor + "para metros, obtemos " + conversao + ".");
    }
}
