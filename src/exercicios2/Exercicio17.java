package exercicios2;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        //Sabendo que 1 ft é igual a 0,3048m ou 30,48cm, desenvolva um programa que leia uma media em pés e calcule o
        //equivalente em metros.
        Scanner sc = new Scanner(System.in);
        double m = 0.3048;
        System.out.println("insira a sua altura em pés: ");
        double pes = sc.nextDouble();

        double altura = pes * m;
        System.out.printf("A sua altura em metros é de %.2f m", altura);

        sc.close();

    }
}
