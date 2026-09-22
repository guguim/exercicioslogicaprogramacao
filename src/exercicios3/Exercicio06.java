package exercicios3;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        //Leia um número inteiro qualquer e multiplique por 2, apresentar o resultado da multiplicação somente
        // se o resultado for maior ou igual a 30

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um valor inteiro: ");
        int num = sc.nextInt();

        int newNum = num * 2;

        if (newNum >= 30){
            System.out.println("Resultado da multiplicação do seu valor por 2 é: " + newNum);
        } else {
            System.out.println("Tente novamente");
        }

        sc.close();

    }
}
