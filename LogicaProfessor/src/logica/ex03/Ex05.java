package logica.ex03;

import br.senai.sp.info132.console.Programa;

public class Ex05 extends Programa {
	@Override
	public void inicio() {
		int num1 = leInteiro("Informe o 1º nº");
		int num2 = leInteiro("Informe o 2º nº");
		
		if(num1 > num2) {
			escrevaL(num2, " ", num1);
		} else {
			escrevaL(num1, " ", num2);
		}
	}
}
