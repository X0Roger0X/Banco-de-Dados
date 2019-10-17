/*
Algoritmos e Lógica de Programação I
Prof. Dr. Fernando Almeida e Prof. Me. Willian Honda
LISTA DE EXERCÍCIOS 01 EM JAVA
Roger Araujo dos Reis Turma: A
Exercício 7: Fazer um algoritmo que leia os dois lados A e B de um triângulo retângulo e calcula a hipotenusa do
triângulo. Para esse caso, considere que hipotenusa =√A²+B² .Dica: nesse programa, você deve
usar a função matemática Math.sqrt() . Por exemplo, a raiz de 121 ficaria Math.sqrt(121) .
 */
package algoritmosl01;

import java.util.Scanner;

public class Exercicio07 {
    
    public static void main(String[] args) {
        
        float A, B, H;
        
        Scanner numero = new Scanner(System.in);
        System.out.print("Digite o lado A: ");
        A = numero.nextInt();
        A = (float) Math.pow(A, 2);
        
        System.out.print("Digite o valor de B: ");
        B = numero.nextInt();
        B = (float) Math.pow(B, 2);
        
        H = A+B;
        H = (float) Math.sqrt(H);
        
        System.out.println("O valor da hipotenusa é: " +H );
        
        
        
    }
}
