package funçoes;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[][] m = new int[2][4];

        for (int i = 0; i < 2; i++) {
            System.out.println("Informe os elementos da linha " + (i + 1) + ":");
            for (int j = 0; j < 4; j++) {
                System.out.println("Coluna" + (j + 1) + ":");
                m[i][j] = leitor.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("Linha" + (i + 1) + ":");
            for (int j = 0; j < 4; j++) {
                System.out.println("Coluna" + (j + 1) + ":" + m[i][j]);
            }
        }
    }
}
