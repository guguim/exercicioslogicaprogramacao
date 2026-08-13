package exercicios;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        double descontoPix = 0.15;
        double descontoCredito = 0.10;
        double jurosCartao = 0.10;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é o valor do produto?: ");
        double valorProduto = scanner.nextDouble();
        System.out.println("Qual forma de pagamento?");
        System.out.println("1- À vista em Dinheiro ou Pix (15% OFF)");
        System.out.println("2- À vista no cartão de crédito (10% OFF)");
        System.out.println("3- Parcelado no cartão em duas vezes");
        System.out.println("4- Parcelado no cartão em três vezes ou mais (10% de juros)");
        System.out.print("Opção: ");
        int escolha = scanner.nextInt();

        if (escolha == 1){
            valorProduto -= (valorProduto * descontoPix);
            System.out.println("Valor a pagar: " + valorProduto);
        } else if (escolha == 2) {
            valorProduto -= (valorProduto * descontoCredito);
            System.out.println("Valor a pagar: " + valorProduto);
        } else if (escolha == 3) {
            System.out.println("Valor a pagar: " + valorProduto);

        } else if (escolha == 4) {
            valorProduto += (valorProduto * jurosCartao);
            System.out.println("Valor a pagar: " + valorProduto);

        }

        scanner.close();

    }
}
