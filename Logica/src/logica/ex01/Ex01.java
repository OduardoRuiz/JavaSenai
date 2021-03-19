package logica.ex01;

import br.senai.sp.info132.console.Programa;

public class Ex01 extends Programa {
	public void inicio() {
		int num1 = leInteiro("Informe um 1º nº");
		int num2 = leInteiro("Informe um 2º nº");
		
		escrevaL(num1, " elevado a ", num2 , " é igual a ", Math.pow(num1, num2));
	}
}
