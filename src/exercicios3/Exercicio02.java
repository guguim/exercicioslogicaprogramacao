package exercicios3;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        // Dados três números inteiros, apresente-os em ordem crescente
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.println("Insira o segundo número: ");
        int num2 = sc.nextInt();
        System.out.println("Insira o terceiro número: ");
        int num3 = sc.nextInt();

        if (num1 <= num2 && num1 <= num3) {
            if (num2 <= num3) {
                System.out.println("Ordem crescente: " + num1 + " " + num2 + " " + num3);
            } else {
                System.out.println("Ordem crescente: " + num1 + " " + num3 + " " + num2);
            }
        } else if (num2 <= num1 && num2 <= num3) {
            if (num1 <= num3) {
                System.out.println("Ordem crescente: " + num2 + " " + num1 + " " + num3);
            } else {
                System.out.println("Ordem crescente: " + num2 + " " + num3 + " " + num1);
            }
        } else {
            if (num1 <= num2) {
                System.out.println("Ordem crescente: " + num3 + " " + num1 + " " + num2);
            } else {
                System.out.println("Ordem crescente: " + num3 + " " + num2 + " " + num1);
            }
        }

        sc.close();
    }
}