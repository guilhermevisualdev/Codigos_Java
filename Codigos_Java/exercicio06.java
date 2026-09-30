import java.util.Scanner;
public class exercicio06 {
    public static void main(String[] args) {

        Scanner numeros = new Scanner(System.in);

        System.out.println("Digite um número: ");
        float número1 = numeros.nextFloat();

        System.out.println("Digite o segundo número: ");
        float número2 = numeros.nextFloat();

        float soma = número1 + número2;
        float sub = número1 - número2;
        float mult = número1 * número2;
        float div = número1 / número2;

        System.out.println("A soma é: " + soma);
        System.out.println("A subtração é: " + sub);
        System.out.println("A multiplicação é: " + mult);
        System.out.println("A divisão é: " + div);

    }
    
}
