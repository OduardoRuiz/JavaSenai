package logica.Ex04;

import br.senai.sp.info132.console.Programa;

public class ex03 extends Programa  {

	@Override
	public void inicio() {
		
		
    double a = leReal("informe o valor de a ");
    
    double b = leReal("Informe o valor de b ");
    
    double c = leReal("Informe o valor de c ");
    
    
	double x1;
	double x2;
	double delta;
	
	delta = ( Math.pow ( b,2) - 4 * a * c );
	if (delta >= 0) {
		
	}
	else { 
		
		escrevaL("raiz interdeminada");
	}
	
	x1 = ( (-b + Math.sqrt (delta) ) /2 * a ) ;
	
	x2 = ( (-b - Math.sqrt ( delta) ) /2 * a  );
	
	
	escrevaL("x' " , x1);
	
	escrevaL(" x\" " , x2 );
	
	
	
	
	
	
	
	
	}
	}
