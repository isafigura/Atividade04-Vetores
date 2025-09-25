import java.util.Scanner;

public class JogodaVelha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] tabuleiro = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = '-';
            }
        }

        int jogadas = 0;
        boolean jogadorX = true;

        while (jogadas < 9) {
            System.out.println("\nTabuleiro:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(tabuleiro[i][j] + " ");
                }
                System.out.println();
            }

            System.out.print("\nJogador " + (jogadorX ? "X" : "O") + " - informe linha (0-2): ");
            int linha = sc.nextInt();
            System.out.print("Jogador " + (jogadorX ? "X" : "O") + " - informe coluna (0-2): ");
            int coluna = sc.nextInt();

            if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == '-') {
                tabuleiro[linha][coluna] = jogadorX ? 'X' : 'O';
                jogadorX = !jogadorX;
                jogadas++;
            } else {
                System.out.println("Posição inválida! Tente novamente.");
            }
        }

        System.out.println("\nJogo encerrado!");
        sc.close();
    }
}
