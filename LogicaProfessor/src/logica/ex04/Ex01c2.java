package logica.ex04;

import br.senai.sp.info132.console.Programa;

public class Ex01c2 extends Programa {
	@Override
	public void inicio() {
		double media = 0;
		int i = 1;
		while (i <= 4) {
			media += leInteiro("Informe a ",i++,"ª nota");
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
