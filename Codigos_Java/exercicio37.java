import java.util.Scanner;

public class exercicio37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[5];

        for (int i = 0; i < 5; i++) {
            nomes[i] = scanner.nextLine();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(nomes[i]);
        }
    }
}
