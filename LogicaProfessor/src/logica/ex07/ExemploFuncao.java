package logica.ex07;

import br.senai.sp.info132.console.Programa;

public class ExemploFuncao extends Programa {
	@Override
	public void inicio() {
		double media = calcularMedia();
		escrevaL("A média: ", media);
		
		escrevaL(estaAprovado(media) ? "A" : "Re","provado");
	}

	// Obtém 4 notas e retorna a média aritmética
	public double calcularMedia() {
		double media = 0;
		for (int i = 1; i <= 4; i++) {
			media += leInteiro("Informe a ",i,"ª nota");
		}
		media /= 4;
		
		return media;
	}

	// Determina a situação escolar com a média informada
	public boolean estaAprovado(double mediaEscolar) {
		return mediaEscolar >= 7;
	}
}
