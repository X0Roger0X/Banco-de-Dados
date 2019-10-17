/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nota;

import java.util.Scanner;

public class Nota {
    
    public static void main (String [] args){
        Scanner Nota = new Scanner(System.in);
        System.out.print("Digite o valor de N1: ");
        int N1 = Nota.nextInt();
        System.out.print("Digite o valor de N2: ");
        int N2 = Nota.nextInt();
        System.out.println("O valor da soma dos 2 valores é " + (N1 + N2));
    }
}

