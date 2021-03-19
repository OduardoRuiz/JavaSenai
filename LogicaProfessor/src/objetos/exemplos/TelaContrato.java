package objetos.exemplos;

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
public class TelaContrato extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNumero;
	private JTextField tfNumero;
	private JLabel lblTitulo;
	private JTextField tfTitulo;
	private JLabel lblDescricao;
	private JTextField tfDescricao;
	private JButton btnSalvar;
	private JButton btnListar;
	private JButton btnSair;

	private List<Contrato> cadastro = new ArrayList<>();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaContrato frame = new TelaContrato();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TelaContrato() {
		setResizable(false);
		setTitle("Cadastro de Contratos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 482, 184);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		lblNumero = new JLabel("Número");
		
		tfNumero = new JTextField();
		tfNumero.setColumns(10);
		
		lblTitulo = new JLabel("Título");
		
		tfTitulo = new JTextField();
		tfTitulo.setColumns(10);
		
		lblDescricao = new JLabel("Descrição");
		
		tfDescricao = new JTextField();
		tfDescricao.setColumns(10);
		
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
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNumero)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(tfNumero, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblTitulo)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tfTitulo, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblDescricao)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tfDescricao, GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnSalvar)
							.addGap(101)
							.addComponent(btnListar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(118)
							.addComponent(btnSair)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNumero)
						.addComponent(tfNumero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTitulo)
						.addComponent(tfTitulo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDescricao)
						.addComponent(tfDescricao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSalvar)
						.addComponent(btnSair)
						.addComponent(btnListar))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
		
		// Centralizar a janela na tela do computador
		setLocationRelativeTo(null);
		// Definir o botão padrão para a janela
		getRootPane().setDefaultButton(btnSalvar);
	}

	public void actionPerformed(ActionEvent evento) {
		Object botao = evento.getSource();
		
		if(botao.equals(btnSalvar)) {
			Contrato contrato = new Contrato();
			contrato.setNumero(Integer.parseInt(tfNumero.getText()));
			contrato.setTitulo(tfTitulo.getText());
			contrato.setDescricao(tfDescricao.getText());
			
			cadastro.add(contrato);
			
			tfNumero.setText("");
			tfTitulo.setText("");
			tfDescricao.setText("");
			tfNumero.requestFocus();
		} else if(botao.equals(btnListar)) {
			String msg = "Lista dos Contratos Cadastrados\n\n";

			for (Contrato contrato : cadastro) {
				msg += contrato + "\n";
			}
			
			JOptionPane.showMessageDialog(null, msg);
			tfNumero.requestFocus();
		} else {
			System.exit(0);
		}
	}
}
