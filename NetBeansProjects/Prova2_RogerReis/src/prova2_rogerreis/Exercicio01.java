package prova2_rogerreis;

import java.util.Scanner;
import java.util.Random;

public class Exercicio01 {

    static Scanner imput = new Scanner(System.in);
    static Random random = new Random();

    static int imput() {

        System.out.println("Tamanho do Vetor: ");
        int tamanho = imput.nextInt();
        return tamanho;
    }

    static int[] vetor(int imput) {

        int[] vetor = new int[imput];

        return vetor;
    }

    static void tamanho(int[] vetor) {

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100);

        }
    }

    static void imprimir(int[] vetor) {

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("[");
            System.out.printf("%d", vetor[i]);
            System.out.println("]");

        }
    }

    static int multi(int[] vetor) {

        int multi = 5;
        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 0) {
                int resultado = multi * vetor[i];
                System.out.println(resultado);
            }

        }
        return multi;
    }

    public static void main(String[] args) {

        int imput = Exercicio01.imput();
        int[] vetor = Exercicio01.vetor(imput);
        tamanho(vetor);
        imprimir(vetor);
        multi(vetor);
    }

}
