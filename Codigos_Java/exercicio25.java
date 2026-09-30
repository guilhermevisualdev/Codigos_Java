import java.util.Scanner;

public class exercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "número");
            soma += scanner.nextInt();
        }

        System.out.println("A soma dos números é: " + soma);
    }
}
