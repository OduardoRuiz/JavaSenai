package logica.Ex04;

import br.senai.sp.info132.console.Programa;

public class ex04 extends Programa  {

	@Override
	public void inicio() {
		
		String aluno = leTexto("Informe o nome do Aluno");
		
        double n1 = leReal("informe a nota na Prova  " );
		double n2 = leReal("informe a nota em Atividade Complementar " );
		double n3 = leReal("informe a nota em Homework " );
		double n4 = leReal("informe a nota em Atividade on-line" );
		
		double media = (n1+n2+n3+n4)/4;
		
		
		int  falta = leInteiro ("Informe o numero de faltas");
		
		int limitedefaltas = 15;
		
		escrevaL ("" ,aluno ," ,VOCE FOI " ,media  >= 7 && falta <= limitedefaltas ? "APROVADO " : "REPROVADO CABEÇÃO " );
		
		escrevaL("Sua media é ," , media , " e seu numero de faltas é " , falta );
		
}
}
