package logica.ex02;

import br.senai.sp.info132.console.Programa;

public class Ex03a extends Programa {
	@Override
	public void inicio() {
		//               0    1   2   3  4  5  6
		int[] notas = { 100, 50, 20, 10, 5, 2 ,1 };
			
		int saque = leInteiro("Informe o valor do Saque");
	
		for (int valor = 0; valor < notas.length; valor++) {
			escrevaL("Notas de ", notas[valor] ,": ", saque / notas[valor]);
			saque = saque % notas[valor];
		}		
	}
}	
