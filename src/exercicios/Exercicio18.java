package exercicios;

public class Exercicio18 {
    public static void main(String[] args) {

        int alturaF = 150;
        int alturaS = 110;
        int alturaAnoF = 2;
        int alturaAnoS = 3;
        int anos = 0;

        while (alturaS < alturaF) {
            anos++;
            alturaS += alturaAnoS;
            alturaF += alturaAnoF;

        }

        System.out.println("Serão necessários " + anos + " anos para que Sara alcance a altura de Francisco, que é: " + alturaF + "cm");


    }
}
