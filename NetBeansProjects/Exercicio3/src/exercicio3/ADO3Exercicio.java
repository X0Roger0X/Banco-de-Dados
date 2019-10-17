
package exercicio3;

import java.util.Scanner;

public class ADO3Exercicio {

    public static void main(String[] args) {
        
        Scanner numero = new Scanner (System.in);
        System.out.println("Digite o primeiro valor:");
        int a = numero.nextInt();
       
        System.out.println("Digite o segundo valor:");
        int b = numero.nextInt();
        
        System.out.println("Digite o terceiro valor:");
        int c = numero.nextInt();      
        
        if (a<b+c && b<a+c && c<a+b){
            
            if (a==b && b==c){
                System.out.println("Os valores formam um triangulo Equilatero");
                
            }else{
                
                if (a == b || b == c || c == a){
                    System.out.println("Os valores formam um triangulo Isóceles");
                
                }else
                    
                    if (a!=b && b!=c){
                        System.out.println("Os valores formam um triangulo Escaleno");
                }
                    
                }
            }else{
                System.out.println("Os valores não formam um triangulo");
            
        }
   
    }
    
}
