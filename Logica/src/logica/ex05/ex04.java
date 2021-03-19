package logica.ex05;

import br.senai.sp.info132.console.Programa;

public class ex04 extends Programa  {

	@Override
	public void inicio() {
		
		int geral = 0 ;
		int maior = 0 ;
		int quantidade = leInteiro("informe a quantidade");
		for (int i = 0; i < quantidade ; i++) {
			
		geral = leInteiro("informe um numero") ;
		
		if ( geral > maior )
			
		maior = geral;
			
			
		}
		
		
		escrevaL("O maior é : " , maior );
		}
		
	}


