package logica.ex05;

import br.senai.sp.info132.console.Programa;

public class ex01 extends Programa  {

	@Override
	public void inicio() {
		
		for(int x = 2;x <= 1000; x++ ) {
			
			escreva(String.format("%02d ", x++));
		
	}

}
}