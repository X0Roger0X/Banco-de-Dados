package prova1_rreis;

import java.util.Scanner;

public class Questao01 {

    public static void main(String[] args) {

        int inicio, fim, impares = 0, z = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        inicio = entrada.nextInt();

        System.out.println("Digite o segundo valor ");
        fim = entrada.nextInt();

        if (inicio < fim) {

            while (inicio <= fim) {

                if (inicio % 2 == 1) {
                    impares++;
                }
                if (inicio % 3 == 0 && inicio % 4 == 0) {
                    z++;
                }
                inicio++;
            }
            System.out.println("valores divisiveis por 3 e 4: " + z);
            System.out.println("valores impares: " + impares);
        } else {
            System.out.println("Valor invalido");
        }

    }
}
