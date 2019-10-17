package prova1_rreis;

import java.util.Scanner;

public class Questao02 {

    public static void main(String[] args) {

        int idade, maioridade = 0, mediaM = 0, homens = 0;
        String nome, maiornome = null;
        char sexo, maiorsexo = 0;

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {

            System.out.println("Digite o nome: ");
            nome = entrada.nextLine();

            System.out.println("Digite a idade: ");
            idade = entrada.nextInt();

            System.out.println("Digite o sexo F ou M: ");
            sexo = entrada.next().charAt(0);

            if (idade > maioridade) {
                maioridade = idade;
                maiornome = nome;
                maiorsexo = sexo;
            }
            if (sexo == 'm') {
                mediaM = mediaM + idade;
                homens++;

            }

            entrada.nextLine();
        }
        mediaM = mediaM / homens;
        System.out.println(maiornome + " " + maioridade + " " + " " + maiorsexo);
        System.out.println("media dos homens: ");
    }
}
