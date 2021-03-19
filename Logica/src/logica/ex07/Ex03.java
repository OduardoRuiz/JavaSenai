package logica.ex07;

import br.senai.sp.info132.console.Programa;

public class Ex03 extends Programa {

	@Override
	public void inicio() {
		int multiplica = 0;
		int conta = leInteiro("Informe o Numero da conta");

		int x = resultado(conta);

		int[] somaconta = new int[6];

		
		
		for (int i =  somaconta.length; i > 0; i--) {

          
	       x = somaconta[i-1] %10;
		   somaconta[i] = somaconta[i] /10; 
		   
		   
		}
	
		
		for (int i = 0; i < somaconta.length; i++) {

			multiplica += somaconta[i] * i + 1;

		}

		escrevaL(multiplica);

	}

	public int inverso(int num) {

		int inv = 0;

		while (num > 0) {
			inv = inv * 10 + num % 10;

			num = num / 10;
		}
		return inv;
	}

	public int resultado(int soma) {

		int resultado = inverso(soma) + soma;
		return resultado;

	}

}

/*
 * somaconta[6];
 * 
 * sc[0] = 0 | sc[1] = 0 | sc[2] = 0 | sc[3] = 0 |sc[4] = 0 | sc[5] = 0
 * 
 * 1 1 3 3 3 0
 * 
 * for (int i = 0; i < somaconta.length; i++) {
 * 
 * multiplica += somaconta[i] * i+1 ;
 * 
 * }
 * 
 * multiplica = 39;
 * 
 * 
 * for (int i = somaconta.length; i > 0; i--)
 * 
 * i - 1;
 * 
 * somaconta[i-1] = resultado % 10; 
 * resultado = resultado / 10;
 * 
 * 
 * 
 * }
 * 
 * 
 */

