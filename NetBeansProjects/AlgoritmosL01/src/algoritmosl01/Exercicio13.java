/*
Algoritmos e Lógica de Programação I
Prof. Dr. Fernando Almeida e Prof. Me. Willian Honda
LISTA DE EXERCÍCIOS 01 EM JAVA
Roger Araujo dos Reis Turma: A
Exercício 13: Fazer um algoritmo que leia três números e imprime o maior deles.
 */
package algoritmosl01;

import java.util.Scanner;

public class Exercicio13 {
    
    public static void main(String[] args) {
        
        float a, b, c;
        
        Scanner numero = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        a = numero.nextFloat();
        
        System.out.print("Digite o segundo valor: ");
        b = numero.nextFloat();
        
        System.out.print("Digite o terceiro valor: ");
        c = numero.nextFloat();
        
        if (a>b && a>c){
            System.out.print("Primiero valor é o maior ");
            
            } else 
            
            if (b>a && b>c){
                System.out.print("Segundo valor é o maior ");
                
            }else 
                System.out.print("Terceiro valor é o maior ");
        }
}
