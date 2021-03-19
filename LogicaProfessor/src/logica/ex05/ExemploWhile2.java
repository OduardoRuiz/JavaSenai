package logica.ex05;

import br.senai.sp.info132.console.Programa;

// Calcular um aumento de 5% no valor de 
// todos os produtos informados.
// Para finalizar o programa digite 0 (Zero)

public class ExemploWhile2 extends Programa {
	@Override
	public void inicio() {
		for(double preco = leReal("Informe o Preço do Produto");preco > 0;preco = leReal("Informe o Preço do Produto")) {
			double novoPreco = preco * 1.05;
			escrevaL("O novo Preço do Produto é de R$ ", novoPreco);
		}
		
	}
}
