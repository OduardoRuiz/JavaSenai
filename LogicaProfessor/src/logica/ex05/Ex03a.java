package logica.ex05;

import br.senai.sp.info132.console.Programa;

public class Ex03a extends Programa {
	@Override
	public void inicio() {
		final int TOTAL_NUMEROS = 5; // Exemplo de declaração de constante
		int soma = 0;
		
		for (int i = 0; i < TOTAL_NUMEROS; i++) {
			soma += leInteiro("Informe o ", i + 1, "º nº");
		}
		
		escrevaL("A soma: ", soma);
		escrevaL("A média: ", soma / TOTAL_NUMEROS);
	}
}
