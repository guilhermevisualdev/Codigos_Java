import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {

        Scanner palavras = new Scanner(System.in);

        System.out.println("Digite a primeira palavra: ");
        String palavra1 = palavras.nextLine();

        System.out.println("Digite a segunda palavra: ");
        String palavra2 = palavras.nextLine();

        System.out.println("Digite a terceira palavra: ");
        String palavra3 = palavras.nextLine();

        System.out.println("Todas as combinações possíveis:");
        System.out.println(palavra1 + " " + palavra2 + " " + palavra3);
        System.out.println(palavra1 + " " + palavra3 + " " + palavra2);
        System.out.println(palavra2 + " " + palavra1 + " " + palavra3);
        System.out.println(palavra2 + " " + palavra3 + " " + palavra1);
        System.out.println(palavra3 + " " + palavra1 + " " + palavra2);
        System.out.println(palavra3 + " " + palavra2 + " " + palavra1);

    }
}
