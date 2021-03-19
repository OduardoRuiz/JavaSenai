package logica.ex07;

import br.senai.sp.info132.console.Programa;

public class Ex01 extends Programa {

	@Override
	public void inicio() {

		int num = leInteiro("Informe um numero  ");

		while (num != 0) {

			
			escrevaL("o numero  ", num, " é ", imparOuPar(num) ? "impar" : "par");

		
			num = leInteiro("Informe um numero  ");

		}
			}
	

	public boolean imparOuPar(int n) {

		if (n % 2 == 0)

			return false;
		return true;

	}
}

// if ( num = % 2 == 0);

// else (num = % 2 !=0 );