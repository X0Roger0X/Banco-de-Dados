/*
Algoritmos e Lógica de Programação I
Prof. Dr. Fernando Almeida e Prof. Me. Willian Honda
LISTA DE EXERCÍCIOS 01 EM JAVA
Roger Araujo dos Reis Turma: A
Exercício 16: Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo
pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24
horas. Veja abaixo alguns exemplos. Não fixe esses valores no código. Você pode usá­los para TESTAR
seu algoritmo:
Hora inicial Hora final Resultado
    16               2    O JOGO DUROU 10 HORA(S)
    0                0    O JOGO DUROU 24 HORA(S)
    2                16   O JOGO DUROU 14 HORA(S)

 */
package algoritmosl01;

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {

        int hi, hf, duracao;

        Scanner numero = new Scanner(System.in);
        System.out.print("hora inicial: ");
        hi = numero.nextInt();

        System.out.print("hora final: ");
        hf = numero.nextInt();

        if (hi == hf) {
            duracao = 24;
        } else if (hf > hi) {
            duracao = hi - hf;

        } else {
            duracao = 24 - hi + hf;

        }
        System.out.println("O jogo durou: " + duracao + " horas");
    }
}
