package lista4.ex1;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        Scanner scanner = new Scanner(System.in);

        // Leitura dos elementos da matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Digite o elemento da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Impressão dos elementos da diagonal principal
        System.out.println("Elementos da diagonal principal:");
        for (int i = 0; i < 5; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();

        // Soma dos elementos acima da diagonal principal
        int soma = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                soma += matriz[i][j];
            }
        }
        System.out.println("Soma dos elementos acima da diagonal principal: " + soma);

        // Multiplicação dos elementos da diagonal secundária
        int multiplicacao = 1;
        for (int i = 0; i < 5; i++) {
            multiplicacao *= matriz[i][4 - i];
        }
        System.out.println("Multiplicação dos elementos da diagonal secundária: " + multiplicacao);

        // Armazenamento dos elementos da diagonal secundária em um novo vetor
        int[] diagonalSecundaria = new int[5];
        for (int i = 0; i < 5; i++) {
            diagonalSecundaria[i] = matriz[i][4 - i];
        }
        System.out.println("Elementos da diagonal secundária:");
        for (int i = 0; i < 5; i++) {
            System.out.print(diagonalSecundaria[i] + " ");
        }
    }
}
