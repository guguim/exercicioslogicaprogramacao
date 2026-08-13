package exercicios;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um número que queira ver a sua tabuada: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= 10 ; i ++){
            System.out.println( num + " x " + i + " = " + (num * i));

        }

        scanner.close();



    }
}
