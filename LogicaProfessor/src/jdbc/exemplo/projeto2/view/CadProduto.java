package jdbc.exemplo.projeto2.view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.text.ParseException;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import jdbc.exemplo.projeto2.model.Produto;


@SuppressWarnings("serial")
public class CadProduto extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblNome;
	private JTextField tfProduto;
	private JLabel lblPreo;
	private JTextField tfPreco;
	private JButton btnSalvar;
	private JButton btnFechar;

	private Produto obj;
	public boolean devoGravar;
	private NumberFormat fmt = NumberFormat.getNumberInstance();
	
	public CadProduto(Produto prod) {
		this.obj = prod;
		
		fmt.setMaximumFractionDigits(2);
		fmt.setMinimumFractionDigits(2);
		
		setModal(true);
		setTitle("Cad. Produto");
		setBounds(100, 100, 322, 151);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		lblNome = new JLabel("Nome");
		
		tfProduto = new JTextField();
		tfProduto.setColumns(10);
		
		lblPreo = new JLabel("Preço");
		
		tfPreco = new JTextField();
		tfPreco.setColumns(10);
		
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
							.addComponent(lblNome)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tfProduto, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(lblPreo)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tfPreco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(btnSalvar)
							.addPreferredGap(ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
							.addComponent(btnFechar)))
					.addContainerGap())
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNome)
						.addComponent(tfProduto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPreo)
						.addComponent(tfPreco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSalvar)
						.addComponent(btnFechar))
					.addContainerGap())
		);
		contentPanel.setLayout(gl_contentPanel);
	}
	
	public void actionPerformed(ActionEvent evento) {
		Object botao = evento.getSource();
		
		try {
			if(botao.equals(btnSalvar)) {
				
				String nome = tfProduto.getText();
				if(!nome.isEmpty()) {
					obj.setNome(nome);
					obj.setPreco(fmt.parse(tfPreco.getText()).doubleValue());
		
					devoGravar = true;
					setVisible(false);
				} else {
					JOptionPane.showMessageDialog(this, "O Nome do Produto é obrigatório");
				}
			} else {
				devoGravar = false;
				setVisible(false);
			}
		} catch (ParseException ex) {
			JOptionPane.showMessageDialog(this, "Preço inválido");
		}
	}
}
