import java.util.Scanner;
public class exercicio16 {
    public static void main(String[] args) {

        Scanner notas = new Scanner(System.in);

        System.out.println("Digite a sua primeira nota: ");
        float nota1 = notas.nextFloat();

        System.out.println("Digite a sua segunda nota: ");
        float nota2 = notas.nextFloat();

        float media = (nota1 + nota2) / 2;


        if (media >= 5) {
        System.out.println("O aluno foi aprovado com média " + media);

        } else {
        System.out.println("Digite a sua terceira nota: ");
        float nota3 = notas.nextFloat();



        float menornota;
        if (nota1 < nota2) {
        menornota = nota1;
        } else {
        menornota = nota2;
        }


        if (menornota == nota1) {
            nota1 = nota3;
            } else {
            nota2 = nota3;
            }

            media = (nota1 + nota2) / 2;

            if (media >= 5) {
            System.out.println("O aluno foi aprovado com média " + media);
            } else {
            System.out.println("O aluno foi reprovado com média " + media);
            }

        }
    }
}