package exercicios2;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        //Elabore um programa que realize a conversão de R$ pr US$, o programa deve saber qual o valor da cotação do dólar
        // e fazer a conversão.

        double cotacao = 5.15;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor em reais: ");
        double reais = sc.nextDouble();

        double conversao = reais/cotacao;
        System.out.printf("Agora você tem %.2f dolares, faz o L", conversao );

        sc.close();

    }
}
