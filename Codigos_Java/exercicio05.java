import javax.swing.JOptionPane;

public class exercicio05 {
    public static void main (String[] args) {


        String palavra1 = JOptionPane.showInputDialog(null,"Digite uma palavra: ");

        String palavra2 = JOptionPane.showInputDialog(null,"Digite mais outra palavra: ");
        
        JOptionPane.showMessageDialog(null, "Você Digitou as palavras: " + palavra1 + palavra2);

    }
}



// se for usar JOptionPane não precisa usar scanner!