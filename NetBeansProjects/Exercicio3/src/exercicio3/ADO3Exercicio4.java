package exercicio3;

import java.util.Scanner;

public class ADO3Exercicio4 {

    public static void main(String[] args) {
        
        int n, cont;
        boolean verificador = true;
        
        Scanner numero = new Scanner(System.in);
        System.out.print("Digite o valor: ");
        n = numero.nextInt();
        
        if (n == 0 || n == 1) {

            System.out.println(n + " Não é um número Primo");

        } else {
            
            for (cont = 2; cont < n; cont++){
                
                if (n%cont==0){
                    System.out.println("O numero "+ n + " não é primo");
                    verificador = false;
                    break;
                }
                    
            }
            if (verificador){
                System.out.println("O número " + n + " é primo");
            }
        }

    }
}
