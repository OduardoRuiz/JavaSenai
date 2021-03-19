package objetos.exemplos.validacao.view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import objetos.gui.lib.SwUtil;
import objetos.gui.lib.VerificaRegex;
import objetos.gui.resposta.ex03.model.Endereco;
import objetos.gui.resposta.ex03.model.Pessoa;
import objetos.gui.resposta.ex03.model.PessoaFisica;
import objetos.gui.resposta.ex03.model.PessoaJuridica;
import objetos.gui.lib.OptionalTextField;
import objetos.gui.lib.StatusValidador;

@SuppressWarnings("serial")
public class CadPessoas extends JFrame implements ActionListener, ChangeListener {

	private JPanel contentPane;
	private JLabel lblNome;
	private OptionalTextField tfNome;
	private JLabel lblTelefone;
	private JTextField tfFone;
	private JTabbedPane tabbedPane;
	private JPanel pnFisica;
	private JPanel pnJuridica;
	private JLabel lblRg;
	private OptionalTextField tfRg;
	private JLabel lblCpf;
	private OptionalTextField tfCpf;
	private JLabel lblEmail;
	private OptionalTextField tfEmail;
	private JLabel lblCnpj;
	private OptionalTextField tfCnpj;
	private JLabel lblInscrEst;
	private OptionalTextField tfInscrEst;
	private JLabel lblSite;
	private OptionalTextField tfSite;
	private JButton btnSalvar;
	private JButton btnListar;
	private JButton btnSair;
	private JPanel panel;
	private JLabel lblLogr;
	private OptionalTextField tfLogr;
	private JLabel lblN;
	private JTextField tfNum;
	private JLabel lblBairro;
	private OptionalTextField tfBairro;
	private JLabel lblCep;
	private JTextField tfCep;
	private JLabel lblCompl;
	private JTextField tfCompl;
	private JLabel lblCidade;
	private OptionalTextField tfCidade;
	private JLabel lblUf;
	private OptionalTextField tfEstado;
	
	private List<Pessoa> cadastro = new ArrayList<>();

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
		setBounds(100, 100, 811, 329);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		lblNome = new JLabel("Nome");
		
		tfNome = new OptionalTextField();
		tfNome.setOptional(false);
		tfNome.setColumns(10);
		
		lblTelefone = new JLabel("Telefone");
		
		tfFone = new JTextField();
		tfFone.setInputVerifier(new VerificaRegex("(\\([1-9][0-9]\\) )?9?[0-9]{4}-[0-9]{4}"));
		tfFone.setColumns(10);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addChangeListener(this);
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(this);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		
		btnSair = new JButton("Sair");
		btnSair.addActionListener(this);
		
		panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Endere\u00E7o", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNome)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tfNome, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblTelefone)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tfFone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(btnSalvar)
								.addGap(18)
								.addComponent(btnListar)
								.addGap(18)
								.addComponent(btnSair))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 420, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 355, GroupLayout.PREFERRED_SIZE))))
					.addGap(66))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGap(13)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNome)
						.addComponent(tfNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTelefone)
						.addComponent(tfFone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 31, Short.MAX_VALUE))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
							.addGap(23)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSair)
						.addComponent(btnListar)
						.addComponent(btnSalvar))
					.addContainerGap())
		);
		
		lblLogr = new JLabel("Logr.");
		
		tfLogr = new OptionalTextField();
		tfLogr.setColumns(10);
		
		lblN = new JLabel("Nº");
		
		tfNum = new JTextField();
		tfNum.setInputVerifier(new VerificaRegex("[0-9]{1,6}(\\w+)?"));
		tfNum.setColumns(10);
		
		lblBairro = new JLabel("Bairro");
		
		tfBairro = new OptionalTextField();
		tfBairro.setColumns(10);
		
		lblCep = new JLabel("CEP");
		
		tfCep = new JTextField();
		tfCep.setInputVerifier(new VerificaRegex("[0-9]{5}-[0-9]{3}"));
		tfCep.setColumns(10);
		
		lblCompl = new JLabel("Compl.");
		
		tfCompl = new JTextField();
		tfCompl.setColumns(10);
		
		lblCidade = new JLabel("Cidade");
		
		tfCidade = new OptionalTextField();
		tfCidade.setColumns(10);
		
		lblUf = new JLabel("UF");
		
		tfEstado = new OptionalTextField();
		tfEstado.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblLogr)
							.addGap(18)
							.addComponent(tfLogr, GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblN)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tfNum, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblBairro)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tfBairro, GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblCep)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tfCep, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblCompl)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tfCompl, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblCidade)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tfCidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblUf)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tfEstado, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLogr)
						.addComponent(tfLogr, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblN)
						.addComponent(tfNum, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblBairro)
						.addComponent(tfBairro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCep)
						.addComponent(tfCep, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCompl)
						.addComponent(tfCompl, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCidade)
						.addComponent(tfCidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblUf)
						.addComponent(tfEstado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(85, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		pnFisica = new JPanel();
		tabbedPane.addTab("Física", null, pnFisica, null);
		
		lblRg = new JLabel("RG");
		
		tfRg = new OptionalTextField();
		tfRg.setInputVerifier(new VerificaRegex("[0-9]{1,3}.[0-9]{3}.[0-9]{3}(-([1-9]|X))?"));
		tfRg.setColumns(10);
		
		lblCpf = new JLabel("CPF");
		
		tfCpf = new OptionalTextField();
		tfCpf.setInputVerifier(new VerificaRegex("[0-9]{1,3}.[0-9]{3}.[0-9]{3}-[0-9]{2}"));
		tfCpf.setColumns(10);
		
		lblEmail = new JLabel("E-Mail");
		
		tfEmail = new OptionalTextField();
		tfEmail.setInputVerifier(new VerificaRegex("(\\w+.)*\\w+@\\w+(.\\w+){1,2}"));
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
		
		tfCnpj = new OptionalTextField();
		tfCnpj.setInputVerifier(new VerificaRegex("[0-9]{1,3}.[0-9]{3}.[0-9]{3}/[0-9]{4}-[0-9]{2}"));
		tfCnpj.setColumns(10);
		
		lblInscrEst = new JLabel("Inscr. Est.");
		
		tfInscrEst = new OptionalTextField();
		tfInscrEst.setInputVerifier(new VerificaRegex("[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}"));
		tfInscrEst.setColumns(10);
		
		lblSite = new JLabel("Site");
		
		tfSite = new OptionalTextField();
		tfSite.setInputVerifier(new VerificaRegex("\\w+(.\\w+){1,3}"));
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
		
		setLocationRelativeTo(null);
		getRootPane().setDefaultButton(btnSalvar);
		ajustaTela(false);
	}

	public void actionPerformed(ActionEvent evento) {
		Object botao = evento.getSource();
		
		if(botao.equals(btnSalvar)) {
			StatusValidador verificacao = SwUtil.verificaStatus(this);
			
			if(verificacao.equals(StatusValidador.OK)) {
				Object aba = tabbedPane.getSelectedComponent();
				
				Endereco oEndereco = new Endereco();
				oEndereco.setLogradouro(tfLogr.getText());
				oEndereco.setNumero(tfNum.getText());
				oEndereco.setBairro(tfBairro.getText());
				oEndereco.setCep(tfCep.getText());
				oEndereco.setComplemento(tfCompl.getText());
				oEndereco.setCidade(tfCidade.getText());
				oEndereco.setEstado(tfEstado.getText());			
				
				if(aba.equals(pnFisica)) {
					PessoaFisica pf = new PessoaFisica();
					pf.setNome(tfNome.getText());
					pf.setEndereco(oEndereco);
					pf.setTelefone(tfFone.getText());
					pf.setRg(tfRg.getText());
					pf.setCpf(tfCnpj.getText());
					pf.setEmail(tfEmail.getText());
					
					cadastro.add(pf);
				} else {
					PessoaJuridica pj = new PessoaJuridica();
					pj.setNome(tfNome.getText());
					pj.setEndereco(oEndereco);
					pj.setTelefone(tfFone.getText());
					pj.setCnpj(tfCnpj.getText());
					pj.setInscrEst(tfInscrEst.getText());
					pj.setSite(tfSite.getText());
					
					cadastro.add(pj);
				}
				
				SwUtil.limpa(this);
				tfNome.requestFocus();
			} else if(verificacao.equals(StatusValidador.EM_BRANCO)) {
				JOptionPane.showMessageDialog(this, "Existem campos em BRANCO");
			} else {
				JOptionPane.showMessageDialog(this, "Existem campos com ERRO");
			}
		} else if(botao.equals(btnListar)) {
			String msg = cadastro.stream()
					.map(new Function<Pessoa, String>() {
						public String apply(Pessoa p) {
							return p.toString();
						}
					}).collect(Collectors.joining("\n"));
			
			JOptionPane.showMessageDialog(this, "Cadastro de Pessoas\n\n" + msg);
		} else {
			System.exit(0);
		}
	}

	@Override
	public void stateChanged(ChangeEvent evento) {
		if(tfSite != null) {
			Object aba = tabbedPane.getSelectedComponent();
			
			if(aba.equals(pnFisica)) {
				ajustaTela(false);
			} else {
				ajustaTela(true);
			}
		}
	}
	
	private void ajustaTela(boolean valor) {
		tfRg.setOptional(valor);
		tfCpf.setOptional(valor);
		tfEmail.setOptional(valor);
		
		tfCnpj.setOptional(!valor);
		tfInscrEst.setOptional(!valor);
		tfSite.setOptional(!valor);

	}
}
