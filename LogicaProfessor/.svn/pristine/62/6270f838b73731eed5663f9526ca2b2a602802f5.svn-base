package logica.ex06;

import br.senai.sp.info132.console.Programa;

/*
 * criar 2 vetores com 10 posições
 * leio o numero e gravo no 1º vetor os pares
 * gravo no 2º vetor os impares, mas controlando a posição
 * do último elemento de cada vetor distintamente
 * 
 * ordeno o 1º vetor em ordem crescente
 * ordeno o 2º vetor em ordem decrescente
 * 
 * e apresentar os valores
 */

/*
 * criar um único vetor
 * leio os numeros e armazeno neste vetor
 * 
 * ordeno crescente
 * imprime os pares
 * 
 * ordeno descrescente
 * imprime os impares
 */

/*
 * criar um único vetor
 * leio os numeros e armazeno neste vetor
 * 
 * ordeno crescente
 * imprime os pares
 *
 * imprime os impares
 */

public class Ex03 extends Programa {
	@Override
	public void inicio() {
		// Criar o vetor
		int[] num = new int[10];
		
		// Carregar com os nºs
		for (int i = 0; i < num.length; i++) {
			num[i] = leInteiro("Informe o ", i+1, "º nº");
		}
		
		// Ordenar o vetor
		boolean hoveTroca;
		do {
			hoveTroca = false;
			for (int j = 0; j < num.length -1; j++) {
				if(num[j] < num[j + 1]) {
					int aux = num[j];
					num[j] = num[j+1];
					num[j+1] = aux;
					hoveTroca = true;
				}
			}
		} while(hoveTroca);

		// Apresentar os pares em Ordem crescente
		escrevaL("Números pares em ordem crescente");
		for (int i = 0; i < num.length; i++) {
			if(num[i] % 2 == 0) {
				escreva(num[i], " ");
			}
		}
		
		// Apresentar os impares em Ordem decrescente
		escrevaL("\nNúmeros ímpares em ordem decrescente");
		for (int i = num.length -1; i >= 0 ; i--) {
			if(num[i] % 2 != 0) {
				escreva(num[i], " ");
			}
		}
	}
}
