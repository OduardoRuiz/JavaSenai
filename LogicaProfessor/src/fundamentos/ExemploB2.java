package fundamentos;

import javax.swing.JOptionPane;

public class ExemploB2 {
	public static void main(String[] args) {
		try {
			String temp = JOptionPane.showInputDialog("Informe o salario");
			double salario = Double.parseDouble(temp);

			String msg = String.format(
					"O salario %,.2f terá um desconto de 5%% %,.2f" , salario, salario * 0.05);
			
			JOptionPane.showMessageDialog(null, msg);
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(null," O nº informado é inválido");
		}
	}
}
