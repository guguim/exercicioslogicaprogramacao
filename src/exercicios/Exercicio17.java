package exercicios;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira uma temperatura em Fahrenheit: ");
        int fahrenheit = scanner.nextInt();

        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);

        int celsius = (5 * (fahrenheit - 32) / 9);
        System.out.println("Temperatura em Celsius: " + celsius);


    }
}
