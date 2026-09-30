import javax.swing.JOptionPane;

public class exercicio13 {
    public static void main(String[] args) {


        String n1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
        float nmr1 = Float.parseFloat(n1);

        String n2 = JOptionPane.showInputDialog("Digite o segundo número: ");
        float nmr2 = Float.parseFloat(n2);

        String operador = JOptionPane.showInputDialog("Agora Digite o operador: ");


        float operacao;

        switch (operador) {
            case "+":
            operacao = nmr1 + nmr2;
            JOptionPane.showMessageDialog(null,"A soma dos números é: " + operacao);
            break;

            case "-":
            operacao = nmr1 - nmr2;
            JOptionPane.showMessageDialog(null,"A subtração dos números é:" + operacao);
            break;

            case "*":
            operacao = nmr1 * nmr2;
            JOptionPane.showMessageDialog(null,"A multiplicação dos números é: " + operacao);
            break;

            case "/":
            if (nmr2 == 0) {
            JOptionPane.showMessageDialog(null,"Não é possível dividir por 0");
            } else {
            operacao = nmr1 / nmr2;
            JOptionPane.showMessageDialog(null,"A divisão dos números é: " + operacao);
            }
            break;

            default:
            JOptionPane.showMessageDialog(null, "Operador inválido");
            break;
        }
    }
}
