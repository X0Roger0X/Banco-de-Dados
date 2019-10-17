/*
Algoritmos e Lógica de Programação I
Prof. Dr. Fernando Almeida e Prof. Me. Willian Honda
LISTA DE EXERCÍCIOS Matriz JAVA
Roger Araujo dos Reis Turma: A
Exercício 22: Dada uma matriz de tamanho N x M, de números inteiros, fazer um programa que preenche e imprime
cada elemento da matriz com o número 20.
 */
package matrizes;

public class Exercicio22 {
    
    public static void main(String[] args) {
        int n = 2;
        int m = 4;
        int[][] matriz = new int[n][m];
        
        System.out.println("VALORES INICIAIS");
        for(int i =0; i < matriz.length; i++){
        
            
            for(int j =0; j < matriz.length; j++){
                System.out.println("matriz: "+matriz[i][j]);
            
            }
        }
         System.out.println("VALORES FINAIS");
        for(int i =0; i < matriz.length; i++){
        
            
            for(int j =0; j < matriz.length; j++){
                matriz[i][j]=20;
                System.out.println("matriz: "+matriz[i][j]);
            
            }
        }
    }
}
