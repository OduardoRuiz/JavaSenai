package fundamentos;

import javax.swing.JOptionPane;

public class ExemploB {
	public static void main(String[] args) {
		try {
			double salario = leReal("Informe o salario");

			escreva("O salario " , salario , " terá um desconto de 5% " , (salario * 0.05) );
		} catch (NumberFormatException ex) {
			escreva(" O nº informado é inválido");
		} catch (Exception ex) {
			escreva(" O nº informado é inválido");
		}
	}

	public static double leReal(String msg) {
		String temp = JOptionPane.showInputDialog(msg);
		return Double.parseDouble(temp);
	}

	public static int leInteiro(String msg) {
		String temp = JOptionPane.showInputDialog(msg);
		return Integer.parseInt(temp);
	}
	
	public static void escreva(Object ... itens) {
		String msg = "";
		
		for (int i = 0; i < itens.length; i++) {
			if(itens[i] instanceof Double) {
				msg += String.format("%,.2f", itens[i]);
			} else {
				msg += itens[i];
			}
		}
		
		JOptionPane.showMessageDialog(null, msg);
	}
}
