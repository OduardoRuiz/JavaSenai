package logica.ex05;

import br.senai.sp.info132.console.Programa;

public class ex03 extends Programa  {

	@Override
	public void inicio() {
	
	int soma = 0;
	int somadosvalores = 0 ;
	int media = 0 ;
	for (int i = 1; i < 6; i++) {
		
		soma = leInteiro("informe um numero");
		
		somadosvalores = somadosvalores + soma ;
		
		media = somadosvalores /5;
		
		

		
	
		
	}
		
		
		
		escrevaL(" a soma é : " ,somadosvalores);
		
		escrevaL(" a media é : " , media);
		
		
	}

}
