/*
Algoritmos e Lógica de Programação I
Prof. Dr. Fernando Almeida e Prof. Me. Willian Honda
LISTA DE EXERCÍCIOS 01 EM JAVA
Roger Araujo dos Reis Turma: A
Exercício 15: Leia 3 números decimais A, B e C e efetue o cálculo das raízes da equação de Bhaskara.
Se não for possível calcular as raízes, ou seja, caso haja uma divisão por 0 ou raiz de numero negativo,
mostre a mensagem correspondente “Impossivel calcular ”.
 */
package algoritmosl01;

import java.util.Scanner;

public class Exercicio15 {
    
    public static void main(String[] args) {
        
        double a, b, c, delta, x1, x2;
        
        Scanner numero = new Scanner(System.in);
        System.out.print("Digite o valor de a: ");
        a = numero.nextDouble();
        
        System.out.print("Digite o valor de b: ");
        b = numero.nextDouble();
        
        System.out.print("Digite o valor de c: ");
        c = numero.nextDouble();
        
        delta = Math.sqrt((b*b)-(4*a*c));
            
        if(delta<0){
            System.out.println("Impossivel calcular ");
        
        }else{ 
       
        x1 = ((-b+delta)/(2*a));
        x2 = ((-b-delta)/(2*a));
        System.out.println("Resultado: " + " x1:" + x1 + " x2:" +x2 );
            
        }    
            
    }
}
