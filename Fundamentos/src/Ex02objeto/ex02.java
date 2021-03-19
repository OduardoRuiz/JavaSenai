package Ex02objeto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.TabableView;

import Ex01.Fornecedores;

import javax.swing.JComboBox;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.DropMode;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

@SuppressWarnings("serial")
public class ex02 extends JFrame implements ActionListener {

	private List<Produto> cadastro = new ArrayList<>();

	private JPanel contentPane;
	private JTextField tfCodigo;
	private JLabel lblCodigo;
	private JLabel lblNewLabel;
	private JTextField tfDescricao;
	private JLabel lblNewLabel_1;
	private JTextField tfPreco;
	private JTabbedPane tabbedPane;
	private JPanel painelAlimentos;
	private JPanel painelEletro;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField tfValidade;
	private JTextField tfFabricacao;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField tfCodForn;
	private JTextField tfNomeForn;
	private JButton btnSalvar;
	private JButton btnListar;
	private JButton btnSair;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ex02 frame = new ex02();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ex02() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				ex02.class.getResource("/com/sun/javafx/scene/control/skin/modena/HTMLEditor-Paste-Black.png")));
		setTitle("Cadastro De Produtos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 569, 416);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		tfCodigo = new JTextField();
		tfCodigo.addActionListener(this);
		tfCodigo.setColumns(10);

		lblCodigo = new JLabel("Codigo");
		lblCodigo.setIcon(new ImageIcon(ex02.class.getResource("/javax/swing/plaf/metal/icons/ocean/computer.gif")));
		lblCodigo.setFont(new Font("Arial Black", Font.PLAIN, 14));

		lblNewLabel = new JLabel("Descri\u00E7\u00E3o");
		lblNewLabel.setIcon(new ImageIcon(
				ex02.class.getResource("/com/sun/javafx/scene/control/skin/modena/HTMLEditor-Center-Black.png")));
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 14));

		tfDescricao = new JTextField();
		tfDescricao.addActionListener(this);
		tfDescricao.setColumns(10);

		lblNewLabel_1 = new JLabel("Pre\u00E7o");
		lblNewLabel_1
				.setIcon(new ImageIcon(ex02.class.getResource("/javax/swing/plaf/metal/icons/ocean/collapsed.gif")));
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 14));

		tfPreco = new JTextField();
		tfPreco.addActionListener(this);
		tfPreco.setColumns(10);

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);

		btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(this);
		btnSalvar.setIcon(
				new ImageIcon(ex02.class.getResource("/com/sun/java/swing/plaf/windows/icons/FloppyDrive.gif")));

		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setIcon(new ImageIcon(
				ex02.class.getResource("/com/sun/javafx/scene/control/skin/modena/HTMLEditor-Bullets-Black-rtl.png")));

		btnSair = new JButton("Sair");
		btnSair.addActionListener(this);
		btnSair.setIcon(new ImageIcon(
				ex02.class.getResource("/com/sun/deploy/uitoolkit/impl/fx/ui/resources/image/graybox_error.png")));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblCodigo, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
									.addGap(30)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(tfDescricao, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE)
										.addComponent(tfCodigo, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
										.addComponent(tfPreco, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(25)
							.addComponent(btnSalvar)
							.addGap(122)
							.addComponent(btnListar)
							.addPreferredGap(ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
							.addComponent(btnSair)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(tfCodigo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCodigo))
					.addGap(29)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(tfDescricao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(33)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(tfPreco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(34)
					.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnListar)
						.addComponent(btnSalvar)
						.addComponent(btnSair)))
		);

		painelEletro = new JPanel();
		tabbedPane.addTab("Eletrodom\u00E9sticos",
				new ImageIcon(ex02.class.getResource("/com/sun/javafx/webkit/prism/resources/mediaPlayDisabled.png")),
				painelEletro, null);

		lblNewLabel_4 = new JLabel("Codigo do Fornecedor : ");
		lblNewLabel_4.setFont(new Font("Arial Black", Font.PLAIN, 12));

		lblNewLabel_5 = new JLabel("Nome do Fornecedor :");
		lblNewLabel_5.setFont(new Font("Arial Black", Font.PLAIN, 12));

		tfCodForn = new JTextField();
		tfCodForn.addActionListener(this);
		tfCodForn.setColumns(10);

		tfNomeForn = new JTextField();
		tfNomeForn.addActionListener(this);
		tfNomeForn.setColumns(10);
		GroupLayout gl_painelEletro = new GroupLayout(painelEletro);
		gl_painelEletro.setHorizontalGroup(gl_painelEletro.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelEletro.createSequentialGroup().addContainerGap()
						.addGroup(gl_painelEletro.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 173,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_5))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_painelEletro.createParallelGroup(Alignment.LEADING)
								.addComponent(tfCodForn, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfNomeForn, GroupLayout.PREFERRED_SIZE, 259, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(72, Short.MAX_VALUE)));
		gl_painelEletro.setVerticalGroup(gl_painelEletro.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelEletro.createSequentialGroup().addContainerGap()
						.addGroup(gl_painelEletro.createParallelGroup(Alignment.BASELINE)
								.addComponent(tfCodForn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_4))
						.addGap(18)
						.addGroup(gl_painelEletro.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel_5)
								.addComponent(tfNomeForn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addContainerGap(49, Short.MAX_VALUE)));
		painelEletro.setLayout(gl_painelEletro);

		painelAlimentos = new JPanel();
		tabbedPane.addTab("Aliment\u00EDcios",
				new ImageIcon(
						ex02.class.getResource("/com/sun/javafx/scene/web/skin/FontBackgroundColor_16x16_JFX.png")),
				painelAlimentos, null);
		tabbedPane.setBackgroundAt(1, Color.GRAY);

		lblNewLabel_2 = new JLabel("Data da Validade : ");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 12));

		lblNewLabel_3 = new JLabel("Data da Produ\u00E7\u00E3o :");
		lblNewLabel_3.setFont(new Font("Arial Black", Font.PLAIN, 12));

		tfValidade = new JTextField();
		tfValidade.addActionListener(this);
		tfValidade.setColumns(10);

		tfFabricacao = new JTextField();
		tfFabricacao.addActionListener(this);
		tfFabricacao.setColumns(10);
		GroupLayout gl_painelAlimentos = new GroupLayout(painelAlimentos);
		gl_painelAlimentos
				.setHorizontalGroup(gl_painelAlimentos.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_painelAlimentos.createSequentialGroup().addContainerGap()
								.addGroup(gl_painelAlimentos.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_3).addComponent(lblNewLabel_2))
								.addGap(18)
								.addGroup(gl_painelAlimentos.createParallelGroup(Alignment.LEADING)
										.addComponent(tfValidade, GroupLayout.PREFERRED_SIZE, 143,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(tfFabricacao, GroupLayout.PREFERRED_SIZE, 270,
												GroupLayout.PREFERRED_SIZE))
								.addContainerGap(84, Short.MAX_VALUE)));
		gl_painelAlimentos.setVerticalGroup(gl_painelAlimentos.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelAlimentos.createSequentialGroup().addContainerGap()
						.addGroup(gl_painelAlimentos.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel_2)
								.addComponent(tfValidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_painelAlimentos.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel_3)
								.addComponent(tfFabricacao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addContainerGap(61, Short.MAX_VALUE)));
		painelAlimentos.setLayout(gl_painelAlimentos);
		contentPane.setLayout(gl_contentPane);
	}

	public void actionPerformed(ActionEvent evento) {
		
	Object botao = evento.getSource();
	
	if ( botao.equals (btnSalvar)); {
	Object aba = tabbedPane.getSelectedComponent();
	
	
	if (aba.equals(painelAlimentos)) {
	
		
		Alimenticio prod = new Alimenticio();
        prod.setCodigo(tfCodigo.getText());
		prod.setDescricao(tfDescricao.getText());
		prod.setPreco(tfPreco.getText());
		prod.setDtval(tfValidade.getText());
		prod.setDtprod(tfFabricacao);
		
		
		cadastro.add(prod);
        
        
	tfCodigo.setText("");
    tfCodForn.setText("");
    tfDescricao.setText("");
    tfFabricacao.setText("");
    tfValidade.setText("");
    tfNomeForn.setText("");
    tfPreco.setText("");
		
	}
	else {
		
		(aba.equals(painelEletro)) {
			
			
			Eletro prod = new Eletro();
	        prod.setCodigo(tfCodigo.getText());
			prod.setDescricao(tfDescricao.getText());
			prod.setPreco(tfPreco.getText());
			prod.setNomeForn(tfNomeForn.getText());
			prod.setCodforn(tfCodForn.getText());
			
			cadastro.add(prod);
	}
	else if ( botao.equals(btnListar)); {
    	
    	String msg = "Lista dos Contratos Cadastrados\n\n";

		for (Produto produtos : cadastro) {
			
		
			tabbedPane.getSelectedComponent();
		     msg += produtos + "\n";
		}
		
		JOptionPane.showMessageDialog(null, msg);
		JOptionPane.showMessageDialog( tabbedPane.getSelectedComponent(), cadastro);
		
    } else { 
    	System.exit(0);
    }
	
	}
}