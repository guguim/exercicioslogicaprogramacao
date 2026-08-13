package exercicios;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanto tempo você gastou na viagem?: ");
        int tempo = scanner.nextInt();
        System.out.println("Qual foi a sua velocidade média?: ");
        int velocidade = scanner.nextInt();

        int distancia = tempo * velocidade;
        int litrosUsados = distancia / 12;

        System.out.println("A quantidade de litros usados foram de : " + litrosUsados);


    }
}
