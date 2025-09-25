import java.util.Random;
import java.util.Scanner;

public class BatalhaNaval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        char[][] mar = new char[7][7];
        boolean[][] navios = new boolean[7][7];
        int encontrados = 0;

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                mar[i][j] = '~';
            }
        }

        int colocados = 0;
        while (colocados < 3) {
            int linha = random.nextInt(7);
            int coluna = random.nextInt(7);
            if (!navios[linha][coluna]) {
                navios[linha][coluna] = true;
                colocados++;
            }
        }

        // Jogo
        while (encontrados < 3) {
            System.out.println("\nTabuleiro:");
            for (int i = 0; i < 7; i++) {
                for (int j = 0; j < 7; j++) {
                    System.out.print(mar[i][j] + " ");
                }
                System.out.println();
            }

            System.out.print("\nDigite a linha (0-6): ");
            int linha = sc.nextInt();
            System.out.print("Digite a coluna (0-6): ");
            int coluna = sc.nextInt();

            if (linha >= 0 && linha < 7 && coluna >= 0 && coluna < 7) {
                if (navios[linha][coluna]) {
                    System.out.println("💥 Você acertou um navio!");
                    mar[linha][coluna] = 'N';
                    navios[linha][coluna] = false;
                    encontrados++;
                } else {
                    System.out.println("🌊 Água!");
                    mar[linha][coluna] = 'X';
                }
            } else {
                System.out.println("Coordenada inválida!");
            }
        }

        System.out.println("\n🎉 Parabéns! Você encontrou todos os navios!");
        sc.close();
    }
}
