package exercicios2;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        //Baseado na fórmula abaixo escreva um programa que calcule eapresente a área de um círculo
        //A = IIR^2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o Raio do circulo: ");
        double raio = scanner.nextDouble();
        double pi = 3.141592654;

        double area = pi * (raio * raio);

        System.out.println(area);

        scanner.close();

    }
}
