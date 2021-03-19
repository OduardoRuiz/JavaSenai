package ex02ANTIGO;

import br.senai.sp.info132.console.Programa;

public class Ex03 extends Programa {

	@Override
	public void inicio() {

		double Salario = leReal("Informe o Salario Aqui");

		double SalarioLiquido;

		if (Salario <= 300)

		{
			double reducao = Salario * 0.05;
			SalarioLiquido = Salario - reducao;
			escrevaL("Salario é igual a R$", SalarioLiquido);
}
		
		
		else if ( Salario >= 301 &&  Salario < 1200 ) {
			
			double reducao = Salario * 0.10;
			
			SalarioLiquido = Salario - reducao;
			
			escrevaL("Salario é igual a R$", SalarioLiquido);
			
			
		}
		
		else if ( Salario > 1200 ) {
			
		double reducao = Salario *0.15;
		
		SalarioLiquido = Salario - reducao;
		
		
		escrevaL("Salario é igual a  R$" , SalarioLiquido);
		
		
		
	}
} 
}
