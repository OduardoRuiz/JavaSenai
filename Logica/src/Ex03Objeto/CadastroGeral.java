package Ex03Objeto;

import java.awt.EventQueue;
import java.awt.Font;
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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import objetos.gui.lib.SwUtil;

@SuppressWarnings("serial")
public class CadastroGeral extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNome;
	private JTextField tfNome;
	private JLabel lblTelefone;
	private JButton btnEndereo;
	private JTabbedPane tabbedPane;
	private JPanel pnFisic;
	private JPanel pnJurid;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField tfRg;
	private JTextField tfCpf;
	private JTextField tfemail;
	private JLabel lblCpnj;
	private JLabel lblIncrioEstadual;
	private JLabel lblNewLabel_3;
	private JTextField tfCnpj;
	private JTextField tfInscri;
	private JTextField tfSite;
	private JButton btnSalvar;
	private JButton btnListar;
	private JButton btnSair;
	private List<Pessoa> cadastro = new ArrayList<>();
	private JTextField tfTelef;
	private Endereco ondefica = new Endereco();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroGeral frame = new CadastroGeral();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CadastroGeral() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 562);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 13));

		tfNome = new JTextField();
		tfNome.setColumns(10);

		lblTelefone = new JLabel("Telefone");
		lblTelefone.setFont(new Font("Tahoma", Font.BOLD, 13));

		btnEndereo = new JButton("Endere\u00E7o");
		btnEndereo.addActionListener(this);

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);

		btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(this);

		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);

		btnSair = new JButton("Sair");
		btnSair.addActionListener(this);

		tfTelef = new JTextField();
		tfTelef.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane
				.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane.createSequentialGroup()
						.addContainerGap().addGroup(gl_contentPane
								.createParallelGroup(Alignment.TRAILING).addGroup(gl_contentPane
										.createSequentialGroup()
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNome, GroupLayout.PREFERRED_SIZE, 43,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(lblTelefone))
										.addGap(28)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(tfNome, GroupLayout.PREFERRED_SIZE, 450,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(tfTelef, GroupLayout.PREFERRED_SIZE, 155,
														GroupLayout.PREFERRED_SIZE))
										.addContainerGap(32, Short.MAX_VALUE))
								.addGroup(gl_contentPane.createSequentialGroup().addComponent(btnEndereo).addGap(43))
								.addGroup(
										gl_contentPane.createSequentialGroup()
												.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 555,
														Short.MAX_VALUE)
												.addContainerGap())))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(35).addComponent(btnSalvar).addGap(125)
						.addComponent(btnListar).addPreferredGap(ComponentPlacement.RELATED, 195, Short.MAX_VALUE)
						.addComponent(btnSair).addGap(47)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lblNome).addComponent(
						tfNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING).addComponent(lblTelefone).addComponent(
						tfTelef, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(49).addComponent(btnEndereo).addGap(135)
				.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(btnSalvar)
						.addComponent(btnListar).addComponent(btnSair))
				.addContainerGap(25, Short.MAX_VALUE)));

		pnFisic = new JPanel();
		tabbedPane.addTab("Fisica", null, pnFisic, null);

		lblNewLabel = new JLabel("R.G");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));

		lblNewLabel_1 = new JLabel("CPF");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));

		lblNewLabel_2 = new JLabel("E-mail");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));

		tfRg = new JTextField();
		tfRg.setColumns(10);

		tfCpf = new JTextField();
		tfCpf.setColumns(10);

		tfemail = new JTextField();
		tfemail.setColumns(10);
		GroupLayout gl_pnFisic = new GroupLayout(pnFisic);
		gl_pnFisic
				.setHorizontalGroup(gl_pnFisic.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnFisic.createSequentialGroup().addContainerGap()
								.addGroup(gl_pnFisic.createParallelGroup(Alignment.LEADING, false)
										.addGroup(gl_pnFisic.createSequentialGroup().addComponent(lblNewLabel_2)
												.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(tfemail))
										.addGroup(gl_pnFisic.createSequentialGroup()
												.addGroup(gl_pnFisic.createParallelGroup(Alignment.LEADING)
														.addComponent(lblNewLabel_1).addComponent(lblNewLabel))
												.addGap(18)
												.addGroup(gl_pnFisic.createParallelGroup(Alignment.LEADING)
														.addComponent(tfRg, GroupLayout.PREFERRED_SIZE, 138,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(tfCpf))))
								.addContainerGap(519, Short.MAX_VALUE)));
		gl_pnFisic.setVerticalGroup(gl_pnFisic.createParallelGroup(Alignment.LEADING).addGroup(gl_pnFisic
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_pnFisic.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel).addComponent(
						tfRg, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_pnFisic.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel_1).addComponent(
						tfCpf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_pnFisic.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel_2).addComponent(
						tfemail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(92, Short.MAX_VALUE)));
		pnFisic.setLayout(gl_pnFisic);

		pnJurid = new JPanel();
		tabbedPane.addTab("Juridica", null, pnJurid, null);

		lblCpnj = new JLabel("CPNJ");
		lblCpnj.setFont(new Font("Tahoma", Font.BOLD, 13));

		lblIncrioEstadual = new JLabel("Incri\u00E7\u00E3o Estadual");
		lblIncrioEstadual.setFont(new Font("Tahoma", Font.BOLD, 13));

		lblNewLabel_3 = new JLabel("WebSite");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));

		tfCnpj = new JTextField();
		tfCnpj.setColumns(10);

		tfInscri = new JTextField();
		tfInscri.setColumns(10);

		tfSite = new JTextField();
		tfSite.setColumns(10);
		GroupLayout gl_pnJurid = new GroupLayout(pnJurid);
		gl_pnJurid.setHorizontalGroup(gl_pnJurid.createParallelGroup(Alignment.LEADING).addGroup(gl_pnJurid
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_pnJurid.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnJurid.createSequentialGroup().addComponent(lblCpnj).addGap(18)
								.addComponent(tfCnpj, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnJurid.createSequentialGroup().addComponent(lblIncrioEstadual)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(tfInscri, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnJurid.createSequentialGroup().addComponent(lblNewLabel_3).addGap(18)
								.addComponent(tfSite, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(405, Short.MAX_VALUE)));
		gl_pnJurid.setVerticalGroup(gl_pnJurid.createParallelGroup(Alignment.LEADING).addGroup(gl_pnJurid
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_pnJurid.createParallelGroup(Alignment.BASELINE).addComponent(lblCpnj).addComponent(tfCnpj,
						GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(gl_pnJurid
						.createParallelGroup(Alignment.BASELINE).addComponent(lblIncrioEstadual).addComponent(tfInscri,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(gl_pnJurid.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel_3).addComponent(
						tfSite, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(67, Short.MAX_VALUE)));
		pnJurid.setLayout(gl_pnJurid);
		contentPane.setLayout(gl_contentPane);
	}

	public void actionPerformed(ActionEvent evento) {

		Object botao = evento.getSource();

		if (botao.equals(btnSalvar)) {

			Object aba = tabbedPane.getSelectedComponent();
			if (aba.equals(pnFisic)) {
				PessoaFisica cad = new PessoaFisica();

				cad.setCpf(tfCpf.getText());
				cad.setEmail(tfemail.getText());
				cad.setRg(tfRg.getText());
				cad.setNome(tfNome.getText());
				cad.setTelefone(tfTelef.getText());
                cad.setEndereco(ondefica);
				cadastro.add(cad);
			} else if (aba.equals(pnJurid)) {

				PessoaJuridica cad = new PessoaJuridica();
                
				cad.setCnpj(tfCnpj.getText());
				cad.setInscrEst(tfInscri.getText());
				cad.setNome(tfNome.getText());
				cad.setSite(tfSite.getText());
				cad.setTelefone(tfTelef.getText());
				cad.setEndereco(ondefica);
				cadastro.add(cad);

			} 
            ondefica = new Endereco();
			SwUtil.limpa(this);
			tfNome.requestFocus();
		} else if (botao.equals(btnEndereo)) {
			Endereco dialog = new Endereco();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} else if (botao.equals(btnListar)) {

			String msg = "";

			for (Pessoa cad : cadastro) {
				msg += cad + "\n";
			}
			JOptionPane.showMessageDialog(this, msg);
		} else {
			System.exit(0);
		}

	}

}