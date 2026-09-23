package exercicios4;

public class Exercicio03 {
    public static void main(String[] args) {
        //Elaborar um programa que apresente o somatório dos números na faixa de 1 até 500.


        for (int i = 1; i < 500; i++) {
            int soma = i;
            soma += i;
            int resultado = soma;
            System.out.println(resultado);
        }

    }
}
