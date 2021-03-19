package logica.ex04;

import br.senai.sp.info132.console.Programa;

public class Ex01b extends Programa {
	@Override
	public void inicio() {
		double media = 0;
		int i = 1;
		for (; i <= 4; i++) {
			media += leInteiro("Informe a ",i,"ª nota");
		}
		media /= i;
		
		escrevaL("A média: ", media);
		
		if(media >= 7) {
			escrevaL("Aprovado");
		} else {
			escrevaL("Reprovado");
		}
	}
}
