package exercicios5;

public class Exercicio1 {
    public static void main(String[] args) {
        //Armazenar em dois vetores V1 e V2 9 valoress numéricos inteiros e exibir o resultado da multiplicação dos
        //números do V1 com os correspondentes em V2

        int[] v1 = {1,2,3,4,5,6,7,8,9};
        int[] v2 = {2,3,4,5,6,7,8,9,0};

        int[] vr = new int[9];

        vr[0] = v1[0] * v2[0];
        vr[1] = v1[1] * v2[1];
        vr[2] = v1[2] * v2[2];
        vr[3] = v1[3] * v2[3];
        vr[4] = v1[4] * v2[4];
        vr[5] = v1[5] * v2[5];
        vr[6] = v1[6] * v2[6];
        vr[7] = v1[7] * v2[7];
        vr[8] = v1[8] * v2[8];

        for (int valor : vr){
            System.out.println("Resultado da multiplicação v1 x v2: " + valor);
        }

    }
}
