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
        int maior = nums[0];
        int menor = nums[0];

        for (int numero : nums) {
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

        sc.close();
    }
}
