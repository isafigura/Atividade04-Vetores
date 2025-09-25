import java.util.Random;

public class Matriz02 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextInt(100);
            }
        }

        System.out.println("Matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nDiagonal Principal:");
        for (int i = 0; i < 4; i++) {
            System.out.print(matriz[i][i] + " ");
        }
    }
}
