/*
Algoritmos e Lógica de Programação I
Prof. Dr. Fernando Almeida e Prof. Me. Willian Honda
LISTA DE EXERCÍCIOS Matriz JAVA
Roger Araujo dos Reis Turma: A
Exercício 24: Dada uma matriz de tamanho N x M, de números inteiros, fazer um programa que preenche e imprime
cada elemento da matriz com o número 7, se a coluna for ímpar, e com 4 se a coluna for par.
 */
package matrizes;

public class Exercicio24 {
    
    public static void main(String[] args) {
        int n = 3;
        int m = 4;
        int[][] matriz = new int[n][m];

        System.out.println("VALORES INICIAIS");
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("matriz: " + matriz[i][j]);

            }
        }
        System.out.println("VALORES FINAIS");
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                if (i % 2 == 1) {
                    matriz[i][j] = 7;

                    System.out.print(" matriz:" + "[" + i + "]" + "[" + j + "]" + matriz[i][j] + " impar \n");
                    System.out.println("");

                } else {
                    matriz[i][j] = 4;
                    System.out.print(" matriz:" + "[" + i + "]" + "[" + j + "]" + matriz[i][j] + " par \n");
                    System.out.println("");
                }

            }
        }
    }
}
