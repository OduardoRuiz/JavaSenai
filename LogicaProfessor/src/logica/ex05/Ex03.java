package logica.ex05;

import br.senai.sp.info132.console.Programa;

public class Ex03 extends Programa {
	@Override
	public void inicio() {
		int soma = 0;
		for (int i = 0; i < 5; i++) {
			int num = leInteiro("Informe o ", i + 1, "º nº");
			soma = soma + num;
		}
		escrevaL("A soma: ", soma, "\\nA média: ", soma / 5);
	}
}
