package fundamentos;

import javax.swing.JOptionPane;

public class Ex01a {
	public static void main(String[] args) {
		double total = 0;
		
		for (int i = 0; i < 3; i++) {
			String temp = JOptionPane.showInputDialog("Informe a "+(i+1)+"ª Quantidade");
			int qtd = Integer.parseInt(temp);
			
			temp = JOptionPane.showInputDialog("Informe o "+(i+1)+"º Valor");
			double val = Double.parseDouble(temp);
			
			total += qtd * val;
		}
		
		JOptionPane.showMessageDialog(null, String.format("O Total é: %,.2f", total));
	}
}
