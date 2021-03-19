package objetos.gui.resposta.ex03.view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import objetos.gui.lib.SwUtil;
import objetos.gui.resposta.ex03.model.Endereco;
import objetos.gui.resposta.ex03.model.Pessoa;
import objetos.gui.resposta.ex03.model.PessoaFisica;
import objetos.gui.resposta.ex03.model.PessoaJuridica;

@SuppressWarnings("serial")
public class CadPessoas extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNome;
	private JTextField tfNome;
	private JLabel lblTelefone;
	private JTextField tfFone;
	private JButton btnEndereo;
	private JTabbedPane tabbedPane;
	private JPanel pnFisica;
	private JPanel pnJuridica;
	private JLabel lblRg;
	private JTextField tfRg;
	private JLabel lblCpf;
	private JTextField tfCpf;
	private JLabel lblEmail;
	private JTextField tfEmail;
	private JLabel lblCnpj;
	private JTextField tfCnpj;
	private JLabel lblInscrEst;
	private JTextField tfInscrEst;
	private JLabel lblSite;
	private JTextField tfSite;
	private JButton btnSalvar;
	private JButton btnListar;
	private JButton btnSair;
	
	private List<Pessoa> cadastro = new ArrayList<>();
	private Endereco novoEndereco = new Endereco();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadPessoas frame = new CadPessoas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CadPessoas() {
		setResizable(false);
		setTitle("Cadastro de Pessoas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 329);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		lblNome = new JLabel("Nome");
		
		tfNome = new JTextField();
		tfNome.setColumns(10);
		
		lblTelefone = new JLabel("Telefone");
		
		tfFone = new JTextField();
		tfFone.setColumns(10);
		
		btnEndereo = new JButton("Endereço");
		btnEndereo.addActionListener(this);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
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
						.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 420, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNome)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tfNome, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblTelefone)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tfFone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
							.addComponent(btnEndereo))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnSalvar)
							.addGap(94)
							.addComponent(btnListar)
							.addPreferredGap(ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
							.addComponent(btnSair)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNome)
						.addComponent(tfNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTelefone)
						.addComponent(tfFone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnEndereo))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSalvar)
						.addComponent(btnSair)
						.addComponent(btnListar))
					.addContainerGap())
		);
		
		pnFisica = new JPanel();
		tabbedPane.addTab("Física", null, pnFisica, null);
		
		lblRg = new JLabel("RG");
		
		tfRg = new JTextField();
		tfRg.setColumns(10);
		
		lblCpf = new JLabel("CPF");
		
		tfCpf = new JTextField();
		tfCpf.setColumns(10);
		
		lblEmail = new JLabel("E-Mail");
		
		tfEmail = new JTextField();
		tfEmail.setColumns(10);
		GroupLayout gl_pnFisica = new GroupLayout(pnFisica);
		gl_pnFisica.setHorizontalGroup(
			gl_pnFisica.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnFisica.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnFisica.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnFisica.createSequentialGroup()
							.addComponent(lblRg)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tfRg, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnFisica.createSequentialGroup()
							.addComponent(lblCpf)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tfCpf, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnFisica.createSequentialGroup()
							.addComponent(lblEmail)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tfEmail, GroupLayout.PREFERRED_SIZE, 316, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(24, Short.MAX_VALUE))
		);
		gl_pnFisica.setVerticalGroup(
			gl_pnFisica.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnFisica.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnFisica.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblRg)
						.addComponent(tfRg, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnFisica.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCpf)
						.addComponent(tfCpf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_pnFisica.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEmail)
						.addComponent(tfEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(43, Short.MAX_VALUE))
		);
		pnFisica.setLayout(gl_pnFisica);
		
		pnJuridica = new JPanel();
		tabbedPane.addTab("Jurídica", null, pnJuridica, null);
		
		lblCnpj = new JLabel("CNPJ");
		
		tfCnpj = new JTextField();
		tfCnpj.setColumns(10);
		
		lblInscrEst = new JLabel("Inscr. Est.");
		
		tfInscrEst = new JTextField();
		tfInscrEst.setColumns(10);
		
		lblSite = new JLabel("Site");
		
		tfSite = new JTextField();
		tfSite.setColumns(10);
		GroupLayout gl_pnJuridica = new GroupLayout(pnJuridica);
		gl_pnJuridica.setHorizontalGroup(
			gl_pnJuridica.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnJuridica.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnJuridica.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_pnJuridica.createSequentialGroup()
							.addComponent(lblCnpj)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tfCnpj, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnJuridica.createSequentialGroup()
							.addComponent(lblInscrEst)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tfInscrEst, GroupLayout.PREFERRED_SIZE, 295, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnJuridica.createSequentialGroup()
							.addComponent(lblSite)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tfSite)))
					.addContainerGap(24, Short.MAX_VALUE))
		);
		gl_pnJuridica.setVerticalGroup(
			gl_pnJuridica.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnJuridica.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnJuridica.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCnpj)
						.addComponent(tfCnpj, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_pnJuridica.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblInscrEst)
						.addComponent(tfInscrEst, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_pnJuridica.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSite)
						.addComponent(tfSite, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(18, Short.MAX_VALUE))
		);
		pnJuridica.setLayout(gl_pnJuridica);
		contentPane.setLayout(gl_contentPane);
	}

	public void actionPerformed(ActionEvent evento) {
		Object botao = evento.getSource();
		
		if(botao.equals(btnEndereo)) {
			CadEndereco dialog = new CadEndereco(novoEndereco);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} else if(botao.equals(btnSalvar)) {
			Object aba = tabbedPane.getSelectedComponent();
			
			if(aba.equals(pnFisica)) {
				PessoaFisica pf = new PessoaFisica();
				pf.setNome(tfNome.getText());
				pf.setEndereco(novoEndereco);
				pf.setTelefone(tfFone.getText());
				pf.setRg(tfRg.getText());
				pf.setCpf(tfCnpj.getText());
				pf.setEmail(tfEmail.getText());
				
				cadastro.add(pf);
			} else {
				PessoaJuridica pj = new PessoaJuridica();
				pj.setNome(tfNome.getText());
				pj.setEndereco(novoEndereco);
				pj.setTelefone(tfFone.getText());
				pj.setCnpj(tfCnpj.getText());
				pj.setInscrEst(tfInscrEst.getText());
				pj.setSite(tfSite.getText());
				
				cadastro.add(pj);
			}
			
			novoEndereco = new Endereco();
			SwUtil.limpa(this);
			tfNome.requestFocus();
		} else if(botao.equals(btnListar)) {
			
		} else {
			System.exit(0);
		}
	}
}
