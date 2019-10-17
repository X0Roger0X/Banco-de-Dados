package prova1_rreis;

public class Questao03 {

    public static void main(String[] args) {

        int x = 3, y = 4, z = 5;

        if ((x - 1) > 2) {
            y = (y + 1);
        } else {
            y = y - 1;
        }
        z = y - x;

        for (int i = 0; i < 9; i++) {

            y = y + 1;

        }
        z = z + y;
        System.out.println(z);
    }
}
