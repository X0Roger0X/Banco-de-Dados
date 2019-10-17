/*
Algoritmos e Lógica de Programação I
Prof. Dr. Fernando Almeida e Prof. Me. Willian Honda
LISTA DE EXERCÍCIOS 01 EM JAVA
Roger Araujo dos Reis Turma: A
Exercício 12: Fazer um algoritmo que leia dois números L e R. O programa deve verificar a maior área entre um
quadrado de lado L e um círculo de raio R. Imprimir na tela qual o maior: "Quadrado" ou "Circulo".
 */
package algoritmosl01;

import java.util.Scanner;

public class Exercicio12 {
    
    public static void main(String[] args) {
        
        int L, R;
         
        Scanner numero = new Scanner(System.in);
        System.out.print("Digite o valor de L: ");
        L = numero.nextInt();
        
        System.out.print("Digite o valor de R: ");
        R = numero.nextInt();
        
        L = (int) Math.pow(L, 2);
        R = (int) (Math.PI * R);
        
        if (L>R){
            System.out.println("Quadrado");
            
        }else
            System.out.println("Circulo");
    }
}
