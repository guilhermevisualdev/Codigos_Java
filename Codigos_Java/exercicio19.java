import java.util.Scanner;

public class exercicio19 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu salário: ");
        double salario = scanner.nextDouble();

        System.out.print("Agora digite sua nota (0 a 10): ");
        double nota = scanner.nextDouble();

        double aumento = 0;
        double percentual = 0;

        if (nota <= 2) {
            percentual = 0;
            aumento = 0;
        }

        if (nota > 2 && nota <= 4) {
            percentual = 5;
            aumento = salario * 0.05;
        }

        if (nota > 4 && nota <= 6) {
            percentual = 10;
            aumento = salario * 0.10;
        }

        if (nota > 6 && nota <= 8) {
            percentual = 15;
            aumento = salario * 0.15;
        }

        if (nota > 8 && nota <= 10) {
            percentual = 20;
            aumento = salario * 0.20;
        }

        double novoSalario = salario + aumento;

        System.out.println("Salário original: R$" + salario);
        System.out.println("Nota recebida: " + nota);
        System.out.println("Percentual de aumento: " + percentual + "%");
        System.out.println("Valor do aumento: R$" + aumento);
        System.out.println("Novo salário: R$" + novoSalario);

        scanner.close();
    }
}
