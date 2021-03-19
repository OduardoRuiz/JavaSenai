package objetos.exemplos;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class CadasroDeContrato {
	public static void main(String[] args) {
		List<Contrato> cadastro = new ArrayList<>();

		String temp = JOptionPane.showInputDialog("Informe o nº do Contrato");
		while (!temp.equals("fim")) {
			int numero = Integer.parseInt(temp);

			String titulo = JOptionPane.showInputDialog("Informe o Título do Contrato");

			String descr = JOptionPane.showInputDialog("Informe a Descrição do Contrato");

			Contrato contrato = new Contrato();
			contrato.setNumero(numero);
			contrato.setTitulo(titulo);
			contrato.setDescricao(descr);
			
			cadastro.add(contrato);
			
			temp = JOptionPane.showInputDialog("Informe o nº do Contrato");
		}

//		Contrato[] cadastro2 = new Contrato[2];
		
//		for (int i = 0; i < cadastro2.length; i++) {
//			Contrato contrato = cadastro2[i];
//			msg += contrato + "\n";
//		}
//		for (Contrato contrato : cadastro2) {
//			msg += contrato + "\n";
//		}
//		
//		
//		for (int i = 0; i < cadastro.size(); i++) {
//			Contrato contrato = cadastro.get(i);
//			msg += contrato + "\n";
//		}
		
		String msg = "Lista dos Contratos Cadastrados\n\n";

		for (Contrato contrato : cadastro) {
			msg += contrato + "\n";
		}
		
		JOptionPane.showMessageDialog(null, msg);
	}
}
