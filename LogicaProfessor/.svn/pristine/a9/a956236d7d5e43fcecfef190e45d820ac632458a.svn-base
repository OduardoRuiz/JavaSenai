package logica.ex04;

import br.senai.sp.info132.console.Programa;

public class Ex03 extends Programa {
	@Override
	public void inicio() {
		int a = leInteiro("Informe o valor A");
		int b = leInteiro("Informe o valor B");
		int c = leInteiro("Informe o valor C");

		double delta = Math.pow(b, 2) - 4 * a * c;
		
		if(delta >= 0) {
			escrevaL("x': ", (int)( (-b + Math.sqrt(delta)) / 2 * a ) );
			escrevaL("x\": ",(int)( (-b - Math.sqrt(delta)) / 2 * a ) );
		} else {
			escrevaL("A Raiz é indeterminada");
		}
	}
}
