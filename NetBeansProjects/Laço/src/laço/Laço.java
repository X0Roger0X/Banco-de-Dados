package laço;

import java.util.Scanner;

public class Laço {

    public static void main(String[] args) {

        int x, soma = 0;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o item: " + i);

            x = sc.nextInt();
            soma = soma + x;

        }
        System.out.println("Totel: " + soma);
    }

}
