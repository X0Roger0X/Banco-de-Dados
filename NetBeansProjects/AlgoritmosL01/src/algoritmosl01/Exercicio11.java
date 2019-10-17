/*
Algoritmos e Lógica de Programação I
Prof. Dr. Fernando Almeida e Prof. Me. Willian Honda
LISTA DE EXERCÍCIOS 01 EM JAVA
Roger Araujo dos Reis Turma: A
Exercício 11: Fazer um algoritmo que lê um número e verifica se ele é negativo. Se for negativo, imprimir na tela a
mensagem "Numero negativo"
 */
package algoritmosl01;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

        float x;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o número: ");
        x = entrada.nextInt();

        if (x < 0) {
            System.out.println("Número negativo");

        } else {
            System.out.println("Número positivo");
        }

    }
}
