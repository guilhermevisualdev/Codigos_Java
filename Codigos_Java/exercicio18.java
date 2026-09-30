import java.util.Scanner;

public class exercicio18 {
    public static void main(String[] args) {

        Scanner salarioscanner = new Scanner(System.in);

        System.out.println("Digite seu salário: ");
        double salario = salarioscanner.nextDouble();

        if (salario <= 1000) {
            System.out.println("O imposto sobre seu salário é de: 0%");
            System.out.println("O valor descontado é de: R$0.0");
            System.out.println("O valor líquido do seu salário é de: R$" + (salario));
        }

        if (salario > 1000 && salario <= 2000) {
            double porcentagem = 0.07;
            double imposto = salario * porcentagem;
            System.out.println("O imposto sobre seu salário é de: 7%");
            System.out.println("O valor descontado é de: R$" + imposto);
            System.out.println("O valor líquido do seu salário é de: R$" + (salario - imposto));
        }

        if (salario > 2000 && salario <= 3000) {
            double porcentagem = 0.15;
            double imposto = salario * porcentagem;
            System.out.println("O imposto sobre seu salário é de: 15%");
            System.out.println("O valor descontado é de: R$" + imposto);
            System.out.println("O valor líquido do seu salário é de: R$" + (salario - imposto));
        }

        if (salario > 3000 && salario <= 4000) {
            double porcentagem = 0.22;
            double imposto = salario * porcentagem;
            System.out.println("O imposto sobre seu salário é de: 22%");
            System.out.println("O valor descontado é de: R$" + imposto);
            System.out.println("O valor líquido do seu salário é de: R$" + (salario - imposto));
        }

        if (salario > 4000 && salario <= 5000) {
            double porcentagem = 0.29;
            double imposto = salario * porcentagem;
            System.out.println("O imposto sobre seu salário é de: 29%");
            System.out.println("O valor descontado é de: R$" + imposto);
            System.out.println("O valor líquido do seu salário é de: R$" + (salario - imposto));
        }
    }
}
