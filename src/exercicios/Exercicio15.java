package exercicios;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o ano em que voce nasceu: ");
        int ano = scanner.nextInt();

        int anos = 2026 - ano;
        int meses = anos * 12;
        int dias = meses * 30;

        System.out.println("Vocë viveu por " + anos + " anos, " + meses + " meses e " + dias + " dias" );

        scanner.close();

    }
}
