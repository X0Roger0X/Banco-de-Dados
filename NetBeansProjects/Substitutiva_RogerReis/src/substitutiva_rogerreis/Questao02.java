package substitutiva_rogerreis;

import java.util.Scanner;
import java.util.Random;

public class Questao02 {

    static Scanner imput = new Scanner(System.in);
    static Random random = new Random();

    static int entrada() {

        int entrada = imput.nextInt();
        if (entrada % 2 == 0) {
            return entrada;
        } else {
            System.out.println("esse numero não é par");
        }

        return entrada;
    }

    static int[] tamanhoVetor(int inicio) {

        int[] vetor = new int[inicio];
        return vetor;

    }

    static int[] popular(int[] vetor) {

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(10);
        }
        return vetor;
    }

    static void imprimir(int[] vetor) {

        for (int i = 0; i < vetor.length; i++) {

            System.out.printf("[%d]", vetor[i]);

            //if (i == vetor.length - 1) {
            //System.out.println("]\n");
            // }
        }
        System.out.println("\n");
    }

    static int[] multi(int[] vetor, int inicio) {

        int[] mult1 = new int[inicio];

        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length - 1; j++) {
                mult1[i] = vetor[i] * vetor[j];
            }
        }

        for (int i = 0; i < mult1.length; i++) {

            System.out.printf("[%d]", mult1[i]);

        }
        return vetor;
    }

    public static void main(String[] args) {

        System.out.println("Digite um valor par para o tamanho do vetor: ");
        int inicio = Questao02.entrada();
        int[] vetor = Questao02.tamanhoVetor(inicio);
        int[] populado = popular(vetor);
        imprimir(vetor);
        int[] resultado = multi(vetor, inicio);
    }
}
