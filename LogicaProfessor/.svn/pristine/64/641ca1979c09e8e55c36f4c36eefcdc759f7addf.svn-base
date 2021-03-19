package logica.ex05.ex05a;

import br.senai.sp.info132.console.Programa;

public class Ex01 extends Programa {
	@Override
	public void inicio() {
		double soma = 0;
		int qtdProdutos = 0;
		double preco = leReal("Informe o preço do Produto");
		
		while(preco > 0) {
			soma += preco;
			qtdProdutos++;
			
			preco = leReal("Informe o preço do Produto");
		}
		
		escrevaL("A média para os preços informados é de R$ ", soma / qtdProdutos);
	}
}
