package logica.ex07;

import br.senai.sp.info132.console.Programa;

public class Hanoi extends Programa {
	@Override
	public void inicio() {
		int num = leInteiro("Informe um nº");
		while(num > 0) {
			escrevaL("o nº de passos para resolvar a torre de hanoi com ", 
					num, " discos é: ", hanoi2(num));
			
			num = leInteiro("Informe um nº");
		}
	}
	
	public int hanoi(int n) {
		if(n > 1) 
			return 2 * hanoi(n - 1) + 1;
		return 1;
	}
	
	/*
	
	f(n) => 2 * f(n-1) + 1
	
	f(5) => 2 * (2 * (2 * (2 * 1 + 1) + 1) + 1) + 1
	
	*/
	public int hanoi2(int n) {
		int total = 1;
		for (int num = 1; num < n;num++) {
			total = 2 * total + 1;
		}
		return total;
	}
}


