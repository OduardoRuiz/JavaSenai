package logica.ex05;

import br.senai.sp.info132.console.Programa;

// Calcular um aumento de 5% no valor de 
// todos os produtos informados.
// Para finalizar o programa digite 0 (Zero)

public class ExemploWhile extends Programa {
	@Override
	public void inicio() {
		double preco = leReal("Informe o Preço do Produto");
		
		while(preco > 0) {
			double novoPreco = preco * 1.05;
			escrevaL("O novo Preço do Produto é de R$ ", novoPreco);
			
			preco = leReal("Informe o Preço do Produto");
		}
		
	}
}
