package exercicios2;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        //Elabore uma rotina que apresente o valor do volume de uma esfera, utilize a fórmula abaixo:
        // V = (4 / 3) pi(R ³)
        // V = volume | pi = 3.141592645 | R = raio
        double pi = 3.141592645;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor do raio da esfera: ");
        double raio = sc.nextDouble();

        double volume = (4.0/3.0) * pi * (raio * (raio * raio));

        System.out.println("O volume da esfera é de: " + volume);

        sc.close();

    }
}
