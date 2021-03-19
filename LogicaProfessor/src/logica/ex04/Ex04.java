package logica.ex04;

import br.senai.sp.info132.console.Programa;

public class Ex04 extends Programa {
	@Override
	public void inicio() {
		String nome = leTexto("Informe o seu Nome");
		
		int nota1 = leInteiro("Informe a 1ª nota");
		int nota2 = leInteiro("Informe a 2ª nota");
		int nota3 = leInteiro("Informe a 3ª nota");
		double media = (nota1 + nota2 + nota3) / 3.0;
		
		int faltas = leInteiro("Informe o nº de faltas");
	
		escreva(nome, ", você foi: ");
		
		if(faltas > 15) {
			escrevaL("Reprovado por Faltas");
		} else if(media < 7) {
			escrevaL("Reprovado por média");
		} else {
			escrevaL("Aprovado");
		}
	}
}
