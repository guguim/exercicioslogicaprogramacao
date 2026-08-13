package exercicios;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira os valores dos lados de um triângulo");

        System.out.println("Lado 1:");
        int lado1 = scanner.nextInt();
        System.out.println("Lado 2:");
        int lado2 = scanner.nextInt();
        System.out.println("Lado 3:");
        int lado3 = scanner.nextInt();

        if ( lado1 == lado2 && lado2 == lado3){
            System.out.println("Triangulo Equilatero");
        }

        if (lado1 == lado2 && lado2 != lado3){
            System.out.println("Triangulo Isosceles");
        }

        if (lado1 != lado2 && lado2 != lado3){
            System.out.println("Triangulo Escaleno");
        }

        scanner.close();

    }
}
