/*
Algoritmos e Lógica de Programação I
Prof. Dr. Fernando Almeida e Prof. Me. Willian Honda
LISTA DE EXERCÍCIOS 01 EM JAVA
Roger Araujo dos Reis Turma: A
Exercício 3: Fazer um algoritmo que lê dois números e imprime a soma dos quadrados dos dois números. O
quadrado de um número A é representado por A2 = A * A.
 */
package algoritmosl01;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        int a, b, x;

        Scanner numero = new Scanner(System.in);
        System.out.print("Digite um Valor: ");
        a = numero.nextInt();
        a = (int) Math.pow(a, 2);

        System.out.print("Digite o Proximo valor: ");
        b = numero.nextInt();
        b = (int) Math.pow(b, 2);

        x = (a + b);
        System.out.println("Resultado: " + x);

    }

}
