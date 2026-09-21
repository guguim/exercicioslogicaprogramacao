package exercicios3;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        //Desenvolva a leitura de cinco valores numéricos inteiros e apresente somente os que forem divisíveis por 2 ou por 3
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira 5 valores numéricos a seguir: ");

        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Os números inseridos que são divisíveis por 2 e por 3 são: ");
        for (int numero : nums) {
            if (numero % 2 == 0 || numero % 3 == 0) {
                System.out.println(numero);
            }
        }
        sc.close();
    }
}
