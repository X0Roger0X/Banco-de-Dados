package adorelogio;

import java.util.Scanner;

public class ADORelogio {

    public static void main(String[] args) {

        int horas, minutos, segundos;
        String dia;
        String[] semana = {"domingo", "segunda-feira", "terça-feira", "quarta-feira", "quinta-feira", "sexta-feira", "sabado"};

        Scanner entrada = new Scanner(System.in);

        System.out.println("digite o dia da semana: ");
        dia = entrada.nextLine().toLowerCase();

        System.out.println("digite a hora: ");
        horas = entrada.nextInt();

        System.out.println("digite o minuto: ");
        minutos = entrada.nextInt();

        System.out.println("digite o segundo: ");
        segundos = entrada.nextInt();

        semana:
        for (int d = 0; d < 7; d++) {
            System.out.printf("%s", semana);
        }
        hora:
        for (int h = 0; h < 24; h++) {

            for (int m = 0; m < 60; m++) {

                for (int s = 0; s < 60; s++) {
                    System.out.printf("%d:%d:%d \n", h, m, s);
                    if (h == horas && m == minutos && s == segundos) {

                        System.out.println("ALARME!!!");
                        break;
                    }
                }
            }

        }
    }
}
