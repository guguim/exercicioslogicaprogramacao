package exercicios;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um valor: ");
        int num1 = scanner.nextInt();
        System.out.println("Insira outro valor: ");
        int num2 = scanner.nextInt();

        double quociente = (double) num1 / num2;
        double resto = (double) num1 % num2;


        System.out.println("Quociente: " + quociente + " Resto: " + resto);

        scanner.close();

    }
}
