import java.util.Scanner;

public class exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("A1 - Ruffles     R$ 3.50");
        System.out.println("A2 - Doritos     R$ 3.20");
        System.out.println("B1 - Prestígio   R$ 2.20");
        System.out.println("B2 - Galak       R$ 1.99");
        System.out.println("E1 - Coca-Cola   R$ 3.40");
        System.out.println("E2 - Guaraná     R$ 2.99");

        System.out.println("Digite o código do produto: ");
        String codigo = scanner.nextLine();

        double preco = 0;
        String produto = "";

        switch (codigo) {
            case "A1":
                produto = "Ruffles";
                preco = 3.50;
                break;
            case "A2":
                produto = "Doritos";
                preco = 3.20;
                break;
            case "B1":
                produto = "Prestígio";
                preco = 2.20;
                break;
            case "B2":
                produto = "Galak";
                preco = 1.99;
                break;
            case "E1":
                produto = "Coca-Cola";
                preco = 3.40;
                break;
            case "E2":
                produto = "Guaraná";
                preco = 2.99;
                break;
            default:
                System.out.println("Produto não encontrado.");
                break;
        }

        System.out.println("Você escolheu: " + produto + " - R$" + preco);
        System.out.println("Insira o valor (notas de 2, 5, 10, 20, 50, 100 ou 200): ");
        double valor = scanner.nextDouble();

        if (valor != 2 && valor != 5 && valor != 10 && valor != 20 &&
            valor != 50 && valor != 100 && valor != 200) {
            System.out.println("Nota inválida! Dinheiro devolvido.");

        } else if (valor < preco) {
            System.out.println("Valor insuficiente! Dinheiro devolvido.");

        } else {
            double troco = valor - preco;
            System.out.println("Produto entregue: " + produto);
            System.out.println("Troco: R$" + troco);
            System.out.println("Obrigado por comprar!");
        }
    }
}
