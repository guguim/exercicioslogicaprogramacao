package exercicios2;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        //Desenvolva uma rotina que dado um número inteiro qualquer calcule seu antecessor e seu sucessor.
        //existem duas formas de resolver, uma delas é declarando as duas variaveis (antecessor e sucessor)
        //ou fazendo o cálculo direto no print
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número inteiro: ");
        int num = sc.nextInt();

        int antecessor = num - 1;
        int sucessor = num + 1;

        System.out.println("Número inserido: " + num);
        System.out.println("Antecessor: " + antecessor);
        System.out.println("Sucessor: " + sucessor);

        sc.close();
    }
}
