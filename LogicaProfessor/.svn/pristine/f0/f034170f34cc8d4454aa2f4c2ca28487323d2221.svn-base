package logica.ex05;

import br.senai.sp.info132.console.Programa;

public class Ex05 extends Programa {
	@Override
	public void inicio() {
		double salario = leReal("Informe o Salário");
		
		
		while(salario > 0) {
			escreva("O Salário com aumento é de R$ ");
			
			if(salario <= 500) {
				escrevaL(salario * 1.2);
			} else {
				escrevaL(salario * 1.1);
			}
			
			salario = leReal("Informe o Salário");
		}
	}
}
