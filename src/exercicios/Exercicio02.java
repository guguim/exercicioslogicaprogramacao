package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num1 = scanner.nextInt();

        if(num1 % 2 == 0){
            System.out.println("Número Par");
        } else {
            System.out.println("Número Ímpar");
        }

        if(num1 > 0){
            System.out.println("Número Positivo");
        } else {
            System.out.println("Número Negativo");
        }

        scanner.close();

    }
}
