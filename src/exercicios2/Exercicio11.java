package exercicios2;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        //Elabore um programa que realize a conversão de US$ pra R$, o programa deve saber qual o valor da cotação do dólar
        // e fazer a conversão

        double cotacao = 5.15;

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a quantidade em DOLARES para a conversão em reais: ");
        double dolar = sc.nextDouble();

        double conversao = dolar * cotacao;

        System.out.printf("O valor convertido é de %.2f", conversao);

        sc.close();
    }
}
