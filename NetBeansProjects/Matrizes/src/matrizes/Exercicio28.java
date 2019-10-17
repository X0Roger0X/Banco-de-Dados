/*
Algoritmos e Lógica de Programação I
Prof. Dr. Fernando Almeida e Prof. Me. Willian Honda
LISTA DE EXERCÍCIOS Matriz JAVA
Roger Araujo dos Reis Turma: A
Exercício 28: Dada uma matriz de tamanho N x M, de números inteiros, fazer um programa que imprime a soma dos
elementos de cada linha da matriz.
 */
package matrizes;

public class Exercicio28 {
    
    public static void main(String[] args) {
        int n = 5;
        int m = 4;
        int[][] matriz = new int[n][m];

        System.out.println("VALORES INICIAIS");
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                 if (j == 0) {
                    System.out.print("[");
                }

                System.out.printf(" %d", matriz[i][j]);

                if (j == matriz[i].length - 1) {
                    System.out.print("]\n");
                } else {
                    System.out.print(",");
                }

            }
        }
        System.out.println("VALORES FINAIS");
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = j+i;

                if (j == 0) {
                    System.out.print("[");
                }

                System.out.printf(" %d", matriz[i][j]);

                if (j == matriz[i].length - 1) {
                    System.out.print("]\n");
                } else {
                    System.out.print(",");
                }

            }

        }
         System.out.println("SOMA DOS ELEMENTOS DA LINHA [j]");
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                

                if (j == 0) {
                    System.out.print("[");
                }

                System.out.printf(" %d", matriz[i][j] + matriz[i][j]);

                if (j == matriz[i].length - 1) {
                    System.out.print("]\n");
                } else {
                    System.out.print(",");
                }

            }

        }
    }
}
