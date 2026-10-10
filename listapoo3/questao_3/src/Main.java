import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de números: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Quantidade inválida.");
        } else {
            long[] fibonacci = new long[n];

            if (n > 0) {
                fibonacci[0] = 0;
            }
            if (n > 1) {
                fibonacci[1] = 1;
            }

            for (int i = 2; i < n; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }

            System.out.println(Arrays.toString(fibonacci));
        }

        scanner.close();
    }
}