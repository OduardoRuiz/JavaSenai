package logica.Ex06;

import br.senai.sp.info132.console.Programa;

public class Ex02 extends Programa {

	@Override
	public void inicio() {

		String[] nomes = new String[10];

		for (int i = 0; i < nomes.length; i++) {

			nomes[i] = leTexto("informe o nome");

		}

		String nomepesquisado = leTexto("informe nome ser pesquisado").toLowerCase();

		while (!nomepesquisado.equals("fim")) {
			boolean achou = false;

			for (int i = 0; i < nomes.length; i++) {
				if (nomes[i].equals(nomepesquisado)) {
					achou = true;
					break;
				}
			}
			escrevaL();
			if (achou) {
				escrevaL(" o nome ", nomepesquisado, "  foi encontrado");
			} else {
				escrevaL("o nome ", nomepesquisado, " Não foi encontrado");
			}

			nomepesquisado = leTexto("informe nome ser pesquisado");
		}

	}
}
