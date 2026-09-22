package exercicios3;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        //Desenvolva uma calculadora de IMC (Indice de Massa Corporal), após realizado o cálculo, classificar o paciente
        //de acordo com a tabela abaixo:
        //Utilizar a fórmula: IMC = Peso/ Altura²
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira seu peso: ");
        double peso = sc.nextDouble();
        System.out.println("Insira a sua altura(m): ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        if (imc < 10){
            System.out.println("Desnutrição grau V");
        } else if (imc >=10 && imc <= 12.9) {
            System.out.println("Desnutrição grau IV");
        } else if (imc >=13 && imc <= 15.9) {
            System.out.println("Desnutrição grau III");
        } else if (imc >=16 && imc <= 16.9) {
            System.out.println("Desnutrição grau II");
        } else if (imc >=17 && imc <= 18.4) {
            System.out.println("Desnutrição grau I");
        } else if (imc >=18.5 && imc <= 24.9) {
            System.out.println("Normal");
        } else if (imc >=25 && imc <= 29.9) {
            System.out.println("Pré Obesidade");
        } else if (imc >=30 && imc <= 34.9) {
            System.out.println("Obesidade Grau I");
        } else if (imc >=35 && imc <= 39.9) {
            System.out.println("Obesidade Grau II");
        } else {
            System.out.println("Obesidade Grau III");
        }

        sc.close();

    }
}
