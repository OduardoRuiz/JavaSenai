package objetos.regex;

import javax.swing.JOptionPane;

/*
 *    123-90
 *   2342-0X Teste
 *     12-93 
 *      1-09 Teste
 *  [0-9]{1,4}-[0-9][0-9X]( Teste)?
 * 
 */


public class Exemplo {
	public static void main(String[] args) {
		while(true) {
			String codigo = JOptionPane.showInputDialog("Informe o Código do Produto");
			
			codigo = codigo.trim();  // retira os espaços em branco antes e depois do código
			
			if(codigo.matches("[0-9]{1,4}-[0-9][0-9X]( Teste)?")) {
				JOptionPane.showMessageDialog(null, "O código informado foi: " + codigo);
			} else {
				JOptionPane.showMessageDialog(null, "O Código informado, "+ codigo +" é inválido");
			}
		}
		
	}
}





