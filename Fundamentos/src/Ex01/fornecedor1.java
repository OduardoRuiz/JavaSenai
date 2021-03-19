package Ex01;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
@SuppressWarnings("serial")
public class fornecedor1 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNome;
	private JLabel lblEndereo;
	private JTextField tfNome;
	private JTextField tfEndereco;
	private JButton btnSalvar;
	private JButton btnListar;
	private JButton btnSair;

	private List<Fornecedores> cadastro = new ArrayList<>();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fornecedor1 frame = new fornecedor1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public fornecedor1() {
		setResizable(false);
		setTitle("Cadastro de Fornecedores 2 exemplo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		lblNome = new JLabel("NOME");
		
		lblEndereo = new JLabel("ENDERE\u00C7O");
		
		tfNome = new JTextField();
		tfNome.setColumns(10);
		
		tfEndereco = new JTextField();
		tfEndereco.setColumns(10);
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(this);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		
		btnSair = new JButton("Sair");
		btnSair.addActionListener(this);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(lblNome)
								.addGap(44)
								.addComponent(tfNome, GroupLayout.PREFERRED_SIZE, 285, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(lblEndereo)
								.addGap(18)
								.addComponent(tfEndereco)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnSalvar)
							.addGap(97)
							.addComponent(btnListar)
							.addPreferredGap(ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
							.addComponent(btnSair)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(24)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNome)
						.addComponent(tfNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEndereo)
						.addComponent(tfEndereco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSalvar)
						.addComponent(btnListar)
						.addComponent(btnSair))
					.addGap(44))
		);
		contentPane.setLayout(gl_contentPane);
	}

	public void actionPerformed(ActionEvent evento) {
		Object botao = evento.getSource();
		
		if (botao.equals(btnSalvar)) { 
			Fornecedores fornecedor = new Fornecedores();
			
			fornecedor.setNome(tfNome.getText());
			fornecedor.setEnder(tfEndereco.getText());
	
			cadastro.add(fornecedor);
			
			tfNome.setText("");
			tfEndereco.setText("");
			tfNome.requestFocus();
			
		}
		else if (botao.equals(btnListar)) {
			String msg = "Lista dos Contratos Cadastrados\n\n";

			for (Fornecedores fornecedor : cadastro) {
				msg += fornecedor + "\n";
			}
			JOptionPane.showMessageDialog(null, msg);
			tfNome.requestFocus();
		}
	 else {
		System.exit(0);
	}
}
}
