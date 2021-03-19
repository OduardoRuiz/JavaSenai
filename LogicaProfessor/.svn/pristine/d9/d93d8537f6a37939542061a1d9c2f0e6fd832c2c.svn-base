package objetos.exemplos;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

@SuppressWarnings("serial")
public class TelaDeCadastroDeContrato extends JFrame implements ActionListener {
	private JTextField tfNumero = new JTextField(6);
	private JTextField tfTitulo = new JTextField(15);
	private JTextField tfDescricao = new JTextField(20);
	private JButton btSalvar = new JButton("Salvar");
	private JButton btListar = new JButton("Listar");
	private JButton btSair = new JButton("Sair");
	
	private List<Contrato> cadastro = new ArrayList<>();
	
	public TelaDeCadastroDeContrato() {
		setTitle("Cadastro de Contratos");
		setLayout(new GridLayout(4, 1));
				
		JPanel painel1 = new JPanel(new FlowLayout(FlowLayout.LEADING));
		painel1.add(new JLabel("Número"));
		painel1.add(tfNumero);
		add(painel1);
		
		JPanel painel2 = new JPanel(new FlowLayout(FlowLayout.LEADING));
		painel2.add(new JLabel("Título"));
		painel2.add(tfTitulo);
		add(painel2);
		
		JPanel painel3 = new JPanel(new FlowLayout(FlowLayout.LEADING));
		painel3.add(new JLabel("Descr."));
		painel3.add(tfDescricao);
		add(painel3);
		
		JPanel painel4 = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));
		painel4.add(btSalvar);
		btSalvar.addActionListener(this);
		painel4.add(btListar);
		btListar.addActionListener(this);
		painel4.add(btSair);
		btSair.addActionListener(this);
		add(painel4);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setLocationRelativeTo(null);
		setResizable(false);
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		Object botao = evento.getSource();
		
		if(botao.equals(btSalvar)) {
			Contrato contrato = new Contrato();
			contrato.setNumero(Integer.parseInt(tfNumero.getText()));
			contrato.setTitulo(tfTitulo.getText());
			contrato.setDescricao(tfDescricao.getText());
			
			cadastro.add(contrato);
			
			tfNumero.setText("");
			tfTitulo.setText("");
			tfDescricao.setText("");
			tfNumero.requestFocus();
		} else if(botao.equals(btListar)) {
			String msg = "Lista dos Contratos Cadastrados\n\n";

			for (Contrato contrato : cadastro) {
				msg += contrato + "\n";
			}
			
			JOptionPane.showMessageDialog(null, msg);
			tfNumero.requestFocus();
		} else {
			System.exit(0);
		}
 	}	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				TelaDeCadastroDeContrato tela = new TelaDeCadastroDeContrato();
				tela.setVisible(true);
			}
		});
	}



	
}
