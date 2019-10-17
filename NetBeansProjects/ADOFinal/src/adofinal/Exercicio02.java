/*
Algoritmos e Lógica de Programação I
Prof. Dr. Fernando Almeida e Prof. Me. Willian Honda
ADO FINAL
Roger Araujo dos Reis Turma: A
Exercício 2:
 */
package adofinal;

import java.util.Scanner;

public class Exercicio02 {

    static Scanner imput = new Scanner(System.in);

    static int input() { // entrada de valores

        int inteiro = imput.nextInt();
        return inteiro;
    }

//    static int coluna() { // entrada de valores
//        System.out.println("Digite o tamanho de colunas: ");
//        int inteiro = imput.nextInt();
//        return inteiro;
//    }
//    static int[] valorLinha(int linha) {
//
//        int[] vetor = new int[linha];
//
//        for (int i = 0; i < vetor.length; i++) {
//            System.out.println("informe um valor: ");
//            vetor[i] = imput.nextInt();
//
//        }
//        return vetor;
//    }
    static int[][] populaMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i + j;
            }
        }

        return matriz;

    }

    static void imprimir(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                //inicio da formatação
                if (j == 0) {
                    System.out.print("[");
                }
                //logica EX. fazer soma, validar impar ou par
                System.out.printf("%d", matriz[i][j]);
                //fim da formatação
                if (j == matriz[i].length - 1) {
                    System.out.print("]\n");
                } else {
                    System.out.print(",");
                }
            }
        }

    }

    static void valorZ(int z, int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] == z) {
                    System.out.printf("valor: [%d] || COLUNA: [%d]  LINHA:[%d] \n", matriz[i][j], i, j);

                }
            }
        }
    }

    static int[] valorColuna(int coluna) {

        int[] vetor = new int[coluna];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("informe um valor: ");
            vetor[i] = imput.nextInt();

        }
        return vetor;
    }

    static int[][] criaMatriz(int linha, int coluna) {

        int[][] matriz = new int[linha][coluna];

        return matriz;

    }

    public static void main(String[] args) {

        System.out.println("Digite o numero de linhas: ");
        int linha = input();
        System.out.println("Digite o numero de Coulnas: ");
        int coluna = input();

        int[][] matriz = criaMatriz(linha, coluna);
        populaMatriz(matriz);
        imprimir(matriz);
        System.out.println("Digite o valor a ser encontrado");
        int z = input();
        valorZ(z, matriz);

//        int[] valorlinha = Exercicio02.valorLinha(linha);
//        int[] valorcoluna = Exercicio02.valorColuna(coluna);
//        int[][] matriz = Exercicio02.matriz(valorlinha, valorcoluna);
    }
}
