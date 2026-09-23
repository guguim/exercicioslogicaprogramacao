package exercicios5;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        //Calculando dígito verificador de um CPF
        System.out.println("Calculadora de Dígitos do CPF");
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira 9 dígitos do CPF para poder calcular os últimos 2: ");
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        int d3 = sc.nextInt();
        int d4 = sc.nextInt();
        int d5 = sc.nextInt();
        int d6 = sc.nextInt();
        int d7 = sc.nextInt();
        int d8 = sc.nextInt();
        int d9 = sc.nextInt();

        int[] dvt1 = {d1, d2, d3, d4, d5, d6, d7, d8, d9};
        int[] multi1 = {10, 9, 8, 7, 6, 5, 4, 3, 2};
        int[] res1 = new int[9];

        res1[0] = dvt1[0] * multi1[0];
        res1[1] = dvt1[1] * multi1[1];
        res1[2] = dvt1[2] * multi1[2];
        res1[3] = dvt1[3] * multi1[3];
        res1[4] = dvt1[4] * multi1[4];
        res1[5] = dvt1[5] * multi1[5];
        res1[6] = dvt1[6] * multi1[6];
        res1[7] = dvt1[7] * multi1[7];
        res1[8] = dvt1[8] * multi1[8];

        int soma = 0;
        for (int num : res1) {
            soma += num;

        }
        int mod1 = soma % 11;
        int sub1 = 11 - mod1;

        if (sub1 > 9) {
            sub1 = 0;
        }

        System.out.println("Primeiro dígito verificador: " + sub1);

        int[] dvt2 = {d1, d2, d3, d4, d5, d6, d7, d8, d9, sub1};
        int[] multi2 = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};
        int[] res2 = new int[10];

        res2[0] = dvt2[0] * multi2[0];
        res2[1] = dvt2[1] * multi2[1];
        res2[2] = dvt2[2] * multi2[2];
        res2[3] = dvt2[3] * multi2[3];
        res2[4] = dvt2[4] * multi2[4];
        res2[5] = dvt2[5] * multi2[5];
        res2[6] = dvt2[6] * multi2[6];
        res2[7] = dvt2[7] * multi2[7];
        res2[8] = dvt2[8] * multi2[8];
        res2[9] = dvt2[9] * multi2[9];

        int soma2 = 0;
        for (int num : res2) {
            soma2 += num;

        }
        int mod2 = soma2 % 11;
        int sub2 = 11 - mod2;

        if (sub2 > 9) {
            sub2 = 0;
        }

        System.out.println("Segundo dígito verificador: " + sub2);

        System.out.println("O CPF completo é: " + d1 + d2 + d3 + "." + d4 + d5 + d6 + "." + d7 + d8 + d9 + "-" + sub1 + sub2);

    }
}
