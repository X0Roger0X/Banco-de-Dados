/*
Algoritmos e Lógica de Programação I
Prof. Dr. Fernando Almeida e Prof. Me. Willian Honda
LISTA DE EXERCÍCIOS Matriz JAVA
Roger Araujo dos Reis Turma: A
Exercício 32: Dada uma matriz de tamanho N x M, de números inteiros, fazer um programa que imprime a soma dos
elementos das colunas ímpares da matriz.
 */
package matrizes;

public class Exercicio32 {
    
    public static void main(String[] args) {
        int n = 6;
        int m = 6;
        int[][] matriz = new int[n][m];
        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = j;

            }
        }

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
                if(i < matriz.length){
                soma += matriz[i][j];
                }
                

            }

        }

        System.out.printf("[%d]", soma);

    }
}
