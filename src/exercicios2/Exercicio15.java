package exercicios2;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        //Construa um programa que calcule a velocidade em metros por segundo de um projétil que percorre uma distância
        //em quilômetros a um espaço de tempo em minutos, utilize a fórmula abaixo:
        //V = (D * 1000) / (T * 60)
        //V = Velocidade em m/s
        //D = Distância
        //T = Tempo

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a distância percorrida pelo projétil em quilometros: ");
        double distancia = sc.nextDouble();
        System.out.println("Insira o tempo em minutos percorridos no trajeto do projétil: ");
        double tempo = sc.nextDouble();

        double velocidade = (distancia * 1000) / (tempo * 60);

        System.out.println("A velocidade do projétil foi de " + velocidade + "m/s");

        sc.close();

    }
}
