/*
Algoritmos e Lógica de Programação I
Prof. Dr. Fernando Almeida e Prof. Me. Willian Honda
LISTA DE EXERCÍCIOS 02 EM JAVA
Roger Araujo dos Reis Turma: A
Exercício 6: Faça um programa para ler e escrever dados de uma turma de 5 alunos. O programa deve pedir dados como
nome, idade e sexo. O programa deve imprimir os dados do aluno mais velho. Use o laço DO-WHILE.
 */
package algoritmosl02;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

        int idade, i = 0, maioridade = 0;
        String nome, nomemaior = null;
        char sexo, sexomaior = 0;

        Scanner entrada = new Scanner(System.in);

        do {
            System.out.print("Digite o nome do aluno: ");
            nome = entrada.nextLine();

            System.out.print("Digite a idade: ");
            idade = entrada.nextInt();
            entrada.nextLine();
            System.out.print("Digite o sexo M ou F: ");
            sexo = entrada.nextLine().charAt(0);

            i++;

            if (idade > maioridade) {
                maioridade = idade;
                sexomaior = sexo;
                nomemaior = nome;
            }

        } while (i < 5);

        System.out.println("dados do aluno mais velho: " + nomemaior + maioridade + sexomaior);
    }
}
