package exercicios3;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        //Crie uma calculadora que seja capaz de realizar as quatro operações básicas
        //A calculadora deve apresentar um menu e perguntar qual a operação desejada ( +, -, * ou /)
        //A calculadora deve solicitar os dois valores numéricos, realizar a operação e exibir o resultado
        System.out.println("=================CALCULADORA 3000 ==================");
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira qual operação matemática deseja realizar (1: + , 2: - , 3: * ou 4: / ): ");
        int op = sc.nextInt();
        System.out.println("Agora insira um valor: ");
        int num1 = sc.nextInt();
        System.out.println("Agora insira outro valor: ");
        int num2 = sc.nextInt();

        switch (op) {
            case 1:
                System.out.println("Resultado da soma: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Resultado da subtração: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Resultado da multiplicação: " + (num1 * num2));
                break;
            case 4:
                System.out.println("Resultado da divisão: " + (num1 / num2));
                break;
            default:
                System.out.println("Operação inválida");
        }

        sc.close();

    }
}
