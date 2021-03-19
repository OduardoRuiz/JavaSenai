package logica.ex07;

import br.senai.sp.info132.console.Programa;

public class Ex04 extends Programa {
	@Override
	public void inicio() {
		int num = leInteiro("Informe o nº");
		
		tabuada(num);
	}

	public void tabuada(int num) {
		for (int i = 1; i <= 10; i++) {
			escrevaL(num, " x ", i, " = ", num * i);
		}
	}
}
