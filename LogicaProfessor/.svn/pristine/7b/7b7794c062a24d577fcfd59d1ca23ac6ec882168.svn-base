package logica.ex05;

import br.senai.sp.info132.console.Programa;

public class Ex02 extends Programa {
	@Override
	public void inicio() {
		int num1 = leInteiro("Informe o 1º nº");
		int num2 = leInteiro("Informe o 2º nº");
		
		if(num1 > num2) {
			int aux = num1;
			num1 = num2;
			num2 = aux;
		}
		
		for (int num = num1; num <= num2; num++)
			if (num % 2 != 0)
				escreva(String.format("%04d ", num));
	}
}
