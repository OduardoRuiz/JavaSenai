package objetos.gui.resposta.ex05Table.model;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.text.ParseException;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class CadProduto extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblNewLabel;
	private JTextField tfNome;
	private JLabel lblNewLabel_1;
	private JTextField tfPreco;
	private JButton btnSalvar;
	private JButton btnFechar;
	private Produto obj;
	public boolean devoGravar = false;
	private NumberFormat fmt = NumberFormat.getNumberInstance();

	public CadProduto(Produto prod) {

		this.obj = prod;

		fmt.setMaximumFractionDigits(2);
		fmt.setMinimumFractionDigits(2);

		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(CadProduto.class.getResource("/com/sun/javafx/scene/web/skin/AlignRight_16x16_JFX.png")));
		setModal(true);
		setTitle("Cadastro de Produtos");
		setBounds(100, 100, 392, 218);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);

		lblNewLabel = new JLabel("Nome");
		lblNewLabel.setIcon(new ImageIcon(
				CadProduto.class.getResource("/com/sun/javafx/scene/control/skin/modena/HTMLEditor-Paste-Black.png")));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));

		tfNome = new JTextField();
		tfNome.setColumns(10);

		lblNewLabel_1 = new JLabel("Preço");
		lblNewLabel_1.setIcon(
				new ImageIcon(CadProduto.class.getResource("/javax/swing/plaf/metal/icons/ocean/computer.gif")));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));

		tfPreco = new JTextField();
		tfPreco.setColumns(10);

		btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(this);
		btnSalvar
				.setIcon(new ImageIcon(CadProduto.class.getResource("/javax/swing/plaf/metal/icons/ocean/floppy.gif")));

		btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(this);
		btnFechar.setFont(new Font("Arial", Font.PLAIN, 11));
		btnFechar.setIcon(
				new ImageIcon(CadProduto.class.getResource("/com/sun/javafx/scene/web/skin/Cut_16x16_JFX.png")));
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING).addGroup(
				gl_contentPanel.createSequentialGroup().addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup().addComponent(lblNewLabel)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(tfNome, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup().addComponent(lblNewLabel_1)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(tfPreco, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(90, Short.MAX_VALUE))
				.addGroup(gl_contentPanel.createSequentialGroup().addContainerGap().addComponent(btnSalvar)
						.addPreferredGap(ComponentPlacement.RELATED, 179, Short.MAX_VALUE).addComponent(btnFechar)
						.addGap(26)));
		gl_contentPanel.setVerticalGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPanel
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_contentPanel
						.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel).addComponent(tfNome,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel_1)
						.addComponent(tfPreco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED, 63, Short.MAX_VALUE).addGroup(gl_contentPanel
						.createParallelGroup(Alignment.BASELINE).addComponent(btnSalvar).addComponent(btnFechar))
				.addContainerGap()));
		contentPanel.setLayout(gl_contentPanel);
	}

	public void actionPerformed(ActionEvent evento) {

		Object botao = evento.getSource();

		try {
			if (botao.equals(btnSalvar)) {

				String nome = tfNome.getText();
				if (!nome.isEmpty()) {

					obj.setNome(nome);
					obj.setPreco(fmt.parse(tfPreco.getText()).doubleValue());

					devoGravar = true;
					setVisible(false);

				} else {
					JOptionPane.showMessageDialog(this, "O nome do Produto é obrigatorio");

				}

			} else {

				devoGravar = false;
				setVisible(false);
			}

			

		} catch (ParseException ex) {
			JOptionPane.showMessageDialog(this, "Preço Inválido");
		}
	}
}
