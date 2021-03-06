package Ex01Fundamentos;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
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
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
@SuppressWarnings ("serial")
public class fornecedor extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField tfnome;
	private JTextField tfendereco;
	JButton botaolista = new JButton("Lista");
	JButton botaosalvar = new JButton("Salvar");
	JButton botaosair = new JButton("Sair");

	private List<Fornecedores> cadastro = new ArrayList<>();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fornecedor frame = new fornecedor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public fornecedor() {
		setResizable(false);
		setTitle("Cadastro de Fornecedores");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		tfnome = new JTextField();
		tfnome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("End.");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		tfendereco = new JTextField();
		tfendereco.setColumns(10);
		botaosalvar.setForeground(Color.WHITE);
		botaosalvar.addActionListener(this);
		
		botaosalvar.setBackground(Color.BLACK);
		botaosalvar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		botaosalvar.setHorizontalAlignment(SwingConstants.LEFT);
		botaolista.setForeground(Color.WHITE);
		botaolista.addActionListener(this);
		
		botaolista.setBackground(Color.BLACK);
		botaosair.addActionListener(this);
		
		botaosair.setBackground(new Color(128, 0, 0));
		botaosair.setForeground(Color.WHITE);
		botaosair.setHorizontalAlignment(SwingConstants.RIGHT);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.UNRELATED))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addGap(25)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(tfnome)
						.addComponent(tfendereco, GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE))
					.addContainerGap(52, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(botaosalvar)
					.addGap(87)
					.addComponent(botaolista, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
					.addComponent(botaosair)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(tfnome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(tfendereco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(73)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(botaosalvar)
						.addComponent(botaosair)
						.addComponent(botaolista))
					.addContainerGap(77, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	public void actionPerformed(ActionEvent evento) {
	
	Object botao = evento.getSource();
	
	if (botao.equals(botaosalvar)) {
		
		Fornecedores fornecedor = new Fornecedores();
		fornecedor.setNome (tfnome.getText());
		fornecedor.setEnder(tfendereco.getText());
		
        cadastro.add(fornecedor);		
		tfnome.setText("");
		tfendereco.setText("");
		tfnome.requestFocus();
		
	}
	else if (botao.equals(botaolista)) {

		String msg = "Lista de fornecedores cadastrados" ;
		for (Fornecedores fornecedor : cadastro) {
			msg += fornecedor + "\n";
		}
		
		JOptionPane.showMessageDialog(null, msg);
		tfnome.requestFocus();
				
	}
	 else {
		System.exit(0);
	}
	}
}
