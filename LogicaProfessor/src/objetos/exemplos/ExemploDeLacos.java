package objetos.exemplos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import objetos.gui.resposta.ex01.Fornecedor;

public class ExemploDeLacos {
	static String msg = "";
	
	public static void main(String[] args) {
		List<Fornecedor> cadastro = new ArrayList<>();
		cadastro.add(new Fornecedor("Fulano & Cia", "Rua  Bela Vista, 33"));
		cadastro.add(new Fornecedor("Parafusos da Vovô", "Rua São João, 33"));
		cadastro.add(new Fornecedor("FMC Filsan", "Rua S/N"));
		cadastro.add(new Fornecedor("IMB Impresa Mulanbeira de Makinas", "Rua Xicumgunha, 99"));
		

		for (int i = 0; i < cadastro.size(); i++) {
			Fornecedor obj = cadastro.get(i);
			if(obj.getNome().startsWith("P")) {
				msg += obj + "\n";
			}
		}
		System.out.println(msg);

		msg = "";
		for (Fornecedor obj : cadastro) {
			if(obj.getNome().startsWith("P")) {
				msg += obj + "\n";
			}
		}
		System.out.println(msg);

		msg = "";
		Iterator<Fornecedor> item = cadastro.iterator();
		while(item.hasNext()) {
			Fornecedor obj = item.next();
			if(obj.getNome().startsWith("P")) {
				msg += obj + "\n";
			}
		}
		System.out.println(msg);			
	}
}











