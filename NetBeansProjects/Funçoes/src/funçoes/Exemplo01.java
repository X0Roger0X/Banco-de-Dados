package funçoes;

public class Exemplo01 {

    public static void main(String[] args) {

        int i = Funcoes.linha();
        int j = Funcoes.coluna();
        int[][] matriz = {{i, j}};
        System.out.println("matriz" + i + "colunas" + j);
    }
}
