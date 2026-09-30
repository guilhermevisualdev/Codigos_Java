import javax.swing.JOptionPane;

public class Principal {

	private final static String MENU = 
			"----------Agenda----------- \n"
			+ "1 -   Inserir Contato \n"
			+ "2 -   Alterar Contato \n"
			+ "3 -   Excluir Contato \n"
			+ "4 -   Pesquisar Contato por Id \n"
			+ "5 -   Listar Contatos \n"
			+ "6 -   Sair       \n";
	
	
	public static void main(String[] args) {
		Contato listaContato[] = new Contato[50];
		int indice = 0;
		String opcao = ""; 
		while(!opcao.equals("6")) {
			opcao = JOptionPane.showInputDialog(MENU);
			switch(opcao) {
				case "1":
					Contato contato = new Contato();
					contato.setId(indice);
					contato.setNome(JOptionPane.showInputDialog("Digite o Nome"));
					contato.setTelefone(JOptionPane.showInputDialog("Digite o Telefone"));
					contato.setEmail(JOptionPane.showInputDialog("Digite o Email"));
					lista.set(contato.getId(), contato);
					indice++;
					break;
				case "2":
					contato = new Contato();
					contato.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o indice")));
					contato.setNome(JOptionPane.showInputDialog("Digite o Nome"));
					contato.setTelefone(JOptionPane.showInputDialog("Digite o Telefone"));
					contato.setEmail(JOptionPane.showInputDialog("Digite o Email"));
					listaContato[contato.getId()] = contato;
					break;
				case "3":
					int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o indice"));
					listaContato[id] = null;
					for(int i = id; i < indice; i++) {
						listaContato[id] = listaContato[id + 1];
					}
					listaContato[indice] = null;
					indice--;
					break;
				case "4":
					id = Integer.parseInt(JOptionPane.showInputDialog("Digite o indice"));
					JOptionPane.showMessageDialog(null, listaContato[id]);
					break;
				case "5":
					String resultado = "";
					for(Contato aux: lista)
						if(aux != null)
							resultado += aux + "\n";
					JOptionPane.showMessageDialog(null, resultado);
					break;
				case "6":
					break;
				default:
					JOptionPane.showMessageDialog(null,"Opcao foi inválida");
			}
			
			
		}
	}

}
