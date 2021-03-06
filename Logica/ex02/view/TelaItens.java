package jdbc.exercicio.ex02.view;

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

import jdbc.exercicio.ex02.model.ItemDeCompra;


@SuppressWarnings("serial")
public class TelaItens extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblNome;
	private JTextField tfNome;
	private JLabel lblQuantidade;
	private JTextField tfQuantidade;
	private JLabel lblValor;
	private JTextField tfValor;
	private JButton btnSalvar;
	private JButton btnFechar;
	
	private ItemDeCompra item;
	private boolean foiCancelada = true;  

	public TelaItens(ItemDeCompra item) {
		setModal(true);
		setTitle("Criar Item");
		setBounds(100, 100, 450, 166);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		lblNome = new JLabel("Nome");
		
		tfNome = new JTextField();
		tfNome.setColumns(10);
		
		lblQuantidade = new JLabel("Quantidade");
		
		tfQuantidade = new JTextField();
		tfQuantidade.setColumns(10);
		
		lblValor = new JLabel("Valor");
		
		tfValor = new JTextField();
		tfValor.setColumns(10);
		
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
						.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING, false)
							.addGroup(gl_contentPanel.createSequentialGroup()
								.addComponent(lblNome)
								.addGap(18)
								.addComponent(tfNome, GroupLayout.PREFERRED_SIZE, 357, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_contentPanel.createSequentialGroup()
								.addComponent(lblQuantidade)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(tfQuantidade, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(lblValor)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(tfValor)))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(btnSalvar)
							.addPreferredGap(ComponentPlacement.RELATED, 230, Short.MAX_VALUE)
							.addComponent(btnFechar)))
					.addContainerGap())
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNome)
						.addComponent(tfNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblQuantidade)
						.addComponent(tfQuantidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblValor)
						.addComponent(tfValor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSalvar)
						.addComponent(btnFechar))
					.addContainerGap())
		);
		contentPanel.setLayout(gl_contentPanel);
		
		carregaItem(item);
	}
	
	private void carregaItem(ItemDeCompra item) {
		this.item = item;
		tfNome.setText(item.getNome());
		tfQuantidade.setText(String.valueOf(item.getQuantidade()));
		tfValor.setText(String.format("%,.2f", item.getValor()));
	}
	
	public boolean isCancelada() {
		return foiCancelada;
	}
	
	public void actionPerformed(ActionEvent ev) {
		try {
			if(ev.getSource().equals(btnSalvar)) {
				NumberFormat nf = NumberFormat.getNumberInstance();
				item.setNome(tfNome.getText());
				item.setQuantidade(Integer.parseInt(tfQuantidade.getText()));
				item.setValor(nf.parse(tfValor.getText()).doubleValue());
				foiCancelada = false;
			}
			setVisible(false);
		} catch(ParseException ex) {
			JOptionPane.showMessageDialog(this, "Valor inv??lido");
		}
	}
}
