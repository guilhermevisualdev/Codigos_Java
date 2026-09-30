import java.util.Scanner;

public class exercicio38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[10];

        for (int i = 0; i < 10; i++) {
            notas[i] = scanner.nextDouble();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(notas[i]);
        }
    }
}
