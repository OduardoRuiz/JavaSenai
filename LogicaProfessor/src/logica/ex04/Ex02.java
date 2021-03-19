package logica.ex04;

import br.senai.sp.info132.console.Programa;

public class Ex02 extends Programa {
	@Override
	public void inicio() {
		int a = leInteiro("Informe o lado A");
		int b = leInteiro("Informe o lado B");
		int c = leInteiro("Informe o lado C");
		
		if(a +b > c && a + c > b && b + c > a) { // verifica se as retas formam um triângulo
			if(a == b && b == c) {
				escrevaL("Eqüilátero");
			} else if(a != b && a != c && b != c) {
				escrevaL("Escaleno");
			} else /* if(a == b || a == c || b == c) */ {
				escrevaL("Isósceles");
			}
		}  else {
			escrevaL("Estas retas não formam um triângulo");
		}
	}
}
