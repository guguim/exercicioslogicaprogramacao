package exercicios2;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        //Calcule o volume de uma caixa retangular utilizando a fórmula abaixo
        // V = C * L * A
        // V = Volume em cm³ | C = Comprimento | L = Largura | A = Altura
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o comprimento da caixa: ");
        int c = sc.nextInt();
        System.out.println("Insira a largura da caixa: ");
        int l = sc.nextInt();
        System.out.println("Insira a altura da caixa: ");
        int a = sc.nextInt();

        int v = c * l * a;
        System.out.println("Volume da caixa é de " + v + "cm³");

        sc.close();

    }
}
