/*
Algoritmos e Lógica de Programação I
Prof. Dr. Fernando Almeida e Prof. Me. Willian Honda
ADO FINAL
Roger Araujo dos Reis Turma: A
Exercício 1:
 */
package adofinal;

public class Exercicio01 {

    public static void main(String[] args) {

        int entrada = Funcoes.entrada();
        int[] tamanho = Funcoes.tamanho(entrada);
        int[] popular = Funcoes.populaVetor(tamanho);
        int[] popular2 = Funcoes.populaVetor(tamanho);
        int[] resultado = Funcoes.soma(popular, popular2);
        Funcoes.imprimir(resultado);
    }

}
