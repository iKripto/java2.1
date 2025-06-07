import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de linhas da matriz: ");
        int linhas = scanner.nextInt();

        System.out.print("Digite o número de colunas da matriz: ");
        int colunas = scanner.nextInt();

        Matriz matriz = new Matriz(linhas, colunas);
        matriz.preencher(scanner);

        int maior = matriz.encontrarMaior();
        int menor = matriz.encontrarMenor();

        System.out.println("Maior elemento da matriz: " + maior);
        System.out.println("Menor elemento da matriz: " + menor);

        scanner.close();
    }
}