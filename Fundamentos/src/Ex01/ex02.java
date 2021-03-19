package Ex01;



import javax.swing.JOptionPane;

public class ex02 {
	
	public static void main(String[] x) {
		
		String escreverHoras = JOptionPane.showInputDialog("Informe a quantidade de horas trabalhadas");
		double horas = Double.parseDouble(escreverHoras);
		//
		
		String escreverSalario = JOptionPane.showInputDialog("Informe o salario Por Hora");
		double salario = Double.parseDouble(escreverSalario);
		
		//
		
		String escreverDependentes = JOptionPane.showInputDialog("Informe o numero de dependentes");
		double dependentes = Double.parseDouble(escreverDependentes);
		
		//
		
		double bruto = horas * salario + (50* dependentes);
		
		double inss ;
		if (bruto <= 1000) {
			inss = bruto * 0.085;
		} else {
			inss = bruto * 0.09;
		}

		double ir ;
		
		if (bruto >= 1000) {
			
			ir = bruto * 0.07;
		} else if (bruto >= 501)
			
			ir = bruto * 0.05; 
	 else   { 
		 ir = 0;
		 
	
	
}
			
		double salarioliquido = bruto - inss - ir;
	   
		 
		
		//String resultado = (null, "desconto inss" ,inss);
		//resultado += (null," Desconto Ir" ,ir);
		//resultado += (null,"salario bruto R$ " ,bruto );
		//resultado += (null, "o valor do salario é  R$ ", salarioliquido);
	
		
		
		JOptionPane.showInputDialog(null,"desconto inss" ,inss);
		JOptionPane.showInputDialog(null," Desconto Ir" ,ir);
		JOptionPane.showInputDialog(null,"salario bruto R$ " ,bruto );
		JOptionPane.showInputDialog(null, "o valor do salario é  R$ ", salarioliquido);
	
	
	
	
}

	
}