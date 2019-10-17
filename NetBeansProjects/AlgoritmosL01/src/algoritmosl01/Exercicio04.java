/*
Algoritmos e Lógica de Programação I
Prof. Dr. Fernando Almeida e Prof. Me. Willian Honda
LISTA DE EXERCÍCIOS 01 EM JAVA
Roger Araujo dos Reis Turma: A
Exercício 4: Fazer um algoritmo que lê dois números inteiros e imprime os números consecutivos desses números.
(Por exemplo: se o usuário digitar 2 e ­9, a saída deverá ser 3 e ­8, porque 3 é consecutivo de 2. –8 é
consecutivo de –9)
 */
package algoritmosl01;

import java.util.Scanner;

public class Exercicio04 {
    
    public static void main(String[] args) {
        
        int n1, n2;
        
        Scanner numero = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        n1 = numero.nextInt();
        
        System.out.print("Digite o segundo número: ");
        n2 = numero.nextInt();
        
        n1 = n1+1; 
        n2 = n2+1;
        
        System.out.print("Os sucessores São: " + n1 + "," +n2);
    }
}
