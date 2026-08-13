package exercicios;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {

        System.out.println("Maior ou menor de idade");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Insira a sua idade: ");
        int idade = scanner.nextInt();

        if (idade < 18){
            System.out.println("Nome: " + nome + " Idade: " + idade + " é menor de idade");
        }else{

            System.out.println("Nome: " + nome + " Idade: " + idade + " é maior de idade");
        }

        scanner.close();

    }

}
