/*
Algoritmos e Lógica de Programação I
Prof. Dr. Fernando Almeida e Prof. Me. Willian Honda
LISTA DE EXERCÍCIOS Matriz JAVA
Roger Araujo dos Reis Turma: A
Exercício 30: Dada uma matriz de tamanho N x M e um vetor de N elementos, fazer um programa que preencha cada
coluna da matriz com os elementos do vetor.
 */
package matrizes;

public class Exercicio30 {
    
    public static void main(String[] args) {
        int n = 6;
        int m = 6;
        int[][] matriz = new int[n][m];
        int[] vetor = new int [n];
        
         for (int i = 0; i < vetor.length; i++){
         vetor[i] = i;
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

               
                matriz[i][j] = vetor[i];
                

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
    }
}
