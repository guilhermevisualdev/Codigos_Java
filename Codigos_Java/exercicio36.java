import java.util.Scanner;

public class exercicio36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int resultado = 0;

        while (resultado > -1000) {
            System.out.print("Digite um número para subtrair: ");
            resultado -= scanner.nextInt();
            System.out.println("Resultado atual = " + resultado);
        }

        System.out.println("O resultado ficou menor que -1000. Encerrando.");
    }
}
