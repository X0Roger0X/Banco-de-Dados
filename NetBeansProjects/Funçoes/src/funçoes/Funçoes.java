package funçoes;

import java.util.Scanner;

public class Funçoes {

    static Scanner entrada = new Scanner(System.in);

    static int tamanhoVetor() {
        System.out.println("Informe o tamanho do vetor: ");
        int vetorTamanho = entrada.nextInt();
        return vetorTamanho;
    }

    static int[] entradaDado(int tamanho) {

        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.println("informe um valor: ");
            vetor[i] = entrada.nextInt();
        }
        return vetor;
    }

    static int soma(int[] vetor) {

        int tamanho = vetor.length;
        int soma = 0;
        for (int i = 0; i < tamanho; i++) {
            soma = soma + vetor[i];
        }
        return soma;
    }

    public static void main(String[] args) {

        int tamanho = tamanhoVetor();
        int[] vetor = entradaDado(tamanho);
        int soma = soma(vetor);
        System.out.println(soma);
    }

}
