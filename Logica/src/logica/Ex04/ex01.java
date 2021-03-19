package logica.Ex04;
import br.senai.sp.info132.console.Programa;

public class ex01 extends Programa  {

	@Override
	public void inicio() {
		
		
		double n1 = leReal("informe a nota na Prova  " );
		double n2 = leReal("informe a nota em Atividade Complementar " );
		double n3 = leReal("informe a nota em Homework " );
		double n4 = leReal("informe a nota em Atividade on-line" );
		
		double media = (n1+n2+n3+n4)/4;
		
		escrevaL(" A Sua media é ",media);

		if (media <=6.9 ) {
		escrevaL("voce foi reprovado :(");
		}		
		else if ( media >=7  )  {
		escrevaL("voce foi aprovado Parabens !!");

		}
		
	}


}