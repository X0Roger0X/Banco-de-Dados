package algoritmosl01;

import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a nota entre A e E: ");
        char grade = entrada.next().charAt(0);

        switch (grade) {
            case 'A':
                System.out.println("Exelente");
                break;

            case 'B':
            case 'C':
                System.out.println("Bem feito");
                break;

            case 'D':
                System.out.println("Você passou");
            case 'E':
                System.out.println("Melhor tentar novamente");
                break;

            default:
                System.out.println("Conceito invalido");
        }

    }
}
