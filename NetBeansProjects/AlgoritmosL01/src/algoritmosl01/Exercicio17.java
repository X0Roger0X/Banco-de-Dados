/*
Algoritmos e Lógica de Programação I
Prof. Dr. Fernando Almeida e Prof. Me. Willian Honda
LISTA DE EXERCÍCIOS 01 EM JAVA
Roger Araujo dos Reis Turma: A
Exercício 17: Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D for maior do que A, e a soma
de C com D for maior que a soma de A e B e se C e D, ambos, forem positivos e se a variável A for par
escrever a mensagem "Valores aceitos", senão escrever "Valores nao aceitos".
Veja abaixo alguns exemplos. Não fixe esses valores no código. Você pode usá­los para TESTAR seu
algoritmo:
Entradas (A B C D) Saída esperada
    5 6 7 8         Valores nao aceitos
    2 3 2 6         Valores aceitos
 */
package algoritmosl01;

import java.util.Scanner;

public class Exercicio17 {
    
    public static void main(String[] args) {
        
        int a, b, c, d;
        
        Scanner numero = new Scanner(System.in);
        System.out.print("Digite o valor de a: ");
        a = numero.nextInt();
        
        System.out.print("Digite o valor de b: ");
        b = numero.nextInt();
        
        System.out.print("Digite o valor de c: ");
        c = numero.nextInt();
        
        System.out.print("Digite o valor de d: ");
        d = numero.nextInt();
        
        if(b>c && d>a && c+d>a+b && c>0 && d>0){
            
           if (a/2 == 0){
           }
            System.out.print("Valores aceitos: ");
        }else
            System.out.print("Valores não aceitos: ");
    }
}
