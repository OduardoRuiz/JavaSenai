package logica.ex07;

import br.senai.sp.info132.console.Programa;

public class Ex05 extends Programa {
	@Override
	public void inicio() {
		int num = leInteiro("Informe o nº");
		
		escrevaL("O fatorial do nº ", num , " é ", fat(num) );

	}

	/*
	   Função Fatorial: f(n) => n * f(n-1) para n > 1
	 */
	
	public int fat(int num) {
		if(num > 1)
			return num * fat(num - 1);
		return 1;
	}
}
