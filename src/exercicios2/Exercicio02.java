package exercicios2;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        //Baseado nas fórmulas abaixo, desenvolva uma rotina que calcule o salário líquido de um funcionario.
        // Após o cálculo o programa de ve apresentar o salário base e o salário líquido calculado.
        //SB = HT * VH
        //TD = (PD / 100) * SB
        //SL = SB - TD
        // Onde: SB = Salario Base | HT = Horas Trabalhadas | VH = Valor Hora de trabalho | TD = Total de descontos
                // PD = Percentual de Desconto | SL = Salário Liquido

        Scanner scanner = new Scanner(System.in);

        System.out.println("========================");
        System.out.println("CALCULADORA DE SALÁRIO");
        System.out.println("========================");

        System.out.println("Insira suas Horas trabalhadas e o valor delas");
        System.out.println("Horas trabalhadas: ");
        double ht = scanner.nextDouble();
        System.out.println("Valor da Hora Trabalhada: ");
        double vh = scanner.nextDouble();
        System.out.println("Agora preciso que você insira o percentual de desconto: ");
        double pd = scanner.nextDouble();

        double sb = ht * vh;
        double td = (pd / 100) * sb;
        double sl = sb - td;

        System.out.println("O seu salário líquido é de " + sl);






    }
}
