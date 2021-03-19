package fundamentos;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

@SuppressWarnings("serial")
public class Ex02Tela extends JFrame {
	public Ex02Tela() {
		setTitle("Minha Folha de Pagamento");
		setLayout(new GridLayout(4, 1));
		
		JPanel painel1 = new JPanel(new FlowLayout(FlowLayout.LEADING));
		painel1.add(new JLabel("Nº de Horas"));
		JTextField tfHoras = new JTextField(5);
		painel1.add(tfHoras);
		add(painel1);

		JPanel painel2 = new JPanel(new FlowLayout(FlowLayout.LEADING));
		painel2.add(new JLabel("Salário Hora"));
		JTextField tfSalHora = new JTextField(10);
		painel2.add(tfSalHora);
		add(painel2);

		JPanel painel3 = new JPanel(new FlowLayout(FlowLayout.LEADING));
		painel3.add(new JLabel("Nº de Dependentes"));
		JTextField tfDep = new JTextField(3);
		painel3.add(tfDep);
		add(painel3);

		JPanel painel4 = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));
		JButton btCalcular = new JButton("Calcular");
		btCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String campoComErro = "Nº de Horas";
				try {
					String msg = "Minha Folha de Pagamento\n";
					
					int qtdHoras = Integer.parseInt(tfHoras.getText());
					msg += "\nQuant. horas trab.: " + qtdHoras;
					
					campoComErro = "Salário Hora";
					double salHora = Double.parseDouble(tfSalHora.getText());
					msg += String.format("\nSalário hora R$ %,.2f", salHora);
					
					campoComErro = "Nº de Dependentes";
					int dep = Integer.parseInt(tfDep.getText());
					msg += "\nNº de dependentes: " + dep;
					
					double salBruto = qtdHoras * salHora + 50 * dep;
					msg += String.format("\nSalário bruto R$ %,.2f", salBruto);
					
					double inss;
					if(salBruto <= 1000) {
						inss = salBruto * 0.085;
					} else {
						inss = salBruto * 0.09;
					}
					msg += String.format("\nDesconto de INSS R$ %,.2f", inss);
					
					double ir;
					if(salBruto <= 500) {
						ir = 0;
					} else if(salBruto <= 1000) {
						ir = salBruto * 0.05;
					} else {
						ir = salBruto * 0.07;
					}
					msg += String.format("\nDesconto de IR R$ %,.2f", ir);
					
					double salLiq = salBruto - inss - ir;
					msg += String.format("\nSalário Líquido R$ %,.2f", salLiq);
					
					JOptionPane.showMessageDialog(getParent(), msg);
	
					tfHoras.setText("");
					tfSalHora.setText("");
					tfDep.setText("");
					tfHoras.requestFocus();
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(getParent(), "A informação de " + campoComErro + " é inválida");
				}
			}
		});
		painel4.add(btCalcular);
		JButton btSair = new JButton("Sair");
		btSair.addActionListener(evento -> System.exit(0));
		painel4.add(btSair);
		add(painel4);

		getRootPane().setDefaultButton(btCalcular);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new Ex02Tela());
	}
}
