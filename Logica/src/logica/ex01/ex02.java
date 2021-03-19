package logica.ex01;

import br.senai.sp.info132.console.Programa;

public class ex02 extends Programa { 
	@Override 
	
	public void inicio () {
		int nota1 = leInteiro("Informe a 1 nota" );
		int nota2 = leInteiro("Informe a 2 nota" );
		int nota3 = leInteiro("Informe a 3 nota" );
		int nota4 = leInteiro("Informe a 4 nota" );
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		escrevaL("a media é de;", media ); } 
	}
