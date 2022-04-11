import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a primeira nota do aluno: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Insira a 2º nota do aluno: ");
        double nota2 = scanner.nextDouble();
        System.out.println("Agora a terceira nota: ");
        double nota3 = scanner.nextDouble();
        System.out.println("Por último, insira a quarta nota do aluno: ");
        double nota4 = scanner.nextDouble();
        double media = (nota1 + nota2 + nota3 + nota4)/4;
        System.out.println("A média bimestral do aluno é: " + media);
    }
}
