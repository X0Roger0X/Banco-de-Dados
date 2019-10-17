/*
Algoritmos e Lógica de Programação I
Prof. Dr. Fernando Almeida e Prof. Me. Willian Honda
LISTA DE EXERCÍCIOS Matriz JAVA
Roger Araujo dos Reis Turma: A
Exercício 33: Dada uma matriz de tamanho N x M, de números inteiros, fazer um programa que imprime a posição
(linha e coluna) dos elementos negativos da matriz.
 */
package matrizes;

public class Exercicio33 {
    
    public static void main(String[] args) {
        
        int[][] matriz = {{1,2,3,-4,-5,-3},{1,2,3,4,-5,-10}};
     
        
        

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

               
               
                

                if (j == 0) {
                    System.out.print("[");
                }
                if(matriz[i][j] < 0){
                System.out.printf(" %d", matriz[i][j]);
                }
                

                if (j == matriz[i].length - 1) {
                    System.out.print("]\n");
                } else {
                    System.out.print(",");
                }

            }

        }
    }
}
