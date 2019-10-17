/*
Algoritmos e Lógica de Programação I
Prof. Dr. Fernando Almeida e Prof. Me. Willian Honda
LISTA DE EXERCÍCIOS 02 EM JAVA
Roger Araujo dos Reis Turma: A
Exercício 4: Faça um programa que gere a seguinte série: 10, 20, 30, 40, ..., 990, 1000. Use o laço FOR
 */
package algoritmosl02;

public class Exercicio04 {

    public static void main(String[] args) {

        for (int i = 10; i <= 1000; i = i + 10) {
            System.out.println(i);
        }
    }
}
