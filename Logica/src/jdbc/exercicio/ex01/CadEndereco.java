package jdbc.exercicio.ex01;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import objetos.gui.lib.StatusValidador;
import objetos.gui.lib.SwUtil;
import objetos.gui.lib.VerificaRegex;

@SuppressWarnings("serial")
public class CadEndereco extends JFrame implements ActionListener {
	private JPanel contentPane;
	private JLabel lblLogr;
	private JTextField tfLogr;
	private JLabel lblN;
	private JTextField tfNum;
	private JLabel lblBairro;
	private JTextField tfBairro;
	private JLabel lblCep;
	private JFormattedTextField tfCep;
	private JButton btnSalvar;
	private JButton btnListar;
	private JButton btnSair;

	private CadastroDao cadastro;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadEndereco frame = new CadEndereco();
					frame.cadastro = new CadastroDao();
					frame.setVisible(true);
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null,ex.getMessage());
					ex.printStackTrace();
				}
			}
		});
	}

	public CadEndereco() {
		setResizable(false);
		setTitle("Cadastro de Endereços");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 541, 160);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		lblLogr = new JLabel("Logr.");

		tfLogr = new JTextField();
		tfLogr.setColumns(10);

		lblN = new JLabel("Nº");

		tfNum = new JTextField();
		tfNum.setInputVerifier(new VerificaRegex("([1-9][0-9]*[ABC]?)|(S/N)"));
		tfNum.setColumns(10);

		lblBairro = new JLabel("Bairro");

		tfBairro = new JTextField();
		tfBairro.setColumns(10);

		lblCep = new JLabel("CEP");

		tfCep = new JFormattedTextField(SwUtil.criaMascara("#####-###"));
		tfCep.setColumns(10);

		btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(this);

		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);

		btnSair = new JButton("Sair");
		btnSair.addActionListener(this);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addComponent(btnSalvar).addGap(152)
								.addComponent(btnListar).addPreferredGap(ComponentPlacement.RELATED, 166,
										Short.MAX_VALUE)
								.addComponent(btnSair))
						.addGroup(gl_contentPane.createSequentialGroup().addComponent(lblLogr)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(tfLogr, GroupLayout.PREFERRED_SIZE, 349, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(lblN)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(tfNum, GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup().addComponent(lblBairro)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(tfBairro, GroupLayout.PREFERRED_SIZE, 293, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED).addComponent(lblCep).addGap(18)
								.addComponent(tfCep, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)))
				.addContainerGap()));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup().addContainerGap()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lblLogr)
								.addComponent(tfLogr, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblN).addComponent(tfNum, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lblBairro)
								.addComponent(tfBairro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCep).addComponent(tfCep, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(btnSalvar)
								.addComponent(btnSair).addComponent(btnListar))
						.addContainerGap()));
		contentPane.setLayout(gl_contentPane);
	}

	public void actionPerformed(ActionEvent evento) {
		Object botao = evento.getSource();
		
		try {
			
		
		if(botao.equals(btnSalvar)) {
			StatusValidador status = SwUtil.verificaStatus(this);	
			if(status.equals(StatusValidador.OK)) {
				Endereco oEndereco = new Endereco();
				oEndereco.setLogradouro(tfLogr.getText());
				oEndereco.setNumero(tfNum.getText());
				oEndereco.setBairro(tfBairro.getText());
				oEndereco.setCep(tfCep.getText());
				
				cadastro.incluir(oEndereco);
				
				// Limpar os Campos do Formulário
				SwUtil.limpa(this);
				
				// posicionar o cursor no campo Nome
				tfLogr.requestFocus();
			} else if(status.equals(StatusValidador.EM_BRANCO)) {
				JOptionPane.showMessageDialog(this, "Existem campos em Branco");
			} else {
				JOptionPane.showMessageDialog(this, "Existem campos com Erro");
			}	
		} else if(botao.equals(btnListar)) {
			String msg = "Lista de Endereços\n\n";
			for (Endereco obj : cadastro.consultar()) {
				
				msg += obj + "\n";
			}
			JOptionPane.showMessageDialog(this,msg);
			
		} else {  cadastro.fecharConexao();
		              System.exit(0);
		}
	}catch (CadastroDaoException ex) {
		JOptionPane.showMessageDialog(this, ex.getMessage());
	}
}
}