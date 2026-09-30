import java.util.Scanner;

public class exercicio32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a altura (ímpar): ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println("A altura precisa ser um número ímpar");
        }

        int meio = n / 2;

        for (int i = 0; i <= meio; i++) {
            for (int j = 0; j < meio - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = meio - 1; i >= 0; i--) {
            for (int j = 0; j < meio - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
