/*
Algoritmos e Lógica de Programação I
Prof. Dr. Fernando Almeida e Prof. Me. Willian Honda
LISTA DE EXERCÍCIOS 01 EM JAVA
Roger Araujo dos Reis Turma: A
Exercício 5: Fazer um algoritmo que leia um valor L e calcula a área de um quadrado de lado L.
 */
package algoritmosl01;

import java.util.Scanner;

public class Exercicio05 {
    
    public static void main(String[] args) {
        
        float L, A;
        
        Scanner numero = new Scanner(System.in);
        System.out.print("Digite o valor de L: ");
        L = numero.nextFloat();
        
        A = (float) Math.pow(L, 2);
        System.out.print("O valor da área é: " + A);
    }
    
}
