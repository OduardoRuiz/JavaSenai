package logica.ex05.ex05b;

import br.senai.sp.info132.console.Programa;

public class Ex03 extends Programa {
	int totalMasc = 0;
	int totalFem = 0;
	double mediaMasc = 0;
	double mediaFem = 0;
	double reprMediaMasc = 0;
	double reprMediaFem = 0;
	double reprFaltaMasc = 0;
	double reprFaltaFem = 0;
	
	@Override
	public void inicio() {	
		String oNome = leTexto("Informe o Nome");
		while(!oNome.equalsIgnoreCase("fim")) {
			char sexo = leCaracter("Informe \"M\"asculino \"F\"eminino");
			double media = 0;
			for (int i = 0; i < 3; i++) {
				media += leInteiro("Informe a ", i +1 , "ª nota");
			}
			media /= 3;
			int faltas = leInteiro("Informe o nº de faltas");
		
			// ==>> Apresentar a informação do aluno 
			String situacao = apresentarSituacao(oNome, media, faltas);
			
			// ==>> contabilizar as estatisticas de faltas, medias , etc
			contabilizarEstastisticas(sexo, media, situacao);
			
			oNome = leTexto("Informe o Nome");
		}
		// ==> apresentar as estatisticas
		apresentarEstatisticas();		
	}

	public String apresentarSituacao(String nome, double media, int faltas) {
		String situacao = "";
		
		if(faltas > 15) {
			situacao = "Reprovado por Faltas";
		} else if(media < 7) {
			situacao = "Reprovado por Média";
		} else {
			situacao = "Aprovado";
		}
		
		escrevaL(nome, " está com média: ", media, " e situação ", situacao);
		
		return situacao;
	}

	public void contabilizarEstastisticas(char sexo, double media, String situacao) {
		 if(sexo == 'M' || sexo == 'm') {
			 totalMasc++;
			 mediaMasc += media;
			 
			 if(situacao.equals("Reprovado por Média")) {
				 reprMediaMasc++;
			 } else {
				 reprFaltaMasc++;
			 }
		 } else {
			 totalFem++;
			 mediaFem += media;
			 
			 if(situacao.equals("Reprovado por Média")) {
				 reprMediaFem++;
			 } else {
				 reprFaltaFem++;
			 }
		 }
	}

	public void apresentarEstatisticas() {
		escrevaL("Média Notas Masculino: ", mediaMasc / totalMasc);
		escrevaL("Média Notas Feminino: ", mediaFem / totalFem);
		
		escrevaL("% reprovação p/ média Masculino: ", reprMediaMasc / totalMasc * 100);
		escrevaL("% reprovação p/ média Feminino: ", reprMediaFem / totalFem * 100);
		
		escrevaL("% reprovação p/ falta Masculino: ", reprFaltaMasc / totalMasc * 100);
		escrevaL("% reprovação p/ falta Feminino: ", reprFaltaFem / totalFem * 100);

		int totalAlunos = totalMasc + totalFem;
		double totalRepr = reprFaltaFem + reprFaltaMasc + reprMediaFem + reprMediaMasc;
		
		escrevaL("% reprovação: ", totalRepr / totalAlunos * 100);
	}
}
