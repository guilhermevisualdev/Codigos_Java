import javax.swing.JOptionPane;

public class exercicio10 {
    public static void main(String[] args) {


        String nota = JOptionPane.showInputDialog("Digite a nota: ");
        float nota1Float = Float.parseFloat(nota);

        if (nota1Float >= 5)
        JOptionPane.showMessageDialog(null,"Aluno Aprovado!");
        else
        System.out.println("Aluno Reprovado!");

    }
}
