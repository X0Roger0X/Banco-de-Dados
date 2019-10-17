/*
Algoritmos e Lógica de Programação I
Prof. Dr. Fernando Almeida e Prof. Me. Willian Honda
LISTA DE EXERCÍCIOS 02 EM JAVA
Roger Araujo dos Reis Turma: A
Exercício 1: Escreva um programa que leia um conjunto de 10 números inteiros positivos. Seu programa deve determinar
e imprimir o maior deles. Use o laço FOR.
 */
package algoritmosl02;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        int x = 1;
        int maior = 0;

        for (int i = 0; i < 10; i++) {

            Scanner numero = new Scanner(System.in);

            System.out.print("Digite o valor: ");
            x = numero.nextInt();

            if (x > maior) {
                maior = x;
            }

        }
        System.out.println("O número maior é: " + maior);
    }
}
