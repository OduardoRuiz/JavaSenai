package logica.ex06;

import br.senai.sp.info132.console.Programa;

public class Ex02 extends Programa {
	@Override
	public void inicio() {
		String[] lista = new String[10];
		
		for (int i = 0; i < lista.length; i++) {
			lista[i] = leTexto("Informe o ",i+1,"º Nome");
		}
		
		String nome = leTexto("\nInforme o nome a ser pesquisado");
		while(!nome.equalsIgnoreCase("fim")) {
			// Assume que não foi encontrado o nome na lista
			boolean encontrou = false;		// <== indica um estado
			for (int i = 0; i < lista.length; i++) {
				if(nome.equalsIgnoreCase(lista[i])) {
					encontrou = true;
					break;
				}
			}
			
			escreva("O nome: ", nome);
			if(!encontrou) {
				escreva(" não");
			}
			escrevaL(" foi encontrado");
			
			nome = leTexto("\nInforme o nome a ser pesquisado");
		}
	}
}
