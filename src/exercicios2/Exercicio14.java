package exercicios2;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        // Desenvolva uma rotnina que leia dois valores numéricos inteiros e apresente o resultado das quatro operações
        // aritméticas básicas (adicao, subtracao, multiplicacao e divisao).

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        int num1 = sc.nextInt();
        System.out.println("Digite outro número: ");
        int num2 = sc.nextInt();

        int soma = num1 + num2;
        int sub = num1 - num2;
        int multi = num1 * num2;
        int div = num1 / num2;

        System.out.println("Números escolhidos: " + num1 + ", " + num2);
        System.out.println("Operações: ");
        System.out.println("Soma: " + soma);
        System.out.println("Subtracao: " + sub);
        System.out.println("Multiplicacao: " + multi);
        System.out.println("Divisão: " + div);

        sc.close();
    }
}
