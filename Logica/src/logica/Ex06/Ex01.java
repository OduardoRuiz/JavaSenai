package logica.Ex06;

import br.senai.sp.info132.console.Programa;

public class Ex01 extends Programa {

	@Override
	public void inicio() { 

		
		double[] qtd = new double[10];
		int media = 0;

		for (int i = 0; i < qtd.length; i++) {
			qtd[i] = leReal("informe o valor");
			media += qtd[i];
		}
		media /= 10.0;

		escrevaL();

		boolean hoveTroca;
		do {
			hoveTroca = false;
			for (int j = 0; j < qtd.length -1; j++) {
				if(qtd[j] > qtd[j + 1]) {
					double aux = qtd[j];
					qtd[j] = qtd[j+1];
					qtd[j+1] = aux;
					hoveTroca = true;
				} 
			}
		} while(hoveTroca);
		
		escrevaL();
		escrevaL(" a media é ",media);
		for (int i = 0; i < qtd.length; i++) {

			if (qtd[i] > media) {
				escrevaL(qtd[i]);
			}

			// so falta colocar em ordem crescente //

		}
		}
		
	}

		
