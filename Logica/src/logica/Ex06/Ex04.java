package logica.Ex06;

import br.senai.sp.info132.console.Programa;

public class Ex04 extends Programa  {

	@Override
	public void inicio() {
		
		final int QUANTIDADE_DE_REGISTROS = 5;
		
		String [] nomes = new String [QUANTIDADE_DE_REGISTROS];
		double [] salario = new double [QUANTIDADE_DE_REGISTROS];
		
		int ultimo_Registro = 0;
		
		String nome = leTexto("informe", ultimo_Registro+1, " nome ");
		
		
		
		
		
		while (!nome.equalsIgnoreCase("fim"))  {
			
			salario = leReal ("informe o ", ultimo_Registro+1, "salario");
		}
		
		if(ultimo_Registro >= nomes.length)  {
			
			String[] nomesNovos = new String[nomes.length+QUANTIDADE_DE_REGISTROS];
			double[] salariosNovos = new double[salarios.length + QUANTIDADE_DE_REGISTROS];
			
			for (int i = 0; i < nomes.length; i++) {
				nomesNovos[i] = nomes[i];
				salariosNovos[i]=salario[i];
				
			}
		nomes = nomesNovos;
		salario = salariosNovos;
		
		
		nomes[ultimo_Registro] = nome;
		salario[ultimo_Registro] = salario;
		
		ultimo_Registro++;
		nome = leTexto("informe o " , ultimo_Registro+1,"nome");
		
		}
		
		
		
		
		
		
		
		
	    ultimo_Registro = 0;
		
		nome = leTexto("informe", ultimo_Registro+1, " nome ");
		
		
		
		
		
		//for (int i = 0; i < nomes.length; i++) {
			
			
			//nomes[i] = leTexto("informe o nome");
		//}
		
		
		
		
		
		
		
		//for (int i = 0; i < salario.length; i++) {
			
			
			//salario[i] = leInteiro("informe o salario");
			
		}
		
		
		
		
		
		
		
	}
	
	

}
