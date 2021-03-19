package logica.ex04;

import br.senai.sp.info132.console.Programa;

public class Ex01 extends Programa {
	@Override
	public void inicio() {		
		int nota1 = leInteiro("Informe a 1ª nota");
		int nota2 = leInteiro("Informe a 2ª nota");
		int nota3 = leInteiro("Informe a 3ª nota");
		int nota4 = leInteiro("Informe a 4ª nota");
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4.0;
		
		escrevaL("A média: ", media);
		
		if(media >= 7) {
			escrevaL("Aprovado");
		} else {
			escrevaL("Reprovado");
		}
	}
}
