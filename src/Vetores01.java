import java.util.Scanner;

public class Vetores01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        int maior = numeros[0];
        int menor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("\nMaior número digitado: " + maior);
        System.out.println("Menor número digitado: " + menor);

        sc.close();
    }
}
