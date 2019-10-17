/*
Algoritmos e Lógica de Programação I
Prof. Dr. Fernando Almeida e Prof. Me. Willian Honda
LISTA DE EXERCÍCIOS 05 EM JAVA - Arrays
Roger Araujo dos Reis Turma: A
Exercício 12: Dados dois vetores A e B de mesma dimensão, fazer um programa que verifica a soma e a média de cada
vetor, e imprime a maior soma e a menor média.
 */
package listaarraysvetores;

public class Exercicio12 {

    public static void main(String[] args) {

        int valor = Funcoes.inteiro();
        int[] tamanhoA = Funcoes.tamanhoInteiro(valor);
        int[] tamanhoB = Funcoes.tamanhoInteiro(valor);
        int[] populadoA = Funcoes.populaVetor(tamanhoA);
        int[] populadoB = Funcoes.populaVetor(tamanhoB);
        int[] resultado = Funcoes.soma2vetor(populadoA, populadoB);
        Funcoes.imprimir2(resultado);
    }
}
