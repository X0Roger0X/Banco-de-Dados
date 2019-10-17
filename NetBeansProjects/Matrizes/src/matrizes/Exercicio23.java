/*
Algoritmos e Lógica de Programação I
Prof. Dr. Fernando Almeida e Prof. Me. Willian Honda
LISTA DE EXERCÍCIOS Matriz JAVA
Roger Araujo dos Reis Turma: A
Exercício 23: Dada uma matriz de tamanho N x M, de números inteiros, fazer um programa que preenche e imprime
cada elemento da matriz com o número 21, se a linha for ímpar, e com 10 se a linha for par.
 */
package matrizes;

public class Exercicio23 {
    
    public static void main(String[] args) {
        int n = 5;
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
                if (j % 2 == 1) {
                    matriz[i][j] = 21;

                    System.out.print(" matriz:" + "[" + i + "]" + "[" + j + "]" + matriz[i][j] + " impar \n");
                    System.out.println("");

                } else {
                    matriz[i][j] = 10;
                    System.out.print(" matriz:" + "[" + i + "]" + "[" + j + "]" + matriz[i][j] + " par \n");
                    System.out.println("");
                }

            }
        }
    }
}
