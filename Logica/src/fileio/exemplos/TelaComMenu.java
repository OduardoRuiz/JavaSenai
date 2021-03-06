package fileio.exemplos;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileFilter;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class TelaComMenu extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnArquivo;
	private JMenu mnAjuda;
	private JMenuItem mntmSalvar;
	private JSeparator separator;
	private JMenuItem mntmSair;
	private JMenuItem mntmSobre;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JMenuItem mntmAbrir;
	private JMenuItem mntmNovo;
	private JMenuItem mntmFechar;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaComMenu frame = new TelaComMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TelaComMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 438, 297);

		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		mnArquivo = new JMenu("Arquivo");
		menuBar.add(mnArquivo);

		mntmNovo = new JMenuItem("Novo");
		mntmNovo.addActionListener(this);
		mnArquivo.add(mntmNovo);

		mntmSalvar = new JMenuItem("Salvar");
		mntmSalvar.addActionListener(this);
		mnArquivo.add(mntmSalvar);

		mntmAbrir = new JMenuItem("Abrir");
		mntmAbrir.addActionListener(this);
		mnArquivo.add(mntmAbrir);

		mntmFechar = new JMenuItem("Fechar");
		mntmFechar.addActionListener(this);
		mnArquivo.add(mntmFechar);

		separator = new JSeparator();
		mnArquivo.add(separator);

		mntmSair = new JMenuItem("Sair");
		mntmSair.addActionListener(this);
		mnArquivo.add(mntmSair);

		mnAjuda = new JMenu("Ajuda");
		menuBar.add(mnAjuda);

		mntmSobre = new JMenuItem("Sobre...");
		mntmSobre.addActionListener(this);
		mnAjuda.add(mntmSobre);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);

		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);

	}

	public void actionPerformed(ActionEvent ev) {
		Object menu = ev.getSource();

	
		if (menu.equals(mntmNovo)) {
			
			FileManager.Novo(textArea);

		} else if (menu.equals(mntmSalvar)) {

			FileManager.Salvar(textArea);

		} else if (menu.equals(mntmSobre)) {

		} else if (menu.equals(mntmFechar)) {

		} else if (menu.equals(mntmAbrir)) {

			textArea.setText(FileManager.Abre());

		} else if (menu.equals(mntmSair)) {
		} else {
			System.exit(0);
		}
	}
}
