package logica.ex01;

import br.senai.sp.info132.console.Programa;

public class Ex04 extends Programa {

	@Override
	public void inicio() {
		
		int Largura = leInteiro("informe a largura");
		int Comprimento = leInteiro("Informe o comprimento");
		int Profundidade = leInteiro("Informe a Profundidade");
		double Valormetroquadrado = (Largura*Comprimento*Profundidade) *45;
		
		
		escrevaL("o preço final é " , Valormetroquadrado);
		
		
		
		// TODO Auto-generated method stub
		
	} 


}
