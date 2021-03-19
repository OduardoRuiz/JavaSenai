package logica.Ex04;


import br.senai.sp.info132.console.Programa;

public class ex02 extends Programa  {

	@Override
	public void inicio() {
		
		
		double a = leReal("Informe o 1 lado ");
		double b = leReal("informe o 2 lado");
		double c = leReal("Informe o 3 lado");
		
		
		boolean equilatero = a == b && b == c ;
		boolean escaleno = a != b && a != c && b != c;
		boolean isosceles2 = a == b || a == c || b == c;
		
		
		
		if (equilatero) { 
			escrevaL (" equilatero" );
					}
		
		else if (escaleno) {
			escrevaL("escaleno");
			
		}
		
		else if (isosceles2) { 
			
			escrevaL ("isosceles2");
			
		
		}
		
		
		else {
			
			escrevaL ("numero nao é compativel");
					
		}
		
		
		
		
		
		
		
		
		
	}
	}