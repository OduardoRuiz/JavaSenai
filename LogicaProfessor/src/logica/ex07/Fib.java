package logica.ex07;

import br.senai.sp.info132.console.Programa;

public class Fib extends Programa {
	@Override
	public void inicio() {
		int num = leInteiro("Informe o nº da semana");
		while(num > 0) {
			escrevaL("o nº de casais de coelhos na ",num ,"ª semana na seqüência de fibonacci ", 
					"é: ", f(num));
			
			num = leInteiro("Informe o nº da semana");
		}
	}
	
	public int f(int n) {
		if(n > 2)
			return f(n - 2) + f(n - 1);
		return 1;
	}
}
