package adofinal;

import java.util.Scanner;

public class Funcoes {

    static Scanner imput = new Scanner(System.in);

    static int entrada() { // entrada de valores
        System.out.println("Digite o tamanho do vetor: ");
        int inteiro = imput.nextInt();
        return inteiro;
    }

    static int[] tamanho(int entrada) { //define o tamanho do vetor

        int[] vetor = new int[entrada];

        for (int i = 0; i < entrada; i++) {
            vetor[i] = i;

        }
        return vetor;
    }

    static int[] populaVetor(int[] tamanho) { // popula o vetor de numeros inteiros criado

        for (int i = 0; i < tamanho.length; i++) {
            System.out.println("informe um valor: ");
            tamanho[i] = imput.nextInt();
        }
        return tamanho;
    }

    static int[] soma(int[] popular, int[] popular2) {

        int[] resultado = new int[popular.length];

        for (int i = 0; i < popular.length; i++) {
            if (i % 2 == 0) {

                resultado[i] = popular[i] + popular2[i];

            } else {
                resultado[i] = popular[i] * popular2[i];
            }
        }
        return resultado;
    }

    static void imprimir(int[] resultado) { // imprimi o vetor criado

        for (int i = 0; i < resultado.length; i++) {
            System.out.println(resultado[i]);
        }
    }
