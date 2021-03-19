package Ex03Objeto;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;

@SuppressWarnings({ "serial", "unused" })
public class Endereco extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblNewLabel;
	private JLabel lblNumero;
	private JLabel lblComplemento;
	private JLabel lblBairrr;
	private JLabel lblCep;
	private JLabel lblBairro;
	private JLabel lblNewLabel_1;
	private JTextField tfLogradouro;
	private JTextField tfNumeroRua;
	private JTextField tfComplemento;
	private JTextField tfBairro;
	private JTextField tfCep;
	private JTextField tfCidade;
	private JTextField tfEstadoUf;
	private JButton btnSalvar;
	private JButton btnFechar;
	private CadastroEndereco cadastro;

	
	
	
	public Endereco() {
		setModal(true);
		setBounds(100, 100, 643, 303);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.WEST);

		lblNewLabel = new JLabel("Logradouro");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));

		lblNumero = new JLabel("Numero");
		lblNumero.setFont(new Font("Tahoma", Font.BOLD, 13));

		lblComplemento = new JLabel("Complemento");
		lblComplemento.setFont(new Font("Tahoma", Font.BOLD, 13));

		lblBairrr = new JLabel("Bairro");
		lblBairrr.setFont(new Font("Tahoma", Font.BOLD, 13));

		lblCep = new JLabel("Cep");
		lblCep.setFont(new Font("Tahoma", Font.BOLD, 13));

		lblBairro = new JLabel("Cidade");
		lblBairro.setFont(new Font("Tahoma", Font.BOLD, 13));

		lblNewLabel_1 = new JLabel("UF");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));

		tfLogradouro = new JTextField();
		tfLogradouro.setColumns(10);

		tfNumeroRua = new JTextField();
		tfNumeroRua.setColumns(10);

		tfComplemento = new JTextField();
		tfComplemento.setColumns(10);

		tfBairro = new JTextField();
		tfBairro.setColumns(10);

		tfCep = new JTextField();
		tfCep.setColumns(10);

		tfCidade = new JTextField();
		tfCidade.setColumns(10);

		tfEstadoUf = new JTextField();
		tfEstadoUf.setColumns(10);

		btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(this);

		btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(this);
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup().addContainerGap().addGroup(gl_contentPanel
						.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPanel.createSequentialGroup().addComponent(lblComplemento)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(tfComplemento, GroupLayout.PREFERRED_SIZE, 168,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
										.addComponent(lblBairrr).addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(tfBairro, GroupLayout.PREFERRED_SIZE, 141,
												GroupLayout.PREFERRED_SIZE)
										.addGap(79))
								.addGroup(gl_contentPanel.createSequentialGroup().addGroup(gl_contentPanel
										.createParallelGroup(Alignment.TRAILING, false)
										.addGroup(gl_contentPanel.createSequentialGroup().addComponent(lblNewLabel)
												.addPreferredGap(ComponentPlacement.RELATED).addComponent(tfLogradouro))
										.addGroup(Alignment.LEADING, gl_contentPanel.createSequentialGroup()
												.addComponent(lblCep).addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(tfCep, GroupLayout.PREFERRED_SIZE, 126,
														GroupLayout.PREFERRED_SIZE)
												.addGap(44).addComponent(lblBairro)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(tfCidade, GroupLayout.PREFERRED_SIZE, 119,
														GroupLayout.PREFERRED_SIZE)
												.addGap(18).addComponent(lblNewLabel_1)))
										.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_contentPanel.createSequentialGroup()
														.addPreferredGap(ComponentPlacement.RELATED, 35,
																Short.MAX_VALUE)
														.addComponent(lblNumero)
														.addPreferredGap(ComponentPlacement.UNRELATED)
														.addComponent(tfNumeroRua, GroupLayout.PREFERRED_SIZE, 107,
																GroupLayout.PREFERRED_SIZE)
														.addContainerGap())
												.addGroup(gl_contentPanel.createSequentialGroup()
														.addPreferredGap(ComponentPlacement.UNRELATED)
														.addComponent(tfEstadoUf, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addContainerGap())))
								.addGroup(gl_contentPanel.createSequentialGroup().addComponent(btnSalvar)
										.addContainerGap(536, Short.MAX_VALUE)))
						.addComponent(btnFechar, Alignment.TRAILING))));
		gl_contentPanel.setVerticalGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPanel
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel)
						.addComponent(lblNumero)
						.addComponent(tfLogradouro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(tfNumeroRua, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE).addComponent(lblComplemento)
						.addComponent(lblBairrr)
						.addComponent(tfComplemento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(tfBairro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING).addGroup(gl_contentPanel
						.createSequentialGroup()
						.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE).addComponent(lblCep)
								.addComponent(lblBairro).addComponent(lblNewLabel_1)
								.addComponent(tfCep, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(tfCidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(tfEstadoUf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED, 103, Short.MAX_VALUE).addComponent(btnSalvar)
						.addContainerGap()).addComponent(btnFechar))));
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
	}

     private void atualizaTela(CadastroEndereco novoEndereco) {

		cadastro = novoEndereco;

		tfBairro.setText(novoEndereco.getBairro());
		tfCep.setText(novoEndereco.getCep());
		tfCidade.setText(novoEndereco.getCidade());
		tfComplemento.setText(novoEndereco.getComplemento());
		tfEstadoUf.setText(novoEndereco.getUf());
		tfLogradouro.setText(novoEndereco.getLograd());
		tfNumeroRua.setText(novoEndereco.getNumero());
	
     
     }

	public void actionPerformed(ActionEvent evento) {

		
		if (evento.getSource().equals(btnSalvar)) {
			
			cadastro.setBairro(tfBairro.getText());
			cadastro.setCep(tfCep.getText());
			cadastro.setCidade(tfCidade.getText());
			cadastro.setComplemento(tfCidade.getText());
			cadastro.setLograd(tfLogradouro.getText());
			cadastro.setNumero(tfNumeroRua.getText());
			cadastro.setUf(tfEstadoUf.getText());

		} else {
			setVisible(false);

		}

	}

}
