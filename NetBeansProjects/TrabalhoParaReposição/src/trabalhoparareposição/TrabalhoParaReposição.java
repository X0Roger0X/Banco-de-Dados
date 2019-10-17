/*
 Roger Araujo dos Reis TADS 1A Noite
 Projeto integrador - PI
 Trabalho para reposição
 Matéria escolhida: Pré-Calculo
 1. Implemente em Java uma questão de múltipla escolha referente a alguma das outras disciplinas que você está cursando neste semestre.
Primeiro deverá ser apresentado o enunciado da questão com as 5 opções/alternativas de resposta,
que são (a), (b), (c), (d) e (e). Depois que o usuário escolher uma opção, se for a resposta correta deverá ser impresso “Resposta correta”,
caso contrário “Resposta incorreta”. Utilize a estrutura SWITCH invés de IF na implementação.

 */
package trabalhoparareposição;

import java.util.Scanner;

/* Character.toLowerCase(in.next().charAt(0));*/
public class TrabalhoParaReposição {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        char resposta = ' ';

        System.out.println("Qual as raizes da equação x²-5x+6");
        System.out.println("a: 2,3");
        System.out.println("b: 3,1");
        System.out.println("c: 3,2");
        System.out.println("d: 5,4");
        System.out.println("e: 1,3");

        resposta = Character.toLowerCase(entrada.next().charAt(0));

        switch (resposta) {

            case 'a':
            case 'b':
            case 'd':
            case 'e':
                System.err.println("Resposta Incorreta");
                break;
            case 'c':
                System.out.println("Resposta Correta");
                break;

            default:
                System.out.println("Opção invalida");
        }

    }

}
