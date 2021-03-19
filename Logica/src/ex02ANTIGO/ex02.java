package ex02ANTIGO;

import br.senai.sp.info132.console.Programa;

public class ex02 extends Programa {

	@Override
	public void inicio() {
		
		int A = leInteiro("Informe o Valor de A " );
		int B = leInteiro("Informe o valor de B ");
		
		int resultado = (A+B);
		
		if (resultado %2 == 0) { 
		 escrevaL("o numero é divisivel , pois  ",  A  , " dividido por  " ,  B  ,  " é  " ,  A/B , " e o resto é " , A%B );
		}
		else { escrevaL("o numero NAO é divisivel , pois  ",  A  , " dividido por  " ,  B  ,  " é  " ,  A/B , " e o resto é " , A%B);
		
		
		}
	} 

}
