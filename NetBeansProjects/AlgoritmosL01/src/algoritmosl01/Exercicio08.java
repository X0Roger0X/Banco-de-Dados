/*
Algoritmos e Lógica de Programação I
Prof. Dr. Fernando Almeida e Prof. Me. Willian Honda
LISTA DE EXERCÍCIOS 01 EM JAVA
Roger Araujo dos Reis Turma: A
Exercício 8: Fazer um algoritmo que leia quatro números e imprime a média aritmética dos quatro números
package algoritmosl01;
*/

import java.util.Scanner;

public class Exercicio08 {
    
    public static void main(String[] args) {
        
        float a, b, c, d, R;
        
        Scanner numero = new Scanner(System.in);
        System.out.print("Primeiro valor: ");
        a = numero.nextInt();
        
        System.out.print("Segundo valor: ");
        b = numero.nextInt();
        
        System.out.print("Terceiro valor: ");
        c = numero.nextInt();
        
        System.out.print("Quarto valor: ");
        d = numero.nextInt();
        
        R = (a+b+c+d)/4;
        System.out.println("Média aritmética: " + R);
    }
}
