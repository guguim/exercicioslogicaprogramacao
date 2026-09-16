package exercicios2;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        //Escreva um programa que realize a conversão de graus Celsius (C) para graus Fahrenheit (F).
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a temperatura em celcius: ");
        int c = scanner.nextInt();

        int f = (9 * c) / 5;
        System.out.println("A temperatura em fahrenheit é: " + f + "F");

        scanner.close();
    }
}


