package logica.ex05;

import br.senai.sp.info132.console.Programa;

public class Ex04a extends Programa {
	@Override
	public void inicio() {
		int qtd = leInteiro("Informe a Quantidade de nºs a serem lidos");

		if(qtd > 0) {
			int num = leInteiro("Informe o 1º nº");
			int oMaior = num;
			
			for (int i = 1; i < qtd; i++) {			
				if(num > oMaior) {
					oMaior = num;
				}
				
				num = leInteiro("Informe o ", i + 1, "º nº");
			}
			
			escrevaL("O Maior nº é: ", oMaior);
		} else {
			escrevaL("O Maior nº não pode ser identificado");
		}
	}
}
