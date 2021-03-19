package Ex01;

import javax.swing.JOptionPane;

public class ex01 {

	public static void main(String[] x) {

		String quant1 = JOptionPane.showInputDialog(null, "Informe a Quantidade 1 ");
		int num = Integer.parseInt(quant1);

		String valor1 = JOptionPane.showInputDialog(null, "Informe o Valor1");
		double preco1 = Double.parseDouble(valor1);

		//

		String quant2 = JOptionPane.showInputDialog(null, "informe a quantidade2");
		int num2 = Integer.parseInt(quant2);

		String valor2 = JOptionPane.showInputDialog(null, "informe o valor2");
		double preco2 = Double.parseDouble(valor2);

		//

		String quant3 = JOptionPane.showInputDialog(null, "informe a quantidade3");
		int num3 = Integer.parseInt(quant3);

		String valor3 = JOptionPane.showInputDialog(null, "informe o valor2");
		double preco3 = Double.parseDouble(valor3);

		//

		double total = (num * preco1) + (num2 * preco2) + (num3 * preco3);

		JOptionPane.showInputDialog(null, "o valor total é ", total);

	}
}