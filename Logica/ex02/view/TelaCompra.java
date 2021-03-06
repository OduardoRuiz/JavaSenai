package jdbc.exercicio.ex02.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
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

import jdbc.exercicio.ex02.model.Compra;
import jdbc.exercicio.ex02.model.ItemDeCompra;
import jdbc.exercicio.ex02.view.adapter.ItemModel;



@SuppressWarnings("serial")
public class TelaCompra extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblData;
	private JTextField tfData;
	private JPanel panel;
	private JScrollPane scrollPane;
	private JTable table;
	private JButton btAdd;
	private JButton btDel;
	private JButton btnSalvar;
	private JButton btnListar;
	private JButton btnFechar;

	private DateFormat df = DateFormat.getDateInstance();
	
	private List<Compra> cadastro = new ArrayList<>();
	private List<ItemDeCompra> itens;
	private ItemModel model;

	public TelaCompra() {
		setTitle("Efetuar Compras");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 462, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		lblData = new JLabel("Data");
		
		tfData = new JTextField();
		tfData.setColumns(10);
		
		panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Itens da Compra", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(this);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		
		btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(this);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 426, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(lblData)
								.addGap(18)
								.addComponent(tfData, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(btnSalvar)
								.addGap(106)
								.addComponent(btnListar)
								.addPreferredGap(ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
								.addComponent(btnFechar))))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblData)
						.addComponent(tfData, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSalvar)
						.addComponent(btnListar)
						.addComponent(btnFechar))
					.addContainerGap())
		);
		
		scrollPane = new JScrollPane();
		
		btAdd = new JButton("+");
		btAdd.addActionListener(this);
		
		btDel = new JButton("-");
		btDel.addActionListener(this);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(btAdd)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btDel)))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btAdd)
						.addComponent(btDel))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		table = new JTable();
		table.setAutoCreateRowSorter(true);
		scrollPane.setViewportView(table);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
		
		preparaTabela();
	}
	
	private void preparaTabela() {
		itens = new ArrayList<>();
		model = new ItemModel(itens);
		table.setModel(model);
	}
	
	public void actionPerformed(ActionEvent ev) {
		Object botao = ev.getSource();
		
		if(botao.equals(btAdd)) {
			ItemDeCompra item = new ItemDeCompra();
			TelaItens dialog = new TelaItens(item);
			dialog.setLocationRelativeTo(this);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
			
			if(!dialog.isCancelada()) {
				model.adicionar(item);
			}
		} else if(botao.equals(btDel)) {
			int linha = table.getSelectedRow();
			if(linha > -1) {
				if(table.getRowSorter() != null) {
					linha = table.getRowSorter().convertRowIndexToModel(linha);
				}
				model.excluir(linha);
			} else {
				JOptionPane.showMessageDialog(this, "Selecione um Item para ser excluido!");
			}
		} else if(botao.equals(btnSalvar)) {
			try {
				Compra compra = new Compra();
				compra.setData(df.parse(tfData.getText()));
				compra.setItens(itens);
				
				cadastro.add(compra);
				
				preparaTabela();
				
				tfData.setText("");
				tfData.requestFocus();
			} catch (ParseException ex) {
				JOptionPane.showMessageDialog(this, "Data Inv??lida");
			}
		} else if(botao.equals(btnListar)) {
			JOptionPane.showMessageDialog(this, 
					"Cadastro de Compras Efetuadas\n\n" + 
					cadastro.stream()
						.map((f) -> f.toString())
						.collect(Collectors.joining("\n")));
		} else {
			System.exit(0);
		}		
	}
}
