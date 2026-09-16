package exercicios2;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        //Efetuar o cálculo de quantos litros de combustível um automóvel consome em uma viagem.
        //Sabendo que o automóvel tem uma autonomia de 12km por litro de combustível, desenvolva o cálculo utilizando a
        //fórmula abaixo
        // D = TV
        // LU = D / 12
        // D = distancia em km
        // T = tempo gasto na viagem
        // V = Velocidade

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual foi o tempo gasto na viagem?(h): ");
        double t = scanner.nextDouble();
        System.out.println("Qual foi a velocidade?: ");
        double v = scanner.nextDouble();

        double d = t * v;
        double lu = d / 12;

        System.out.println("Se o tempo gasto na viagem foi de " + t + " horas, na velocidade de " + v + "km/h\n a distância foi de " + d + "km e o consumo foi de " + lu + " litros de gasolina");

    }
}
