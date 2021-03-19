package logica.ex05;

import br.senai.sp.info132.console.Programa;

// Listar os nomes dos Colegas que tem a 1ª letra do nome começando em An.


public class ExemploWhileNome extends Programa {
	@Override
	public void inicio() {
		String nome = leTexto("Informe o Nome do Colega");
		
		while(!nome.isEmpty() && !nome.toLowerCase().equals("sair")) {
			if(nome.startsWith("An")) {
				escrevaL("> ", nome);
			}
			
			nome = leTexto("Informe o Nome do Colega");
		}
		
	}
}
