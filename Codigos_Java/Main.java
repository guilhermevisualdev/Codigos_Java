import java.util.ArrayList;
import java.util.Scanner;

class Produto {
    int id;
    String descricao;

    public Produto(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public String toString() {
        return "ID: " + id + " | Descrição: " + descricao;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Produto> lista = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o id:");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Digite a descricao:");
            String desc = sc.nextLine();

            lista.add(new Produto(id, desc));
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("Informe o índice para alterar:");
            int indice = sc.nextInt();
            sc.nextLine();

            if (indice >= 0 && indice < lista.size()) {
                System.out.println("Novo id:");
                int novoId = sc.nextInt();
                sc.nextLine();

                System.out.println("Nova descricao:");
                String novaDesc = sc.nextLine();

                lista.set(indice, new Produto(novoId, novaDesc));
            } else {
                System.out.println("Índice inválido!");
                i--;
            }
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("Informe o índice para excluir:");
            int indice = sc.nextInt();

            if (indice >= 0 && indice < lista.size()) {
                lista.remove(indice);
            } else {
                System.out.println("Índice inválido!");
                i--; 
            }
        }

        System.out.println("\nLista final:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Índice " + i + ": " + lista.get(i));
        }

        sc.close();
    }
}