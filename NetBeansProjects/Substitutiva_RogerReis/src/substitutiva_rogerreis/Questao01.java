package substitutiva_rogerreis;

import java.util.Scanner;

public class Questao01 {

    static Scanner imput = new Scanner(System.in);

    static int entrada() {

        int entrada = imput.nextInt();
        if (entrada > 0) {
            return entrada;
        } else {
            System.out.println("esse numero não é valido");
        }

        return entrada;
    }

    static int primo(int inicio) {

        if (inicio != 2 && inicio % 2 == 0) {

            System.out.println("esse numero não é primo");
        } else {
            System.out.println("esse numero é primo ");
        }

        return 0;
    }

    public static void main(String[] args) {

        System.out.println("Digite um valor inteiro: ");
        int inicio = Questao01.entrada();
        primo(inicio);

    }

}
