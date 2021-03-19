package logica.ex06;

import br.senai.sp.info132.console.Programa;

/*
Leia dez valores inteiros quaisquer e 
mostre os que são maiores que a média 
dos valores coletados em ordem crescente.
*/
public class Ex01 extends Programa {
	@Override
	public void inicio() {
		int[] valor = new int[10];
		
		// Cometa e soma os valores informados
		int soma = 0;
		for (int i = 0; i < valor.length; i++) {
			valor[i] = leInteiro("Informe o ",i+1,"º nº");
			soma += valor[i];
		}
		// Calcula a média dos valores somados
		double media = soma / 10.0;
		
		// Ordena a lista de valores em ordem crescente
		boolean hoveTroca;
		do {
			hoveTroca = false;
			for (int j = 0; j < valor.length -1; j++) {
				if(valor[j] > valor[j + 1]) {
					int aux = valor[j];
					valor[j] = valor[j+1];
					valor[j+1] = aux;
					hoveTroca = true;
				}
			}
		} while(hoveTroca);

		// apresenta os valores maiores que a média
		escrevaL("A média é: ", media, "\n");
		
		for (int i = 0; i < valor.length; i++) {
			if(valor[i] >= media) {
				escrevaL(valor[i]);
			}
		}
	}
}
