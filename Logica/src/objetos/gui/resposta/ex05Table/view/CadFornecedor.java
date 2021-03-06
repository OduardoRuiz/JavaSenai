package objetos.gui.resposta.ex05Table.view;

import java.awt.EventQueue;
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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import objetos.gui.resposta.ex05Table.model.CadProduto;
import objetos.gui.resposta.ex05Table.model.Fornecedor;
import objetos.gui.resposta.ex05Table.model.Produto;

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

	private List<Fornecedor> cadastro = new ArrayList<>();
	private List<Produto> produtos = new ArrayList<>();
	private ProdutoModel model = new ProdutoModel(produtos);

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadFornecedor frame = new CadFornecedor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
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

		btnSair = new JButton("Sair");
		btnSair.addActionListener(this);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addComponent(lblNome)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(tfNome, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addComponent(lblCnpj)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(tfCnpj, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(Alignment.LEADING,
										gl_contentPane.createSequentialGroup().addContainerGap().addComponent(btnSalvar)
												.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)
												.addComponent(btnSair))
								.addComponent(panel, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 344,
										GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(96, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lblNome).addComponent(
						tfNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lblCnpj).addComponent(
						tfCnpj, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(panel, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED, 95, Short.MAX_VALUE).addGroup(gl_contentPane
						.createParallelGroup(Alignment.BASELINE).addComponent(btnSalvar).addComponent(btnSair))
				.addContainerGap()));

		scrollPane = new JScrollPane();

		btAdiciona = new JButton("+");
		btAdiciona.addActionListener(this);

		btRemove = new JButton("-");
		btRemove.addActionListener(this);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup().addContainerGap().addComponent(scrollPane,
								GroupLayout.PREFERRED_SIZE, 318, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
								.addComponent(btAdiciona, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btRemove, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(8, Short.MAX_VALUE)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
				.createSequentialGroup().addContainerGap()
				.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED, 38, Short.MAX_VALUE).addGroup(gl_panel
						.createParallelGroup(Alignment.BASELINE).addComponent(btAdiciona).addComponent(btRemove))
				.addContainerGap()));
		// table.setAutoCreateRowSorter(true);
		table = new JTable();
		table.setModel(model);
		scrollPane.setViewportView(table);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}

	public void actionPerformed(ActionEvent evento) {

		Object botao = evento.getSource();

		if (botao.equals(btAdiciona)) {

			Produto obj = new Produto();

			CadProduto dialog = new CadProduto(obj);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);

			if (dialog.devoGravar) {

				// adiciona o produto em uma lista
				produtos.add(obj);

				// informar ao produto model que tem novos produtos na lista

				model.fireTableDataChanged();

			}
		} else if (botao.equals(btRemove)) {
			// obtem o numero da linha selecionada na tabela
			int linha = table.getSelectedRow();
			// verifica se existe uma linha selecionada na tabela

			if (linha >= 0) {
				// verifica se foi criadoum ordenador para os dados da tabela

				if (table.getRowSorter() != null) {
					// Solicida ao ordenador para ajustar a linha segunda posi????ao na tela
					
					linha = table.getRowSorter().convertRowIndexToModel(linha);

				}

				int op = JOptionPane.showOptionDialog(this, "confirma a exclus??o desse produto? ", "Remover produto",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[] { "Sim", "NAO" },
						"SIM");

				if (op == 0) {
					// remove o produto representado pela linha selecionadada na lista
					produtos.remove(linha);

					// informaao produto model que tem produtos removidos da lista
					model.fireTableDataChanged();
				}
			} else {
				JOptionPane.showMessageDialog(this, "nenhuma linha foi selecionada");
			}
		} else if (botao.equals(btnSalvar)) {
		} else {
			System.exit(0);
		}
	}
}

