/*
Algoritmos e Lógica de Programação I
Prof. Dr. Fernando Almeida e Prof. Me. Willian Honda
LISTA DE EXERCÍCIOS 01 EM JAVA
Roger Araujo dos Reis Turma: A
Exercício 14: Fazer um algoritmo que leia dois números e imprime a divisão do maior pelo menor.
 */
package algoritmosl01;

import java.util.Scanner;

public class Exercicio14 {
    
    public static void main(String[] args) {
        
        float a, b, c;
        
        Scanner numero = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        a = numero.nextFloat();
        
        System.out.print("Digite o segundo segundo: ");
        b = numero.nextFloat();
        
        if (a>b){
            c = a/b;
        
        }else 
            c = b/a;
        
        System.out.print("Resultado: " +c);
    }
}
