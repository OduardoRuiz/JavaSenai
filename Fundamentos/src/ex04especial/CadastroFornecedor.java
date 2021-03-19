package ex04especial;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class CadastroFornecedor extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JPanel pnFornecedor;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField tfEndForn;
	private JPanel pnProduto;
	/**
	 * @wbp.nonvisual location=651,359
	 */
	@SuppressWarnings("unused")
	private final JLabel label = new JLabel("New label");
	private JLabel lblNewLabel_2;
	private JTextField tfNomeProd;
	private JLabel lblNewLabel_3;
	private JTextField tfPrecoProd;
	private JButton btnSalvar;
	private JButton btnListar;
	private JButton btnSair;
	private List<Produto> cadastro = new ArrayList<>();
	private JTextField tfNomeForn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroFornecedor frame = new CadastroFornecedor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CadastroFornecedor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 484, 406);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		pnFornecedor = new JPanel();
		pnFornecedor.setBorder(
				new TitledBorder(null, "Fornecedor", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED));

		pnProduto = new JPanel();
		pnProduto.setBorder(new TitledBorder(null, "Produto", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED));

		btnSalvar = new JButton("Salvar");
		btnSalvar.setIcon(
				new ImageIcon(CadastroFornecedor.class.getResource("/javax/swing/plaf/metal/icons/ocean/floppy.gif")));
		btnSalvar.addActionListener(this);

		btnListar = new JButton("Listar");
		btnListar.setIcon(new ImageIcon(
				CadastroFornecedor.class.getResource("/javax/swing/plaf/metal/icons/ocean/hardDrive.gif")));
		btnListar.addActionListener(this);

		btnSair = new JButton("Sair");
		btnSair.setIcon(new ImageIcon(
				CadastroFornecedor.class.getResource("/com/sun/javafx/scene/web/skin/DecreaseIndent_16x16_JFX.png")));
		btnSair.addActionListener(this);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(10).addComponent(btnSalvar).addGap(98)
								.addComponent(btnListar, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, 82, Short.MAX_VALUE).addComponent(btnSair))
						.addComponent(pnProduto, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(pnFornecedor, GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE))
				.addContainerGap(31, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addContainerGap()
						.addComponent(pnFornecedor, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(pnProduto, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(btnSalvar)
										.addComponent(btnSair))
								.addComponent(btnListar))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		lblNewLabel_2 = new JLabel("Nome");
		lblNewLabel_2.setIcon(new ImageIcon(CadastroFornecedor.class
				.getResource("/com/sun/javafx/scene/control/skin/modena/HTMLEditor-Bullets-Black.png")));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));

		tfNomeProd = new JTextField();
		tfNomeProd.setColumns(10);

		lblNewLabel_3 = new JLabel("Pre\u00E7o");
		lblNewLabel_3.setIcon(new ImageIcon(
				CadastroFornecedor.class.getResource("/com/sun/javafx/webkit/prism/resources/mediaPlayDisabled.png")));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));

		tfPrecoProd = new JTextField();
		tfPrecoProd.setFont(new Font("Tahoma", Font.PLAIN, 11));
		tfPrecoProd.setColumns(10);
		GroupLayout gl_pnProduto = new GroupLayout(pnProduto);
		gl_pnProduto.setHorizontalGroup(gl_pnProduto.createParallelGroup(Alignment.LEADING).addGroup(gl_pnProduto
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_pnProduto.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnProduto.createSequentialGroup().addComponent(lblNewLabel_2).addGap(18)
								.addComponent(tfNomeProd, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnProduto.createSequentialGroup().addComponent(lblNewLabel_3).addGap(18)
								.addComponent(tfPrecoProd, GroupLayout.PREFERRED_SIZE, 128,
										GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(106, Short.MAX_VALUE)));
		gl_pnProduto.setVerticalGroup(gl_pnProduto.createParallelGroup(Alignment.LEADING).addGroup(gl_pnProduto
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_pnProduto.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel_2).addComponent(
						tfNomeProd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(gl_pnProduto.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel_3).addComponent(
						tfPrecoProd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(57, Short.MAX_VALUE)));
		pnProduto.setLayout(gl_pnProduto);

		lblNewLabel = new JLabel("Nome");
		lblNewLabel.setIcon(new ImageIcon(CadastroFornecedor.class
				.getResource("/com/sun/javafx/scene/control/skin/modena/HTMLEditor-Bullets-Black.png")));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));

		lblNewLabel_1 = new JLabel("Endere\u00E7o");
		lblNewLabel_1.setIcon(new ImageIcon(CadastroFornecedor.class
				.getResource("/com/sun/javafx/scene/control/skin/modena/HTMLEditor-Paste-Black.png")));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));

		tfEndForn = new JTextField();
		tfEndForn.setColumns(10);

		tfNomeForn = new JTextField();
		tfNomeForn.setColumns(10);
		GroupLayout gl_pnFornecedor = new GroupLayout(pnFornecedor);
		gl_pnFornecedor
				.setHorizontalGroup(gl_pnFornecedor.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnFornecedor.createSequentialGroup()
								.addGroup(gl_pnFornecedor.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_1).addComponent(lblNewLabel))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_pnFornecedor.createParallelGroup(Alignment.LEADING)
										.addComponent(tfEndForn, GroupLayout.PREFERRED_SIZE, 301,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(tfNomeForn, GroupLayout.PREFERRED_SIZE, 264,
												GroupLayout.PREFERRED_SIZE))
								.addContainerGap(35, Short.MAX_VALUE)));
		gl_pnFornecedor.setVerticalGroup(gl_pnFornecedor.createParallelGroup(Alignment.LEADING).addGroup(gl_pnFornecedor
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_pnFornecedor
						.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel).addComponent(tfNomeForn,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(28)
				.addGroup(gl_pnFornecedor.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel_1)
						.addComponent(tfEndForn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
				.addContainerGap(44, Short.MAX_VALUE)));
		pnFornecedor.setLayout(gl_pnFornecedor);
		contentPane.setLayout(gl_contentPane);
	}

	public void actionPerformed(ActionEvent evento) {

		Object botao = evento.getSource();

		if (botao.equals(btnSalvar)) {

			Fornecedor forn = new Fornecedor();

			forn.setNome(tfNomeForn.getText());
			forn.setEnd(tfEndForn.getText());

			Produto prod = new Produto();
			prod.setNome(tfNomeProd.getText());
			prod.setPreco(Double.parseDouble(tfPrecoProd.getText()));

			prod.setFornecedor(forn);

			cadastro.add(prod);

			SwUtil.limpa(this);

		} else if (botao.equals(btnListar)) {

			String msg = "";

			for (Produto cad : cadastro) {

				msg += cad + "\n";
			}
			JOptionPane.showMessageDialog(this, msg);

		} else {

			System.exit(0);
		}

	}
}
