package jdbc.exercicio.ex02;

import java.awt.EventQueue;

import jdbc.exercicio.ex02.view.TelaCompra;


public class Main {	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCompra frame = new TelaCompra();
					frame.iniciarAConexao();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
