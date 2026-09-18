package exercicios3;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        //Desenvolva uma rotina que leia as notas de quatro bimestres de um aluno(n1, n2, n3 e n4)
        //e informe o status do aluno baseado na tabela abaixo:
        // Se a média for menor que 50 = REPROVADO
        // Se a média for igual a 50 = RECUPERAÇÃO
        // Se a média for maior que 50 = APROVADO
        System.out.println("Sistema de calculo de média");

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a primeira nota: ");
        int n1 = sc.nextInt();
        System.out.println("Insira a segunda nota: ");
        int n2 = sc.nextInt();
        System.out.println("Insira a terceira nota: ");
        int n3 = sc.nextInt();
        System.out.println("Insira a quarta nota: ");
        int n4 = sc.nextInt();

        int soma = n1+n2+n3+n4;

        int media = soma / 4;

        if (media < 50){
            System.out.println("Sua nota foi: " + media + "| status: REPROVADO");
        } else if (media == 50) {
            System.out.println("Sua nota foi: " + media + "| status: RECUPERAÇÃO");
        } else {
            System.out.println("Sua nota foi: " + media + "| status: APROVADO");
        }


    }
}
