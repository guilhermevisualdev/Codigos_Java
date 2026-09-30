import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float[] numeros = new float[4];

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = scanner.nextFloat();
        }

        float maior = numeros[0];
        float menor = numeros[0];

        for (int i = 1; i < 4; i++) {
            if (numeros[i] > maior) maior = numeros[i];
            if (numeros[i] < menor) menor = numeros[i];
        }

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
        
    }
}
