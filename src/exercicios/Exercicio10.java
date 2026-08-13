package exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        System.out.println("Calculando média...");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        double soma = nota1 + nota2 + nota3;
        double media = soma / 3;

        System.out.println("A média do aluno é de: " + media);

        scanner.close();

    }
}
