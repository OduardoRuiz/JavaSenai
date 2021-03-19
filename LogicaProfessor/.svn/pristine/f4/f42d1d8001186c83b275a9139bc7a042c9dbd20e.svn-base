package objetos.gui.resposta.ex02.view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

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

import objetos.gui.lib.SwUtil;
import objetos.gui.resposta.ex02.model.Alimenticio;
import objetos.gui.resposta.ex02.model.Eletrodomestico;
import objetos.gui.resposta.ex02.model.Produto;

@SuppressWarnings("serial")
public class CadastraProduto extends JFrame implements ActionListener {
	private JPanel contentPane;
	private JLabel lblCd;
	private JTextField tfCod;
	private JLabel lblDescr;
	private JTextField tfDescr;
	private JLabel lblValor;
	private JTextField tfValor;
	private JTabbedPane tabbedPane;
	private JPanel pnAliment;
	private JPanel pnEletro;
	private JLabel lblDataDeValidade;
	private JTextField tfValidade;
	private JLabel lblDataDeProduo;
	private JTextField tfProducao;
	private JLabel lblCdigoDoProduto;
	private JTextField tfCodForn;
	private JLabel lblNomeDoFornecedor;
	private JTextField tfNomeForn;
	private JButton btnSalvar;
	private JButton btnListar;
	private JButton btnSair;
	
	private List<Produto> cadastro = new ArrayList<>();
	private NumberFormat formatador;

	{
		formatador = NumberFormat.getInstance();
		formatador.setMaximumFractionDigits(2);
		formatador.setMinimumFractionDigits(2);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastraProduto frame = new CadastraProduto();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CadastraProduto() {
		setTitle("Cad. Produtos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 325);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		lblCd = new JLabel("Cód.");
		
		tfCod = new JTextField();
		tfCod.setColumns(10);
		
		lblDescr = new JLabel("Descr.");
		
		tfDescr = new JTextField();
		tfDescr.setColumns(10);
		
		lblValor = new JLabel("Valor");
		
		tfValor = new JTextField();
		tfValor.setColumns(10);
		
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
						.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 413, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblCd)
								.addComponent(lblDescr)
								.addComponent(lblValor))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(tfValor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfCod, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfDescr, GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnSalvar)
							.addGap(101)
							.addComponent(btnListar)
							.addPreferredGap(ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
							.addComponent(btnSair)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCd)
						.addComponent(tfCod, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDescr)
						.addComponent(tfDescr, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblValor)
						.addComponent(tfValor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSalvar)
						.addComponent(btnSair)
						.addComponent(btnListar))
					.addContainerGap())
		);
		
		pnAliment = new JPanel();
		tabbedPane.addTab("Alimentício", null, pnAliment, null);
		
		lblDataDeValidade = new JLabel("Data de Validade");
		
		tfValidade = new JTextField();
		tfValidade.setColumns(10);
		
		lblDataDeProduo = new JLabel("Data de Produção");
		
		tfProducao = new JTextField();
		tfProducao.setColumns(10);
		GroupLayout gl_pnAliment = new GroupLayout(pnAliment);
		gl_pnAliment.setHorizontalGroup(
			gl_pnAliment.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnAliment.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnAliment.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnAliment.createSequentialGroup()
							.addComponent(lblDataDeValidade)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tfValidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnAliment.createSequentialGroup()
							.addComponent(lblDataDeProduo)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(tfProducao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(159, Short.MAX_VALUE))
		);
		gl_pnAliment.setVerticalGroup(
			gl_pnAliment.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnAliment.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnAliment.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDataDeValidade)
						.addComponent(tfValidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_pnAliment.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDataDeProduo)
						.addComponent(tfProducao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(26, Short.MAX_VALUE))
		);
		pnAliment.setLayout(gl_pnAliment);
		
		pnEletro = new JPanel();
		tabbedPane.addTab("Eletrodoméstico", null, pnEletro, null);
		
		lblCdigoDoProduto = new JLabel("Código do Fornecedor");
		
		tfCodForn = new JTextField();
		tfCodForn.setColumns(10);
		
		lblNomeDoFornecedor = new JLabel("Nome do Fornecedor");
		
		tfNomeForn = new JTextField();
		tfNomeForn.setColumns(10);
		GroupLayout gl_pnEletro = new GroupLayout(pnEletro);
		gl_pnEletro.setHorizontalGroup(
			gl_pnEletro.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnEletro.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnEletro.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCdigoDoProduto)
						.addComponent(lblNomeDoFornecedor))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnEletro.createParallelGroup(Alignment.LEADING)
						.addComponent(tfNomeForn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfCodForn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(126, Short.MAX_VALUE))
		);
		gl_pnEletro.setVerticalGroup(
			gl_pnEletro.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnEletro.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnEletro.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCdigoDoProduto)
						.addComponent(tfCodForn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_pnEletro.createParallelGroup(Alignment.BASELINE)
						.addComponent(tfNomeForn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNomeDoFornecedor))
					.addContainerGap(22, Short.MAX_VALUE))
		);
		pnEletro.setLayout(gl_pnEletro);
		contentPane.setLayout(gl_contentPane);
		
		setLocationRelativeTo(null);
		getRootPane().setDefaultButton(btnSalvar);
	}
	
	public void actionPerformed(ActionEvent evento) {
		Object botao = evento.getSource();
		
	
		if(botao.equals(btnSalvar)) {
			Object aba = tabbedPane.getSelectedComponent();
			try {
				if(aba.equals(pnAliment)) {
					Alimenticio prod = new Alimenticio();
					prod.setCodigo(tfCod.getText());
					prod.setDescricao(tfDescr.getText());
					prod.setValor(formatador.parse(tfValor.getText()).doubleValue());
					prod.setDataValidade(tfValidade.getText());
					prod.setDateProducao(tfProducao.getText());
					
					cadastro.add(prod);
				} else {
					Eletrodomestico prod = new Eletrodomestico();
					prod.setCodigo(tfCod.getText());
					prod.setDescricao(tfDescr.getText());
					prod.setValor(Double.parseDouble(tfValor.getText()));
					prod.setCodigoFornecedor(tfCodForn.getText());
					prod.setNomeFornecedor(tfNomeForn.getText());
					
					cadastro.add(prod);
					
				}
				
				SwUtil.limpa(this);
				tfCod.requestFocus();
			} catch (ParseException ex) {
				JOptionPane.showMessageDialog(this, "O Valor do Produto está inválido");
			}
		} else if(botao.equals(btnListar)) {
			String msg = "";
			for (Produto prod : cadastro) {
				msg += prod + "\n";
			}
			JOptionPane.showMessageDialog(this, msg);
		} else {
			System.exit(0);
		}
	}
}
