package exercicios3;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        //Desenvolva um programa que execute a leitura de um valor numérico inteiro, caso o valor esteja entre 1 e 9
        //apresentar a mensagem "Dentro do valor permitido" e caso contrário apresentar a mensgaem "Fora do Valor Permitido"

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um valor entre 1 e 9: ");
        int num = sc.nextInt();

        if (num >=1 && num <=9){
            System.out.println("Parabéns, vc sabe ler");
        } else {
            System.out.println("Valor inválido seu burro");
        }
        sc.close();
    }
}
