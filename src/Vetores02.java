import java.util.Random;

public class Vetores02 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numeros = new int[15];

        System.out.println("Números sorteados:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1;
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\n\nNúmeros Pares:");
        for (int num : numeros) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        System.out.println("\n\nNúmeros Ímpares:");
        for (int num : numeros) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }
}
