import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {

        Scanner nota = new Scanner(System.in);

        System.out.println("Digite a nota: ");
        float nota1 = nota.nextFloat();

        if (nota1 >= 5)
        System.out.println("Aluno Aprovado!");
        else
        System.out.println("Aluno Reprovado!");

    }
}
