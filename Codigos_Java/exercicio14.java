import java.util.Scanner;
public class exercicio14 {
    public static void main(String[] args) {

        Scanner numeros = new Scanner(System.in);

        System.out.println("Digite um número: ");
        float nmr1 = numeros.nextFloat();

        System.out.println("Digite o segundo número: ");
        float nmr2 = numeros.nextFloat();

        System.out.println("Digite o terceiro número: ");
        float nmr3 = numeros.nextFloat();

        System.out.println("Digite o quarto número: ");
        float nmr4 = numeros.nextFloat();

        float maiornmr = nmr1;
        float menornmr = nmr1;

        if (nmr2 > maiornmr) maiornmr = nmr2;
        if (nmr3 > maiornmr) maiornmr = nmr3;
        if (nmr4 > maiornmr) maiornmr = nmr4;

        if (nmr2 < menornmr) menornmr = nmr2;
        if (nmr3 < menornmr) menornmr = nmr3;
        if (nmr4 < menornmr) menornmr = nmr4;


        System.out.println("O maior número é o: " + maiornmr);
        System.out.println("O menor número é o: " + menornmr);


       
    }
}
