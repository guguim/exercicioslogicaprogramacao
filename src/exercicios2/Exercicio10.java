package exercicios2;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        //Fazer a leitura de um valor numérico inteiro e apresentar o valor do número elevado ao quadrado, ao cubo e a 10
        //apresentar também a soma total dos três resultados anteriores.
        Scanner sc= new Scanner(System.in);
        System.out.print("Insira um número inteiro: ");
        int num = sc.nextInt();

        int num2 = num * 2;
        int num3 = num * num * num;
        int num10 = num * 10;
        int soma = num2 + num3+ num10;

        System.out.println("Ao quadrado: " + num2);
        System.out.println("Ao cubo: " + num3);
        System.out.println("Vezes 10: " + num10);
        System.out.println("Soma dos resultados: " + soma);

        sc.close();

    }
}
