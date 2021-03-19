package fileio.exemplos;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	private JMenuItem mntmEditar;
	private JMenuItem mntmSalvar;
	private JSeparator separator;
	private JMenuItem mntmSair;
	private JMenuItem mntmSobre;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	
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
		
		mntmEditar = new JMenuItem("Editar");
		mntmEditar.addActionListener(this);
		mnArquivo.add(mntmEditar);
		
		mntmSalvar = new JMenuItem("Salvar");
		mntmSalvar.addActionListener(this);
		mnArquivo.add(mntmSalvar);
		
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
		
		if(menu.equals(mntmEditar)) {
			
		} else if(menu.equals(mntmSalvar)) {
			
		} else if(menu.equals(mntmSobre)) {
			
		} else {
			System.exit(0);
		}
	}
}
