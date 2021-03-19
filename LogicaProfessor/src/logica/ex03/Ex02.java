package logica.ex03;

import br.senai.sp.info132.console.Programa;

public class Ex02 extends Programa {
	@Override
	public void inicio() {
		int num1 = leInteiro("Informe o nº");
		
		if(num1 % 2 == 0) {
			escrevaL("É par");
		} else {
			escrevaL("É Impar");
		}
	}
}
