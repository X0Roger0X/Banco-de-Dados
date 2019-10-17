
package exercicio3;

import java.util.Scanner;

public class ADO3Exercicio2 {
    
    short x;
    
    public static void main(String[] args){
        
        Scanner numero = new Scanner (System.in);
        System.out.print("Digite o ano: ");
        short x = numero.nextShort();
        
        if (x%400==0 || x%4==0 && ! (x%100==0)){
            System.out.println(x +" É um ano bissexto");
        }else{
            System.out.println(x +" Não é um ano bissexto");
        }
        
        
    }
            
            
}
