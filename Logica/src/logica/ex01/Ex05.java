package logica.ex01;

import br.senai.sp.info132.console.Programa;

public class Ex05 extends Programa {

	@Override
	public void inicio() { 
	int numero = leInteiro("digite o numero");
	
	 int unidade = numero%10;
	 int dezena  = numero/10;
     dezena = dezena%10;
	 int centena = numero/100;
	 
	 numero = ( unidade*100 + dezena*10 + centena );
	 
	 escrevaL(numero);
	 
	 
	 
		
	}
	
}
