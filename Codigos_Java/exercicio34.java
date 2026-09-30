import java.util.Scanner;

public class exercicio34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor = 0;

        while (valor != -1) { 
            System.out.println("Digite um número (-1 para sair): ");
            valor = scanner.nextInt();
        }

        System.out.println("Saindo.");
    }
}
