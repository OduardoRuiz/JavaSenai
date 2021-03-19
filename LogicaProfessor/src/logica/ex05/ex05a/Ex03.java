package logica.ex05.ex05a;

import br.senai.sp.info132.console.Programa;

public class Ex03 extends Programa {
	@Override
	public void inicio() {
		String oNome = "";
		int aIdade = 0;

		String nome = leTexto("Informe seu Nome");
		while(!nome.isEmpty()) {
			int idade = leInteiro("Informe a sua Idade, ", nome);
			
			if(idade > aIdade) {
				oNome = nome;
				aIdade = idade;
			}
			
			nome = leTexto("Informe seu Nome");
		}
		
		escrevaL("O vencedor é ", oNome, " com ", aIdade, " anos");
	}
}
