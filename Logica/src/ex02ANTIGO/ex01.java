package ex02ANTIGO;
import br.senai.sp.info132.console.Programa;

public class ex01 extends Programa { 
	
	@Override
	public void inicio() {
	
	int numero = leInteiro ("Informe um numero ! ");
    		
	while (numero != 0) {
	if (numero %2 == 0 ) { 
    	escrevaL("Este numero é par ");
    }
    else { escrevaL("Este numero é impar");

   
	}
	 numero = leInteiro ("Informe um numero ! ");
	 
	} 
}
}
