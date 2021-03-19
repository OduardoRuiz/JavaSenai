package objetos.regex;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import objetos.gui.lib.SwUtil;

@SuppressWarnings("serial")
public class MeuDialogo extends JDialog implements ActionListener {
	private final JPanel contentPanel = new JPanel();
	private JFormattedTextField textField;
	private JLabel lbMsg;

	public static void main(String[] args) {
		new MeuDialogo("Informe o código do produto", "####-##");

	}
	
	public MeuDialogo(String msg, String mascara) {
		setResizable(false);
		setModal(true);
		setBounds(100, 100, 405, 144);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		lbMsg = new JLabel(msg);
		lbMsg.setBounds(21, 11, 61, 16);
		
		textField = new JFormattedTextField(SwUtil.criaMascara(mascara));

		textField.setBounds(21, 45, 363, 26);
		textField.setColumns(10);
		JButton btnOk = new JButton("OK");
		btnOk.setBounds(21, 82, 75, 29);
		btnOk.addActionListener(this);
		JButton btnCancela = new JButton("Cancela");
		btnCancela.setBounds(291, 82, 93, 29);
		btnCancela.addActionListener(this);
		contentPanel.setLayout(null);
		contentPanel.add(lbMsg);
		contentPanel.add(textField);
		contentPanel.add(btnOk);
		contentPanel.add(btnCancela);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent ev) {
		String botao = ev.getActionCommand();
		
		if(botao.equals("OK")) {
			JOptionPane.showMessageDialog(null, textField.getText());
		}
		setVisible(false);
	}

}
