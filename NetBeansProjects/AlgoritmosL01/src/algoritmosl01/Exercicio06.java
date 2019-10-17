/*
Algoritmos e Lógica de Programação I
Prof. Dr. Fernando Almeida e Prof. Me. Willian Honda
LISTA DE EXERCÍCIOS 01 EM JAVA
Roger Araujo dos Reis Turma: A
Exercício 6: Escreva um algoritmo que leia três números decimais: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (π = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
f) o perímetro do retângulo que tem lados A e B.
 */
package algoritmosl01;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

        float a, b, c, A, Q;
        float D = 0;
        float R = 0;
        float F = 0;
        float J = 0;
        float PI = (float) 3.14;

        Scanner numero = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        a = numero.nextFloat();

        System.out.print("Digite o valor de B: ");
        b = numero.nextFloat();

        System.out.print("Digite o valor de C: ");
        c = numero.nextFloat();

        if (b > a & b > c) { 

            D = (a * c) / 2; //a) a área do triângulo retângulo que tem A por base e C por altura.
        } 
        
        A = PI * c; //b) a área do círculo de raio C. (π = 3.14159)

        if (a > b || b > a) {

            R = ((a + b) * c) / 2; //c) a área do trapézio que tem A e B por bases e C por altura.
        }

        Q = (float) Math.pow(b, 2); //d) a área do quadrado que tem lado B.

        if (a > b || b > a) {

            F = a * b; //e) a área do retângulo que tem lados A e B.
        }

        if (a > b || b > a) {

            J = (2 * a + 2 * b); //f) o perímetro do retângulo que tem lados A e B.
        }

        System.out.println("a: " + D + " b: " + A + " c: " + R + " d: " + Q + " e: " + F + " e: " + J);
    }

}
