import java.util.Scanner;

public class Principal {

    static Pessoa[] pessoas = new Pessoa[10];
    static int count = 0;

    public static void inserir(Scanner sc) {
        if (count < 10) {
            System.out.println("Digite o id:");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Digite o nome:");
            String nome = sc.nextLine();

            System.out.println("Digite o salario:");
            double salario = sc.nextDouble();

            pessoas[count] = new Pessoa(id, nome, salario);
            count++;
        } else {
            System.out.println("Vetor cheio!");
        }
    }

    public static Pessoa maiorSalario() {
        if (count == 0) return null;

        Pessoa maior = pessoas[0];

        for (int i = 1; i < count; i++) {
            if (pessoas[i].getSalario() > maior.getSalario()) {
                maior = pessoas[i];
            }
        }
        return maior;
    }

    public static Pessoa menorSalario() {
        if (count == 0) return null;

        Pessoa menor = pessoas[0];

        for (int i = 1; i < count; i++) {
            if (pessoas[i].getSalario() < menor.getSalario()) {
                menor = pessoas[i];
            }
        }
        return menor;
    }

    public static Pessoa buscarPorId(int id) {
        for (int i = 0; i < count; i++) {
            if (pessoas[i].getId() == id) {
                return pessoas[i];
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n1 - Inserir pessoa");
            System.out.println("2 - Mostrar maior salario");
            System.out.println("3 - Mostrar menor salario");
            System.out.println("4 - Buscar por id");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    inserir(sc);
                    break;

                case 2:
                    Pessoa pMaior = maiorSalario();
                    if (pMaior != null)
                        System.out.println("Maior salario: " + pMaior + " | Salario: " + pMaior.getSalario());
                    else
                        System.out.println("Nenhuma pessoa cadastrada");
                    break;

                case 3:
                    Pessoa pMenor = menorSalario();
                    if (pMenor != null)
                        System.out.println("Menor salario: " + pMenor + " | Salario: " + pMenor.getSalario());
                    else
                        System.out.println("Nenhuma pessoa cadastrada");
                    break;

                case 4:
                    System.out.println("Digite o id:");
                    int id = sc.nextInt();
                    Pessoa p = buscarPorId(id);

                    if (p != null)
                        System.out.println("Encontrado: " + p + " | Salario: " + p.getSalario());
                    else
                        System.out.println("Pessoa nao encontrada");
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opcao invalida");
            }

        } while (opcao != 0);

        sc.close();
    }
}