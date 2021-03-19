package jdbc.exercicio2;

import java.awt.EventQueue;

import javax.swing.JOptionPane;

import jdbc.exercicio2.dao.CompraDao;
import jdbc.exercicio2.view.TelaCompra;


public class Main {	
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					TelaCompra frame = new TelaCompra();
					frame.cadastro = new CompraDao();
					frame.setVisible(true);
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, ex.getMessage());
				}
			}
		});
	}
}
