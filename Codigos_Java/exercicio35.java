import java.util.Scanner;

public class exercicio35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        while (soma <= 1000) {
            System.out.print("Digite um número para somar: ");
            soma += scanner.nextInt();
            System.out.println("Soma atual = " + soma);
        }

        System.out.println("A soma passou de 1000. Encerrando.");
    }
}
