public class Matriz {
    private int[][] dados;
    private int linhas;
    private int colunas;

    public Matriz(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        dados = new int[linhas][colunas];
    }

    public void preencher(java.util.Scanner scanner) {
        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.printf("Elemento: ", i, j);
                dados[i][j] = scanner.nextInt();
            }
        }
    }

    public int encontrarMaior() {
        int maior = dados[0][0];
        for (int[] linha : dados) {
            for (int elemento : linha) {
                if (elemento > maior) {
                    maior = elemento;
                }
            }
        }
        return maior;
    }

    public int encontrarMenor() {
        int menor = dados[0][0];
        for (int[] linha : dados) {
            for (int elemento : linha) {
                if (elemento < menor) {
                    menor = elemento;
                }
            }
        }
        return menor;
    }
}
