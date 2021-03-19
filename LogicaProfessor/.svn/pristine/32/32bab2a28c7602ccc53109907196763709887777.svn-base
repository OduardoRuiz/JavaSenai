package logica.ex07;

import br.senai.sp.info132.console.Programa;

public class Ex03 extends Programa {
	@Override
	public void inicio() {
		int conta = leInteiro("Informe o nº da conta");

		escrevaL("O dígito verificador da conta ",conta , " é: ", digito(conta));
	}

	private int digito(int conta) {
		int soma = conta + inverte(conta);
		int dig = 0;
		
		for (int i = 6; i > 0; i--) {
			dig += i * soma % 10;
			soma = soma / 10;
		}
		return dig % 10;
	}

	public int inverte(int num) {
		int inv = 0;
		
		while(num > 0) {
			inv = inv * 10 + num % 10;
			num = num / 10;
		}
		return inv;
	}
}
