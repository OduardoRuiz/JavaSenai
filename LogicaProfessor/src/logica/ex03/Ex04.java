package logica.ex03;

import br.senai.sp.info132.console.Programa;

/*

	sal até    299 desconto de  5%
	sal até   1200 desconto de 10%
	sal acima 1200 desconto de 15%

*/

public class Ex04 extends Programa {
	@Override
	public void inicio() {
		double salBruto = leReal("Informe o Salário");
		
		double salLiquido;
		
		if(salBruto < 300) {
			salLiquido = salBruto - salBruto * 0.05;
		} else if(salBruto <= 1200) {
			salLiquido = salBruto * 0.9;
		} else {
			salLiquido = salBruto - salBruto * 15 / 100;
		}
		
		escrevaL("O Salário Líquido é de R$ ", salLiquido);
	}
}
