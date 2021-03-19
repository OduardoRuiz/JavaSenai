package logica.ex05;

import br.senai.sp.info132.console.Programa;

public class ExemploFor extends Programa {
	@Override
	public void inicio() {
		for(int x = 1;x <= 10;x++) {
			escreva(String.format("%02d ", x));
		}
		escrevaL();
		for(int x = 10;x >= 1;x--) {
			escreva(String.format("%04d ", x));
		}
	}
}
