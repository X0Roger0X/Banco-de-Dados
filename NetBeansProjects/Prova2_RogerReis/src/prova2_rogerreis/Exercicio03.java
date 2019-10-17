package prova2_rogerreis;

import java.util.Scanner;
import java.util.Random;

public class Exercicio03 {

    static Scanner imput = new Scanner(System.in);
    static Random random = new Random();

    static int imput() {

        System.out.println("Tamanho da matriz: ");
        int tamanho = imput.nextInt();
        return tamanho;
    }

    static int[][] matriz(int imput) {

        int[][] matriz = new int[imput][imput];

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

    static void magico(int[][] matriz) {

        int numeroLinhas = 0;
        int numeroColunas = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                int linhastotais = 0;
                int colunastotais = 0;

                if (numeroLinhas != colunastotais || numeroColunas != linhastotais || colunastotais != numeroColunas || linhastotais != numeroLinhas) {

                }
            }

        }
    }

    public static void main(String[] args) {

        int imput = Exercicio03.imput();
        int[][] matriz = Exercicio03.matriz(imput);
        tamanho(matriz);
        imprimir(matriz);

    }
}
