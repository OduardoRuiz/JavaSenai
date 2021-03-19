package objetos.gui.resposta.ex03.view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import objetos.gui.resposta.ex03.model.Endereco;

@SuppressWarnings("serial")
public class CadEndereco extends JDialog implements ActionListener {
	private final JPanel contentPanel = new JPanel();
	private JLabel lblLogr;
	private JTextField tfLogr;
	private JLabel lblN;
	private JTextField tfNum;
	private JLabel lblBairro;
	private JTextField tfBairro;
	private JLabel lblCep;
	private JTextField tfCep;
	private JLabel lblCompl;
	private JTextField tfCompl;
	private JLabel lblCidade;
	private JTextField tfCidade;
	private JLabel lblUf;
	private JTextField tfEstado;
	private JButton btnSalvar;
	private JButton btnFechar;

	private Endereco oEndereco;

	public CadEndereco(Endereco endereco) {
		setResizable(false);
		setModal(true);
		setTitle("Cadastro de Endereços");
		setBounds(100, 100, 564, 216);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		lblLogr = new JLabel("Logr.");
		
		tfLogr = new JTextField();
		tfLogr.setColumns(10);
		
		lblN = new JLabel("Nº");
		
		tfNum = new JTextField();
		tfNum.setColumns(10);
		
		lblBairro = new JLabel("Bairro");
		
		tfBairro = new JTextField();
		tfBairro.setColumns(10);
		
		lblCep = new JLabel("CEP");
		
		tfCep = new JTextField();
		tfCep.setColumns(10);
		
		lblCompl = new JLabel("Compl.");
		
		tfCompl = new JTextField();
		tfCompl.setColumns(10);
		
		lblCidade = new JLabel("Cidade");
		
		tfCidade = new JTextField();
		tfCidade.setColumns(10);
		
		lblUf = new JLabel("UF");
		
		tfEstado = new JTextField();
		tfEstado.setColumns(10);
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(this);
		
		btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(this);
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(lblLogr)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tfLogr, GroupLayout.PREFERRED_SIZE, 324, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblN)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tfNum, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(lblBairro)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tfBairro, GroupLayout.PREFERRED_SIZE, 299, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblCep)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tfCep, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(lblCompl)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tfCompl, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblCidade)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tfCidade, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblUf)
							.addGap(12)
							.addComponent(tfEstado, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(btnSalvar)
							.addPreferredGap(ComponentPlacement.RELATED, 344, Short.MAX_VALUE)
							.addComponent(btnFechar)))
					.addContainerGap())
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLogr)
						.addComponent(tfLogr, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblN)
						.addComponent(tfNum, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblBairro)
						.addComponent(tfBairro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCep)
						.addComponent(tfCep, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCompl)
						.addComponent(tfCompl, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCidade)
						.addComponent(tfCidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblUf)
						.addComponent(tfEstado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSalvar)
						.addComponent(btnFechar))
					.addContainerGap())
		);
		contentPanel.setLayout(gl_contentPanel);
		
		atualizaTela(endereco);
	}
	
	private void atualizaTela(Endereco endereco) {
		oEndereco = endereco;
		tfLogr.setText(endereco.getLogradouro());
		tfNum.setText(endereco.getNumero());
		tfBairro.setText(endereco.getBairro());
		tfCep.setText(endereco.getCep());
		tfCompl.setText(endereco.getComplemento());
		tfCidade.setText(endereco.getCidade());
		tfEstado.setText(endereco.getEstado());
	}
	
	public void actionPerformed(ActionEvent evento) {
		if(evento.getSource().equals(btnSalvar)) {
			oEndereco.setLogradouro(tfLogr.getText());
			oEndereco.setNumero(tfNum.getText());
			oEndereco.setBairro(tfBairro.getText());
			oEndereco.setCep(tfCep.getText());
			oEndereco.setComplemento(tfCompl.getText());
			oEndereco.setCidade(tfCidade.getText());
			oEndereco.setEstado(tfEstado.getText());
		}
		
		setVisible(false);
	}
}
