/*
Algoritmos e Lógica de Programação I
Prof. Dr. Fernando Almeida e Prof. Me. Willian Honda
LISTA DE EXERCÍCIOS 01 EM JAVA
Roger Araujo dos Reis Turma: A
Exercício 9: Escreva um programa que leia o número de cadastro de um funcionário, seu número de horas
trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre na tela o
número e o salário do funcionário.
*/
package algoritmosl01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio09 {
    
    public static void main(String[] args) {
        
        int x;
        float y, z, w;
        
        Scanner entrada = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("0.00");
        System.out.print("Numero de cadastro: ");
        x = entrada.nextInt();
        
        System.out.print("horas trabalhadas: ");
        y = entrada.nextFloat();
        
        System.out.print("valor recebido por hora: ");
        z = entrada.nextFloat();
        
        w = (y*z);
        
        System.out.println(x +" recebe por hora: " +dc.format(w));
        
    }
}
