/*
Algoritmos e Lógica de Programação I
Prof. Dr. Fernando Almeida e Prof. Me. Willian Honda
LISTA DE EXERCÍCIOS 01 EM JAVA
Roger Araujo dos Reis Turma: A
Exercício 1: Fazer um algoritmo que leia dois números e imprima na tela o produto (multiplicação) dos dois
números.
 */
package algoritmosl01;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        float x, y, resultado;

        Scanner numero = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        x = numero.nextFloat();

        System.out.println("Digite o Segundo Valor : ");
        y = numero.nextFloat();

        resultado = (x * y);
        System.out.println("O valor da multiplicação é: " + resultado);
    }

}
