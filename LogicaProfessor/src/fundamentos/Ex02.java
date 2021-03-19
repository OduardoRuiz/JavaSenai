package fundamentos;

import javax.swing.JOptionPane;

public class Ex02 {
	public static void main(String[] args) {
		String msg = "Minha Folha de Pagamento\n";
		
		String temp = JOptionPane.showInputDialog("Informe a quantidade de horas trabalhadas");
		int qtdHoras = Integer.parseInt(temp);
		msg += "\nQuant. horas trab.: " + qtdHoras;
		
		temp = JOptionPane.showInputDialog("Informe o Salário Hora");
		double salHora = Double.parseDouble(temp);
		msg += String.format("\nSalário hora R$ %,.2f", salHora);
		
		temp = JOptionPane.showInputDialog("Informe o número de Dependentes");
		int dep = Integer.parseInt(temp);
		msg += "\nNº de dependentes: " + dep;
		
		double salBruto = qtdHoras * salHora + 50 * dep;
		msg += String.format("\nSalário bruto R$ %,.2f", salBruto);
		
		double inss;
		if(salBruto <= 1000) {
			inss = salBruto * 0.085;
		} else {
			inss = salBruto * 0.09;
		}
		msg += String.format("\nDesconto de INSS R$ %,.2f", inss);
		
		double ir;
		if(salBruto <= 500) {
			ir = 0;
		} else if(salBruto <= 1000) {
			ir = salBruto * 0.05;
		} else {
			ir = salBruto * 0.07;
		}
		msg += String.format("\nDesconto de IR R$ %,.2f", ir);
		
		double salLiq = salBruto - inss - ir;
		msg += String.format("\nSalário Líquido R$ %,.2f", salLiq);
		
		JOptionPane.showMessageDialog(null, msg);
	}
}
