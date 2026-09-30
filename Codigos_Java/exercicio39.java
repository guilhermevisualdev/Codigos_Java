import java.util.Scanner;

public class exercicio39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[10];

        for (int i = 0; i < 10; i++) {
            notas[i] = scanner.nextDouble();
        }

        double maior = notas[0], menor = notas[0], soma = 0;

        for (int i = 0; i < 10; i++) {
            if (notas[i] > maior) maior = notas[i];
            if (notas[i] < menor) menor = notas[i];
            soma += notas[i];
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Média: " + (soma / 10));
    }
}
