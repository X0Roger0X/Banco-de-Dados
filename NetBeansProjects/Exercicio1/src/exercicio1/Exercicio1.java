// shift+f6 roda so o projeto que esta na tela

package exercicio1;

import java.util.Scanner;

public class Exercicio1 {

    //sout + tabe completa o comando inteiro 
    
    public static void main(String[] args) {  //psvm + tab completa esse comando
    
        int entrada;
        
        entrada = 0;
                
        Scanner numero = new Scanner(System.in);
        System.out.print("Digite o valor: " );
        entrada = numero.nextInt();
        if (entrada  % 2==0 ){
            System.out.println("Esse número é par");
        }else{
            System.out.println("Esse número é impar");
        }
    }
}
