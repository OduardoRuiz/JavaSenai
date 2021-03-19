package logica.ex05.ex05b;

import br.senai.sp.info132.console.Programa;

/*
 	5! => 5 * 4 * 3 * 2 * 1
 		  5 * (5-1)
 			 4 * (4-1)
 			      3  * (3-1)
    n! = f(n * (n-1))	
 */
public class Ex04do extends Programa {
	@Override
	public void inicio() {
		int num = leInteiro("Informe o nº");
		
		int fat = 1;
		int i = 1;
		
		do {
			fat *= i++;
			escrevaL("f -> ", fat);
		} while (i <= num);
		
		escrevaL("O fatorial de ", num, " é ", fat);
	}
}
