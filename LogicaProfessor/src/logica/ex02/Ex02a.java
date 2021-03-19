package logica.ex02;

import br.senai.sp.info132.console.Programa;

public class Ex02a extends Programa {
	@Override
	public void inicio() {
		int num = leInteiro("Informe um nº");
		int inv = 0;
		
		while(num > 0) {
			inv = inv * 10 + num % 10;
			num = num / 10;
		}

		escrevaL("O nº invertido é: ", inv, " e o num ficou assim: ", num);
	}
}
