package exercicios4;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        //Elaborar um programa que calcule e apresente a tabuada de um número qualquer

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o número que queira ver a tabuada: ");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int times = num * i;
            System.out.println(num + " x " + i + " = " + times );
        }

        sc.close();
    }
}
