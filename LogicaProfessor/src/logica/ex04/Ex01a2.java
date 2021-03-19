package logica.ex04;

import br.senai.sp.info132.console.Programa;

public class Ex01a2 extends Programa {
	@Override
	public void inicio() {
		double media = 0;
		for (int i = 1; i <= 4; i++) {
			media += leInteiro("Informe a ",i,"ª nota");
		}
		media /= 4;
		
		escrevaL("A média: ", media);
		
		if(media >= 7) {
			escrevaL("Aprovado");
		} else {
			escrevaL("Reprovado");
		}
	}
}
