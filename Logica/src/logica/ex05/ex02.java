package logica.ex05;

import br.senai.sp.info132.console.Programa;

public class ex02 extends Programa {

	@Override
	public void inicio() {

		int a = leInteiro("informe o primeiro numero");

		int b = leInteiro("informe o segundo numero");

		for (int i = a; i <= b; i++) {

			if (i % 2 != 0) {
				
				escreva(String.format("%04d ", i));
			}
		}

	}
}
