/*
Algoritmos e Lógica de Programação I
Prof. Dr. Fernando Almeida e Prof. Me. Willian Honda
LISTA DE EXERCÍCIOS 01 EM JAVA
Roger Araujo dos Reis Turma: A
Exercício 10: Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por
ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas
efetuadas, calcular e imprimir o total a receber no final do mês.
*/
package algoritmosl01;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio10 {
    
    public static void main(String[] args) {
        
        float x, y, z;
        
        Scanner entrada = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("0.00");
        
        System.out.print("Nome do vendedor: ");
        String name = entrada.nextLine();
        
        System.out.print("Salário fixo: ");
        x = entrada.nextInt();
        
        System.out.print("Total de vendas no mês em dinehiro: ");
        y = entrada.nextInt();
        y = (15*y)/100;
        
        z = x+y;
        
        System.out.println(name +" recebera no mês " +dc.format(z));
        
    }
}
//7000