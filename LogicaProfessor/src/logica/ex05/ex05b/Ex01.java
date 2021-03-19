package logica.ex05.ex05b;

import br.senai.sp.info132.console.Programa;

public class Ex01 extends Programa {
	@Override
	public void inicio() {
		int qtd = 0;
		// Contante numérica que representa o maior valor
		// possível de ser armazenado numa variável do tipo inteiro
		// seu valor é: 2.147.483.647
		int oMenor = Integer.MAX_VALUE;  
		
		int num = leInteiro("Informe um nº");
		while(num > 0) {
			if(num < oMenor) {
				oMenor = num;
				qtd = 1;
			} else if( num == oMenor) {
				qtd++;
			}
			
			num = leInteiro("Informe um nº");
		}
		
		escrevaL("O Menor número é ", oMenor, " e foi informado ", qtd, " vezes");
	}
}
