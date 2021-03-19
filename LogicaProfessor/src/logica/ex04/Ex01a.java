package logica.ex04;

import br.senai.sp.info132.console.Programa;

public class Ex01a extends Programa {
	@Override
	public void inicio() {
		double media = 0;
		for (int i = 1; i <= 4; i++) {
		  //media = media + leInteiro("Informe a ",i,"ª nota");
			media += leInteiro("Informe a ",i,"ª nota");
		}
	  //media = media / 4;
		media /= 4;
		
		escrevaL("A média: ", media);
		
		if(media >= 7) {
			escrevaL("Aprovado");
		} else {
			escrevaL("Reprovado");
		}
	}
}
