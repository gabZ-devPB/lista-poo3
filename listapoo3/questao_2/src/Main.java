import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[6];

        for (int i = 0; i < 6; i++) {
            System.out.print("Digite um número de 1 a 60: ");
            int n = scanner.nextInt();

            if (n < 1 || n > 60 || contem(numeros, n, i)) {
                System.out.println("Número inválido ou repetido!");
                i--;
            } else {
                numeros[i] = n;
            }
        }

        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
        scanner.close();
    }

    public static boolean contem(int[] numeros, int n, int limite) {
        for (int i = 0; i < limite; i++) {
            if (numeros[i] == n) return true;
        }
        return false;
    }
}