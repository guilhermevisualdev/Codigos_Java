import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {

        Scanner nmr = new Scanner(System.in);

        System.out.println("Digite um número: ");
        float nmr1 = nmr.nextFloat();

        System.out.println("Agora digite o segundo número: ");
        float nmr2 = nmr.nextFloat();

        nmr.nextLine();

        System.out.println("Agora digite um operador (+, -, * ou /): ");
        String operador = nmr.nextLine();


        float operacao;

        switch (operador) {
            case "+":
            operacao = nmr1 + nmr2;
            System.out.println("Resultado: " + operacao);
            break;

            case "-":
            operacao = nmr1 - nmr2;
            System.out.println("Resultado: " + operacao);
            break;

            case "*":
            operacao = nmr1 * nmr2;
            System.out.println("Resultado: " + operacao);
            break;

            case "/":
            if (nmr2 == 0) {
            System.out.println("Não é possível dividir por 0");
            } else {
            operacao = nmr1 / nmr2;
            System.out.println("Resultado: " + operacao);
            }
            break;

            default:
            System.out.println("Operador inválido!");
            break;
        }
    }
}
