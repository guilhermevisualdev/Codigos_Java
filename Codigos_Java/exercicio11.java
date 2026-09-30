import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {

        Scanner nmr = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int nmr1 = nmr.nextInt();
        
        if (nmr1 % 2 == 0)
        System.out.println("O número é par");
        else
        System.out.println("O número é ímpar");

    }
}
