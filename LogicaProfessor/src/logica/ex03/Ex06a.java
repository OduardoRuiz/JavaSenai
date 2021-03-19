package logica.ex03;

import br.senai.sp.info132.console.Programa;

public class Ex06a extends Programa {
	@Override
	public void inicio() {
		int idade = leInteiro("Informe a sua idade");
		
		String situacao;
		
		if(idade <= 10) {
			situacao = "Infantil";
		} else if(idade <= 15) {
			situacao = "Infanto";
		} else if(idade <= 18) {
			situacao = "Juvenil";
		} else {
			situacao = "Adulto";
		}
		
		escreva("Sua Classificação é: ", situacao);

	}
}
