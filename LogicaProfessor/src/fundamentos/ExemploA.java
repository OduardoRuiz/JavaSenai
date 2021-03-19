package fundamentos;

import javax.swing.JOptionPane;

public class ExemploA {
	public static void main(String[] args) {
		try {
			String temp = JOptionPane.showInputDialog("Informe o nº");
			int num = Integer.parseInt(temp);
			
			JOptionPane.showMessageDialog(null, 
					"O nº "+ num + " é "+ (ePar(num) ? "par" : "impar"));
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, " O nº informado é inválido");
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, " O nº informado é inválido");
		}
		
		System.out.println("Fim");
	}

	public static boolean ePar(int num) {
		return num % 2 == 0;
	}
}
