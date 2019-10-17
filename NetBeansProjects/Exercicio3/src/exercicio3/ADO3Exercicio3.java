
package exercicio3;

import java.util.Scanner;

public class ADO3Exercicio3 {
    
    public static void main(String[] args) {
        
        Scanner n = new Scanner (System.in);
        System.out.print("Digite o valor: ");
        int x, y;
        x = n.nextInt();
        y = 0;
        
        System.out.println("Os " + x + " primeiros multiplos de 3 são:");
        do{
            
            y = y+1;
          System.out.println(3*y);
          
          
          
        }while (y < x);
        
        
          
    }
}
