package logica.ex06;

import br.senai.sp.info132.console.Programa;

public class ExemploVetor extends Programa {
	@Override
	public void inicio() {
		// Obtém o tamanho do vetor de preços o e inicializa 
		int qtd = leInteiro("Informe a quantidade de preços a serem cadastrados");
		
		double[] precos = new double[qtd];
		
		// Carrega a lista de preços
		double valor = leReal("Informe o Preço do Produto a ser cadastrado");
		int qtdPrecos = 0;
		while (valor > 0) {
			if(qtdPrecos >= precos.length) { // Acabou o espaço no vetor de Preços?
				// Expande o vetor de preços
				double[] novoPrecos = new double[precos.length + 5];
				for (int j = 0; j < precos.length; j++) {
					novoPrecos[j] = precos[j];
				}
				precos = novoPrecos;
			}
			
			precos[qtdPrecos] = valor;
			qtdPrecos++;
			
			valor = leReal("Informe o Preço do Produto a ser cadastrado");
		}
		
		// Obtém a taxa e o valor limite para aumento dos preços
		double taxa = leReal("Qual a taxa de aumento desejado");
		double limite = leReal("Até que valor esta taxa deve ser aplicada");
		
		// Aplica o aumento dos preços
		for (int j = 0; j < qtdPrecos; j++) {
			if(precos[j] <= limite) {
				precos[j] *= 1 + taxa / 100;
			}
		}
		
		// Ordena a lista de preços em ordem decrescente
		boolean hoveTroca;
		do {
			hoveTroca = false;
			for (int j = 0; j < qtdPrecos -1; j++) {
				if(precos[j] < precos[j + 1]) {
					double aux = precos[j];
					precos[j] = precos[j+1];
					precos[j+1] = aux;
					hoveTroca = true;
				}
			}
		} while(hoveTroca);
		
		// Apresenta a lista de preços atualizada
		escrevaL();
		for (int j = 0; j < qtdPrecos; j++) {			
			escrevaL("O novo preço é de R$", precos[j]);
		}
 	}
}
