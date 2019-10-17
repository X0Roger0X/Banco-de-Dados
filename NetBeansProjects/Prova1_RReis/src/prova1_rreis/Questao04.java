package prova1_rreis;

import java.util.Scanner;

public class Questao04 {

    public static void main(String[] args) {

        double temp, f, c;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantas temp vc quer converter: ");
        temp = entrada.nextDouble();

        while (temp > 0);
        System.out.println("temperatura celsius: ");
        c = entrada.nextDouble();

        f = (9 / 5) * c + 32;

        if (f > 95) {
            System.out.println("Muito quente");
        } else if (f >= 85 && f < 95) {
            System.out.println("Quente");
        } else if (f > 65 && f < 85) {
            System.out.println("Amena");
        } else {
            System.out.println("fria");

        }
    }
}
