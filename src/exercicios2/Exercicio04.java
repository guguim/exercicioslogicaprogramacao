package exercicios2;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        // Escreva um programa que realize a conversão de graus Fahrenheit (F) para graus Celsius (C).
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira uma temperatura em Fahrenheit: ");
        int fahrenheit = scanner.nextInt();

        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);

        int celsius = (5 * (fahrenheit - 32) / 9);
        System.out.println("Temperatura em Celsius: " + celsius);

        scanner.close();
    }

}
