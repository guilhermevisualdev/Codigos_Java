import java.util.Scanner;
public class exercicio07 {
    public static void main(String[] args) {

        Scanner números = new Scanner(System.in);

        System.out.println("Digite um número: ");
        float número1 = números.nextFloat();

        System.out.println("Digite o segundo número: ");
        float número2 = números.nextFloat();

        System.out.println("Digite o terceiro número: ");
        float número3 = números.nextFloat();

        float média = (número1 + número2 + número3) / 3;

        System.out.println("A média é de: " + média);

    }
    
}
