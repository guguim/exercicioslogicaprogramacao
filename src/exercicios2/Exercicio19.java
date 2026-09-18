package exercicios2;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        //Na eletronica existem diversas unidades de medida, algumas delas são:
        //Unidade  |   Símbolo   |    O que mede          |  Símbolo Aritmético
        //Ampére   |     A       | Corrente elétrica      |          I
        //Volt     |     V       | Tensão elétrica        |          U
        //Ohm      |     Ω       | Resistência elétrica   |          R
        //Watt     |     W       | Potência elétrica      |          P

        //Baseado nesses símbolos, existem alguns cálculos que podemos fazer utilizando a Lei de Ohm,
        //que diz que tendo ao menos dois valores pode-se encontrar o terceiro
        //Sendo assim:
        // A) Em um circuito elétrico temos as seguintes informações:
        //  275 V e 10 A, calcule a resistência elétrica, utilizando a fórmula abaixo;
        // R = U/I
        System.out.println("A)");
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a tensão em Volts: ");
        int u = sc.nextInt();
        System.out.println("Insira a corrente em Amperes: ");
        int i = sc.nextInt();
        int r = u/i;
        System.out.println("A resistência é de: " + r);

        System.out.println("================================================");
        //B) Em um circuito elétrico temos as seguintes informações:
        //275 Ω e 1 A, calcule a tensão elétrica, utilizando a fórmula abaixo:
        // U = R * I
        System.out.println("B) ");

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Insira a resistência em Ohms: ");
        double resistenciaOhms = sc1.nextDouble();
        System.out.println("Insira a corrente em Amperes");
        double correnteAmperes = sc1.nextDouble();
        double tensaoVolts = resistenciaOhms * correnteAmperes;
        System.out.println("A tensão em volts é de: " + tensaoVolts);

        System.out.println("=================================================");
        //C) Em um circuito elétrico temos as seguintes informações:
        //12V e 175 Ω, calcule a corrente elétrica, utilizando a fórmula abaixo:
        //I = U/R
        System.out.println("C) ");

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Insira a Tensao em Volts: ");
        double tensaoVolts2 = sc3.nextDouble();
        System.out.println("Insira a Resistência em Ohms: ");
        double resistenciaOhms2 = sc3.nextDouble();
        double correnteAmperes2 = tensaoVolts2 / resistenciaOhms2;
        System.out.println("A corrente elétrica é de " + correnteAmperes2);

        System.out.println("==================================================");
        //D) Ainda podemos realizar o cálculo de potência elétrica, desenvolva uma rotina que calcule a potência de um
        //equipamento, utilizando os dados e a fórmula a seguir:
        //P = U * I

        System.out.println("D) ");
        Scanner sc4 = new Scanner(System.in);
        System.out.println("Insira a tensão em Volts: ");
        double tensaoVolts3 = sc4.nextDouble();
        System.out.println("Insira a corrente em Amperes: ");
        double correnteAmperes4 = sc4.nextDouble();
        double potencia = tensaoVolts3 * correnteAmperes4;

        System.out.println("A potência é de: " + potencia);

        sc.close();
        sc1.close();
        sc3.close();
        sc4.close();

    }
}
