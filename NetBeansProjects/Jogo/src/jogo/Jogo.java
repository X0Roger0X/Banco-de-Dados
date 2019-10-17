package jogo;

import java.util.Scanner;

public class Jogo {

    public static void main(String[] args) {

        String x;

        Scanner entrada = new Scanner(System.in);

        System.out.println("As aventuras de Judith");
        System.out.println("");
        System.out.println("A história começa com nossa heroína correndo pela floresta \n"
                + "fugindo da capital do reino que está sendo tomada por uma magia antiga, \n"
                + "que transforma todos em pedra.");
        System.out.println("");
        System.out.println("aperte qualquer tecla e enter para continuar");

        x = entrada.next();
        System.out.println("");

        System.out.println("Ao sair dos limites da floresta a magia parou de avançar, \n"
                + "nossa heroína se viu ali sozinha o desespero começando a brotar. \n"
                + "Nesse momento Anna aparece, não para consolar, \n"
                + "mas sim para dar esperança.");
        System.out.println("Ao olhar para Anna o brilho nos olhos de Judith volta, \n"
                + "pois Anna é a pessoa mais inteligente do reino e uma maga.");
        System.out.println("");
        System.out.println("aperte qualquer tecla e enter para continuar");

        x = entrada.next();
        System.out.println("");

        System.out.println("Anna, the wise ");
        System.out.println("Uma sabia pesquisadora do reino de Myria e velha conhecida de Judith, \n"
                + "grande conhecedora de artefatos Mágicos e criaturas mistica,   \n"
                + "Ponto de vista principal do jogo ");
        System.out.println("");

        System.out.println("Judith, the fearless");
        System.out.println("Conhecida e destemida guerreira, \n"
                + "Bate primeiro, pergunta depois \n"
                + "Companheira de Anna durante essa missão");
        System.out.println("");
        System.out.println("aperte qualquer tecla e enter para continuar");

        x = entrada.next();
        System.out.println("");

        System.out.println("Judith corre até Anna, e diz:\n"
                + "-Com a sua inteligência e a minha força podemos salvar o reino, \n"
                + "e descobrir quem está por trás de tamanho horror.\n"
                + "Com o tempo ambas percebem que o brilho da magia some e vão investigar, \n"
                + "chegando perto da ponte que liga a estrada ao portão principal de entrada da capital. \n"
                + "O horror é visível, todos estão petrificados da forma que estavam \n"
                + "no momento que a magia foi lançada, \n"
                + "sons estranhos são ouvidos dentro e fora da capital, \n"
                + "mas para resolver esse problema o medo não tem vez \n"
                + "e nossas heroínas continuam a caminhar sentido ao portão.");
        System.out.println("");
        System.out.println("aperte qualquer tecla e enter para continuar");

        x = entrada.next();
        System.out.println("");

        System.out.println("Judith diz:\n"
                + "- O som está aumentando.\n"
                + "Mal Judith terminou a frase e um esfinge enorme apareceu como um guardião da entrada da capital\n"
                + " e logo falou:\n"
                + "-A equação deve resolver para caminho prosseguir! \n"
                + "Com a garra a criatura desenha no solo x + 2x = 150 ");
        System.out.println("");
        System.out.println("aperte qualquer tecla e enter para continuar"); //tirar essa parte, ela não precisa depois que resolve a equação vai direto para a proxima
        //parte da historia

        x = entrada.next();
        System.out.println("Ao resolver a equação a criatura começa a desaparecer, \n"
                + "a entrada da cidade está livre e abaixo dele aparece uma entrada que leva ao esgoto\n"
                + "Judith faz cara feia para a entrada e diz:\n"
                + "-Você é a inteligente, então qual caminho vamos seguir???\n"
                + "Digite 1-esgoto ou 2-caminho principal.");

    }

}
