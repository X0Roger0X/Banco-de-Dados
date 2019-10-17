package prova2_rogerreis;

import java.util.Scanner;
import java.util.Random;

public class Exercicio02 {

    static Scanner imput = new Scanner(System.in);
    static Random random = new Random();

    static int[][] matriz() {

        int[][] matriz = new int[5][5];

        return matriz;
    }

    static void tamanho(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(100);
            }
        }
    }

    static void imprimir(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (j == 0) {
                    System.out.print("[");

                }
                System.out.printf("%d", matriz[i][j]);
                if (j == matriz.length - 1) {
                    System.out.print("]\n");
                } else {
                    System.out.print(",");
                }
            }
        }
    }

    static void inversa(int[][] matriz, int[][] matrizb) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                matrizb[j][i] = matriz[i][j];
            }

        }

    }

    public static void main(String[] args) {

        int[][] matriz = Exercicio02.matriz();
        int[][] matrizb = Exercicio02.matriz();
        tamanho(matriz);
        inversa(matriz, matrizb);
        imprimir(matriz);
        System.out.println();
        imprimir(matrizb);
    }

}
