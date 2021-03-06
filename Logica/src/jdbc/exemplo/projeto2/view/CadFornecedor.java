package jdbc.exemplo.projeto2.view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import jdbc.exemplo.projeto2.dao.DaoException;
import jdbc.exemplo.projeto2.dao.Database;
import jdbc.exemplo.projeto2.dao.FornecedorDao;
import jdbc.exemplo.projeto2.model.Fornecedor;
import jdbc.exemplo.projeto2.model.Produto;
import objetos.gui.lib.SwUtil;

@SuppressWarnings("serial")
public class CadFornecedor extends JFrame implements ActionListener {
	private JPanel contentPane;
	private JLabel lblNome;
	private JTextField tfNome;
	private JLabel lblCnpj;
	private JTextField tfCnpj;
	private JPanel panel;
	private JScrollPane scrollPane;
	private JTable table;
	private JButton btAdiciona;
	private JButton btRemove;
	private JButton btnSalvar;
	private JButton btnSair;

	private FornecedorDao cadastro; // <<===
	private List<Produto> produtos = new ArrayList<>();
	private ProdutoModel model = new ProdutoModel(produtos);
	private JButton btnListar;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadFornecedor frame = new CadFornecedor();
					frame.cadastro = new FornecedorDao();                 // <====
					frame.setVisible(true);
				} catch (Exception ex) {					              // <<===
					JOptionPane.showMessageDialog(null, ex.getMessage()); // <<===
				}
			}
		});
	}

	public CadFornecedor() {
		setTitle("Cad. Fornecedores");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 367, 342);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		lblNome = new JLabel("Nome");
		
		tfNome = new JTextField();
		tfNome.setColumns(10);
		
		lblCnpj = new JLabel("CNPJ");
		
		tfCnpj = new JTextField();
		tfCnpj.setColumns(10);
		
		panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Produtos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
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
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNome)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tfNome, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblCnpj)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tfCnpj, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addContainerGap()
								.addComponent(btnSalvar)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnListar)
								.addGap(50)
								.addComponent(btnSair))
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 344, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(13, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNome)
						.addComponent(tfNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCnpj)
						.addComponent(tfCnpj, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSalvar)
						.addComponent(btnSair)
						.addComponent(btnListar))
					.addContainerGap())
		);
		
		scrollPane = new JScrollPane();
		
		btAdiciona = new JButton("+");
		btAdiciona.addActionListener(this);
		
		btRemove = new JButton("-");
		btRemove.addActionListener(this);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 318, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(btAdiciona, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btRemove, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(8, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btAdiciona)
						.addComponent(btRemove))
					.addContainerGap())
		);
		
		table = new JTable();
		table.setAutoCreateRowSorter(true); 
		table.setModel(model); 
		scrollPane.setViewportView(table);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
	
	public void actionPerformed(ActionEvent evento) {
		Object botao = evento.getSource();
		
		try {												//<===
			if(botao.equals(btAdiciona)) {
				// Criar um Produto
				Produto obj = new Produto();
				
				CadProduto dialog = new CadProduto(obj);
				dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialog.setVisible(true);
	
				if(dialog.devoGravar) {			
					// Adicionar o Produto em uma lista de Produtos
					produtos.add(obj);
					
					// Informar ao ProdutoModel que tem novos Produtos na lista
					model.fireTableDataChanged();
				}
			} else if(botao.equals(btRemove)) {
				// Obt??m o n??mero da linha selecionada na Tabela
				int linha = table.getSelectedRow();
				// Verifica se existe uma linha selecionada na Tabela
				if(linha >= 0) {
					// Verifica se foi criado um ordenador para os dados da Tabela
					if(table.getRowSorter() != null) {
						// Solicita ao ordenador para ajustar a linha segundo a posi????o na tela
						linha = table.getRowSorter().convertRowIndexToModel(linha);
					}
					
					int op = JOptionPane.showOptionDialog(this, "Confirma a exclus??o deste Produto?", 
							"Remover Produto", JOptionPane.YES_NO_OPTION, 
							JOptionPane.QUESTION_MESSAGE, null, 
							new String[] {"Sim", "N??o"}, "Sim");
					
					if(op == 0) {
						// Remove o produto, representado pela linha selecionada, da lista
						produtos.remove(linha);
						// Informar ao ProdutoModel que tem Produtos foram removidos da lista
						model.fireTableDataChanged();
					}
				} else {
					JOptionPane.showMessageDialog(this, "Nenhuma linha foi selecionada");
				}
			} else if(botao.equals(btnSalvar)) {
				Fornecedor obj = new Fornecedor();
				obj.setNome(tfNome.getText());
				obj.setCnpj(tfCnpj.getText());
				obj.setProdutos(produtos);
				
				cadastro.incluir(obj);    // <<=====
				
				produtos = new ArrayList<>();
				model.setLista(produtos);
				SwUtil.limpa(this);
				tfNome.requestFocus();
			} else if(botao.equals(btnListar)) {
				JOptionPane.showMessageDialog(this, 
						"Cadastro de Fornecedores e Produtos\n\n" + 
						cadastro.consultar().stream()						//<<====
							.map((f) -> f.toString())
							.collect(Collectors.joining("\n")));
	
			} else {
				Database.closeConnection();    									//<<====
				System.exit(0);
			}
		} catch (DaoException ex) {
			JOptionPane.showMessageDialog(this, ex.getMessage()); 				// <<===
		}
	}
}





