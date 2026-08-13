package exercicios;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        int nota1 = scanner.nextInt();
        System.out.println("Digite a segunda nota: ");
        int nota2 = scanner.nextInt();
        System.out.println("Digite a terceira nota: ");
        int nota3 = scanner.nextInt();
        System.out.println("Digite a quarta nota: ");
        int nota4 = scanner.nextInt();

        int soma = nota1 + nota2 + nota3 + nota4;
        int media = soma / 4;

        if (media >= 7){
            System.out.println("Aprovado");
        }else {
            System.out.println("Reprovado");
        }

        scanner.close();

    }


}
