import java.util.Scanner;

public class exercicio30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite n: ");
        int n = scanner.nextInt();

        int a = 0; 
        int num = 2; 

        while (a < n) {
            int divisores = 0;

            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    divisores++;
                }
            }

            if (divisores == 2) { 
                System.out.println(num + " ");
                a++;
            }

            num++;
        }
    }
}
