package objetos.exemplos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTabbedPane;

public class TesteAba extends JFrame {

	private JPanel contentPane;
	private JLabel lblNome;
	private JTextField textField;
	private JTabbedPane tabbedPane;
	private JPanel painelAliment;
	private JPanel painelEletro;
	private JLabel lblTeste;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TesteAba frame = new TesteAba();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TesteAba() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		lblNome = new JLabel("Nome");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNome)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 427, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(13, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNome)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(66, Short.MAX_VALUE))
		);
		
		painelAliment = new JPanel();
		tabbedPane.addTab("Alimenticios", null, painelAliment, null);
		GroupLayout gl_painelAliment = new GroupLayout(painelAliment);
		gl_painelAliment.setHorizontalGroup(
			gl_painelAliment.createParallelGroup(Alignment.LEADING)
				.addGap(0, 406, Short.MAX_VALUE)
		);
		gl_painelAliment.setVerticalGroup(
			gl_painelAliment.createParallelGroup(Alignment.LEADING)
				.addGap(0, 118, Short.MAX_VALUE)
		);
		painelAliment.setLayout(gl_painelAliment);
		
		painelEletro = new JPanel();
		tabbedPane.addTab("Eletrodomesticos", null, painelEletro, null);
		
		lblTeste = new JLabel("teste");
		GroupLayout gl_painelEletro = new GroupLayout(painelEletro);
		gl_painelEletro.setHorizontalGroup(
			gl_painelEletro.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelEletro.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblTeste)
					.addContainerGap(339, Short.MAX_VALUE))
		);
		gl_painelEletro.setVerticalGroup(
			gl_painelEletro.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelEletro.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblTeste)
					.addContainerGap(96, Short.MAX_VALUE))
		);
		painelEletro.setLayout(gl_painelEletro);
		contentPane.setLayout(gl_contentPane);
	}
}
