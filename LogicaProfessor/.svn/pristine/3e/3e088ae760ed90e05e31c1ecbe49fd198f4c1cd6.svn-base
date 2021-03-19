package logica.ex07;

import br.senai.sp.info132.console.Programa;

public class Ex02 extends Programa {
	@Override
	public void inicio() {
		int num = leInteiro("Informe um nº");

		escrevaL("O nº invertido é: ", inverte(num), " e o num ficou assim: ", num);
	}

	public int inverte(int num) {
		int inv = 0;
		
		while(num > 0) {
			inv = inv * 10 + num % 10;
			num = num / 10;
		}
		return inv;
	}
}
