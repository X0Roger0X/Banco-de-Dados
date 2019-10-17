/*
Algoritmos e Lógica de Programação I
Prof. Dr. Fernando Almeida e Prof. Me. Willian Honda
LISTA DE EXERCÍCIOS 01 EM JAVA
Roger Araujo dos Reis Turma: A
Exercício 2: Fazer um algoritmo que lê dois números, a base e o expoente, e imprime a potência (base elevada ao
expoente). Dica: use a função matemática Math.pow(). Exemplo: 5 elevado ao cubo ficaria
Math.pow(5, 3) . Você pode trocar esses números por variáveis.
 */
package algoritmosl01;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        int x, y, resultado;

        Scanner numero = new Scanner(System.in);
        System.out.print("Digite a Base: ");
        x = numero.nextInt();

        System.out.print("Digite o Expoente: ");
        y = numero.nextInt();

        resultado = (int) Math.pow(x, y);
        System.out.println("Resultado: " + resultado);

    }

}
