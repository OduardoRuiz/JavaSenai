package fundamentos;

import javax.swing.JOptionPane;

public class Ex01 {
	public static void main(String[] args) {
		String temp = JOptionPane.showInputDialog("Informe a 1ª Quantidade");
		int qtd1 = Integer.parseInt(temp);

		temp = JOptionPane.showInputDialog("Informe o 1º Valor");
		double val1 = Double.parseDouble(temp);

		temp = JOptionPane.showInputDialog("Informe a 2ª Quantidade");
		int qtd2 = Integer.parseInt(temp);

		temp = JOptionPane.showInputDialog("Informe o 2º Valor");
		double val2 = Double.parseDouble(temp);

		temp = JOptionPane.showInputDialog("Informe a 3ª Quantidade");
		int qtd3 = Integer.parseInt(temp);

		temp = JOptionPane.showInputDialog("Informe o 3º Valor");
		double val3 = Double.parseDouble(temp);

		
		double total = qtd1 * val1 + qtd2 * val2 + qtd3 + val3;
		
		String msg = String.format("O Total é: %,.2f", total);
		
		JOptionPane.showMessageDialog(null, msg);
	}
}
