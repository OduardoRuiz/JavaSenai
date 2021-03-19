package logica.ex06;

import br.senai.sp.info132.console.Programa;

public class Ex04 extends Programa {
	@Override
	public void inicio() {
		final int QUANTIDADE_DE_REGISTROS = 5;
		
		String[] nomes = new String[QUANTIDADE_DE_REGISTROS];
		double[] salarios = new double[QUANTIDADE_DE_REGISTROS];
		int ultimoRegistro = 0;
		
		String nome = leTexto("Informe o ", ultimoRegistro+1,"º nome");
		while(!nome.equalsIgnoreCase("fim")) {
			double salario = leReal("Informe o ", ultimoRegistro+1,"º salário");
			
			if(ultimoRegistro >= nomes.length) {
				String[] nomesNovos = new String[nomes.length + QUANTIDADE_DE_REGISTROS];
				double[] salariosNovos = new double[salarios.length + QUANTIDADE_DE_REGISTROS];
				
				for (int i = 0; i < nomes.length; i++) {
					nomesNovos[i] = nomes[i];
					salariosNovos[i] = salarios[i];
				}
				
				nomes = nomesNovos;
				salarios = salariosNovos;
			}
			
			nomes[ultimoRegistro] = nome;
			salarios[ultimoRegistro] = salario;
			
			ultimoRegistro++;
			nome = leTexto("Informe o ", ultimoRegistro+1,"º nome");
		}
		
		boolean hoveTroca;
		do {
			hoveTroca = false;
			for (int j = 0; j < ultimoRegistro -1; j++) {
				if(salarios[j] < salarios[j + 1]) {
					double aux = salarios[j];
					salarios[j] = salarios[j + 1];
					salarios[j + 1] = aux;
					
					String temp = nomes[j];
					nomes[j] = nomes[j + 1];
					nomes[j + 1] = temp;
					
					hoveTroca = true;
				}
			}
		} while(hoveTroca);

		
		escrevaL("Funcionário\tSalário");
		escrevaL("-------------\t---------");
		for (int i = 0; i < ultimoRegistro; i++) {
			escrevaL(nomes[i], "\t\t", salarios[i]);
		}
	}
}















