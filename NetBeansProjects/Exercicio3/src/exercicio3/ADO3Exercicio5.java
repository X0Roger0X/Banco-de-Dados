
package exercicio3;

import java.util.Scanner;

public class ADO3Exercicio5 {
    
    public static void main(String[] args) {
        
        String name;
        boolean verificar = false;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o meu nome?");
        name = entrada.nextLine();
        
        do{
            if (name.equals("Roger")){
               verificar = true; 
            }else{
                System.out.println("Errrrooouuuu");
                System.out.println("Tente outra vez haha");
                name = entrada.nextLine();
            }
        }while (verificar == false);
        System.out.println("Acertou mizeravi");
    }
}
