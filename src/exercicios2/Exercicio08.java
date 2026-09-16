package exercicios2;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        //Calcular e apresentar o valor de uma prestação em atraso, utilize a fórmula abaixo
        //P = VALOR + (VALOR x (TAXA / 100) x TEMPO)

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor da sua prestação: ");
        double valor = sc.nextDouble();
        System.out.println("Insira a taxa cobrada sob atraso: ");
        double taxa = sc.nextDouble();;
        System.out.println("Insira o tempo em atraso(meses): ");
        double tempo = sc.nextDouble();

        double p = valor + (valor * (taxa / 100) * tempo);

        System.out.println("O valor da sua prestação em atraso é de: " + p);

        sc.close();
    }
}
