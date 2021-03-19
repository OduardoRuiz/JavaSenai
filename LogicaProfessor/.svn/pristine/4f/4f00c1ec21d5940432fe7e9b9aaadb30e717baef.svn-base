package logica.ex05.ex05b;

import br.senai.sp.info132.console.Programa;

public class Ex02 extends Programa {
	@Override
	public void inicio() {
		int maior1 = 0;
		int maior2 = 0;
		int maior3 = 0;
		
		int num = leInteiro("Informe um nº");
		
		while(num >0) {
			if(num >= maior1) {
				if(num > maior1 ) {
					maior3 = maior2;
					maior2 = maior1;
					maior1 = num;
				}
			} else if(num >= maior2) {
				if(num > maior2) {
					maior3 = maior2;
					maior2 = num;
				}
			} else {
				maior3 = num;
			}
			escrevaL("o 1º maior nº é ", maior1);
			escrevaL("o 2º maior nº é ", maior2);
			escrevaL("o 3º maior nº é ", maior3, "\n");
			
			num = leInteiro("Informe um nº");
		}
		escrevaL("o 1º maior nº é ", maior1);
		escrevaL("o 2º maior nº é ", maior2);
		escrevaL("o 3º maior nº é ", maior3);
	}
}
