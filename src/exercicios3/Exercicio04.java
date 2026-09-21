package exercicios3;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        //Escreva um programa que dados cinco valores numéricos inteiros apresente apenas o maior e o meno deles
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[5];
        System.out.println("Insira cinco valores numéricos inteiros: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();

        }

        for (int i = 0; i < nums.length; i++){
            System.out.println(nums);
        }

        int maior = 1;
        int menor = 1;

        for (int numero : nums){
           maior = numero;
           if (maior > numero){
               System.out.println("O maior é" + maior);
           } else {
               menor = numero;
               System.out.println("O menor é: " + menor);
           }
        }
    }
}
