/*
Algoritmos e Lógica de Programação I
Prof. Dr. Fernando Almeida e Prof. Me. Willian Honda
LISTA DE EXERCÍCIOS 02 EM JAVA
Roger Araujo dos Reis Turma: A
Exercício 5: Faça um programa para imprimir os números pares entre 100 e 1, em ordem decrescente, ou seja, o laço
deve iniciar em 100 e encerrar em 1. Use o laço FOR.
 */
package algoritmosl02;

public class Exercicio05 {

    public static void main(String[] args) {

        for (int i = 100; i > 1; i = i - 2) {
            System.out.println(i);
        }
    }
}
