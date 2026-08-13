package exercicios;

public class Exercicio03 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int c= 0;
        int soma = 0;
        int multiplicacao = 0;

        if(a == b){
            soma = a + b;
            System.out.println("Numeros iguais, soma de a: " + a + " + b: " + b + " = " + soma);
            c = soma;
            System.out.println("Novo valor de C:" + c);

        } else{
            multiplicacao = a * b;
            System.out.println("Números diferentes, multiplicacao de a: " + a + " * b: " + b + " = " + soma);
            c = multiplicacao;
            System.out.println("Novo valor de C:" + c);
        }
    }


}
