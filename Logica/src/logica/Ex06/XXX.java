package logica.Ex06;

import br.senai.sp.info132.console.Programa;

public class XXX extends Programa {
	@Override
	public void inicio() {
		double[] qtd = new double[10];

		for (int i = 0; i < qtd.length; i++) {
			qtd[i] = leReal("informe o valor");
		}

		escrevaL();
		for (int i = 0; i < qtd.length; i++) {
			escrevaL(qtd[i]);
		}
	}
}
