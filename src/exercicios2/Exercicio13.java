package exercicios2;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        //Elaborar um programa que leia o salário base mensal(SB) de um funcionário e o percentual de reajuste(PR)
        // e calcule o novo valor de salário do funcionário.
        // A fórmula abaixo é uma sugestão de como esse cálculo pode ser feito:
        // NS = SB + (SB * PR) / 100
        // NS = novo salário | SB = Salário Base | PR = Percentual de Reajuste

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o seu salário base: ");
        double sb = sc.nextDouble();
        System.out.println("Insira o seu percentual de reajuste: ");
        double pr = sc.nextDouble();

        double ns = sb + sb * (pr /100);

        System.out.print("Seu novo salário é de: " + ns);

        sc.close();
    }
}
