import java.util.Scanner;

public class RankingNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] notas = new double[5][2];
        double[] medias = new double[5];

        // Leitura das notas
        for (int i = 0; i < 5; i++) {
            System.out.println("Aluno " + (i + 1) + ":");
            for (int j = 0; j < 2; j++) {
                System.out.print("Digite a nota " + (j + 1) + ": ");
                notas[i][j] = sc.nextDouble();
            }
            medias[i] = (notas[i][0] + notas[i][1]) / 2;
        }

        // Exibe resultados
        System.out.println("\nMédia de cada aluno:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Aluno " + (i + 1) + " - Média: " + medias[i]);
        }

        sc.close();
    }
}
