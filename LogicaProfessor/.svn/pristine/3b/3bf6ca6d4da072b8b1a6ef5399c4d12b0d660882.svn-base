package logica.ex05;

import br.senai.sp.info132.console.Programa;

public class Ex04 extends Programa {
	@Override
	public void inicio() {
		int qtd = leInteiro("Informe a Quantidade de nºs a serem lidos");
		int oMaior = 0;
		
		for (int i = 0; i < qtd; i++) {
			int num = leInteiro("Informe o ", i + 1, "º nº");
			
			if(num > oMaior) {
				oMaior = num;
			}
		}
		
		escrevaL("O Maior nº é: ", oMaior);
	}
}
