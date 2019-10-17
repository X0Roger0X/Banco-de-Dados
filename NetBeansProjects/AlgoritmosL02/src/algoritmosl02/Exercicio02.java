/*
Algoritmos e Lógica de Programação I
Prof. Dr. Fernando Almeida e Prof. Me. Willian Honda
LISTA DE EXERCÍCIOS 02 EM JAVA
Roger Araujo dos Reis Turma: A
Exercício 1: Faça um programa que leia um número N do usuário, some todos os números inteiros de 1 a N, e mostre o
resultado obtido. Use o laço WHILE
 */
package algoritmosl02;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        int n, soma = 0, i = 0;

        Scanner numero = new Scanner(System.in);

        System.out.print("Digite o valor: ");
        n = numero.nextInt();

        while (i < n) {

            i++;
            soma = soma + i; // mude para n e vira potenciação elevado ao quadrado
        }

        System.out.println("Total: " + soma);
    }

}
