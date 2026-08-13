package exercicios;

public class Exercicio23 {
    public static void main(String[] args) {

        double horaAula = 35.00;
        double aulasLecionadas = 48;
        double descontoInss = 0.11;

        double salarioBruto = aulasLecionadas * horaAula;

        double salarioLiquido = salarioBruto - (salarioBruto * descontoInss) ;


        System.out.println(salarioLiquido);



    }
}
