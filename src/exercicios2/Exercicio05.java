package exercicios2;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        //Escreva uma rotina capaz de calcular e apresentar o valor do volume de uma lata de óleo
        // utilize a fórmula abaixo.
        // V = piR^2 x A
        // V = Volume
        // pi = 3.141592654
        // R = Raio da circuferência da lata
        // A = Altura da lata

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o raio da circuferência da lata: ");
        double r = scanner.nextDouble();
        System.out.println("Insira a altura da lata: ");
        double a = scanner.nextDouble();

        double pi = 3.141592654;

        double v = (pi * (r * r )) * a;

        System.out.println("O volume da lata é de: " + v + "cm³");

        scanner.close();
    }
}
