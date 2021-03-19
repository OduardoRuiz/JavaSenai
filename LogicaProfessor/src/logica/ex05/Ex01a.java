package logica.ex05;

import br.senai.sp.info132.console.Programa;

public class Ex01a extends Programa {
	/*
		É possível declarar e inicializar inúmeras variáveis de um mesmo Tipo
		para ista é necessário separar a declaração de cada variável com a
		vírgula (,)
		Ex.:
		
		int num = 2, col = 0;
		
		double valor, preco;
		
		valor = preco = 0;
		
	 */
	
	
	@Override
	public void inicio() {
		for (int num = 2, col = 1; num <= 1000; col++, num+=2) {
			if(col % 20 == 0) {
				escrevaL(String.format("%04d ", num));
			} else {
				escreva(String.format("%04d ", num));
			}
		}
	}
}
