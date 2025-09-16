import java.util.Scanner;

public class Vetores01 {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        Scanner inputNumeros = new Scanner(System.in);
        int maiorNumero = 0;

        for(int i = 0; i < numeros.length; i++){
            System.out.println("Digite um numero: ");
            numeros[i] = inputNumeros.nextInt();

            if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
            }

        }
        System.out.println("O maior número é: " + maiorNumero);
    }
}
