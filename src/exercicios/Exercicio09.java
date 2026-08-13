package exercicios;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {

        System.out.println("Calculadora de IMC");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira seu peso: ");
        double peso = scanner.nextDouble();

        System.out.println("Insira a sua altura (m): ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura) ;

        if(imc < 18.5){
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Peso ideal (parabéns)");

        } else if (imc >= 25.0 && imc <=29.9) {
            System.out.println("Levemente acima do peso");

        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Obesidade grau I");
        } else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Obesidade grau II (severa)");
        } else if (imc >= 40) {
            System.out.println("Obesidade grau III (mórbida)");
        }

        scanner.close();

    }
}
