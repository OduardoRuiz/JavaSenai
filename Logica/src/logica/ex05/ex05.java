package logica.ex05;

import br.senai.sp.info132.console.Programa;

public class ex05 extends Programa  {

	@Override
	public void inicio() {
		
		double salario = leReal("informe o salario , ou digite 0 para sair R$");
		
		
		while (salario > 0) 
		{
			double novosalario = salario *1.20 ;
			
			escrevaL("o salario com aumento é R$", novosalario);
			
			
			salario = leReal("informe o salario R$");
			
			 if ( salario >= 500)
				
			{
				 novosalario = salario *1.10 ;
				
				escrevaL("o salario com aumento é R$", novosalario);
				
				
				salario = leReal("informe o salario R$");
			}
			
			
			
			
			
			if ( salario <=0) {
				break;
				
		
			}
			}
		 
		}
	}


