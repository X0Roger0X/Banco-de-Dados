
package media;

import java.util.Scanner;

public class Media {

    public static void main(String[] args) {
        Scanner Media = new Scanner(System.in);
        System.out.print("Digite a nota N1: ");
        float N1 = Media.nextFloat();
        System.out.print("Digite a nota N2: ");
        float N2 = Media.nextFloat();
        float media = (N1 + N2)/ 2;
        if (media >=6){
            System.out.println("Aluno Aprovado");
        } else {
            System.out.println("Aluno Reprovado");
        }
        System.out.println("Copia não o comédia");
    }
    
}
