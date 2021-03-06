package fileio.exemplos;

import java.awt.FileDialog;
import java.awt.Frame;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Collectors;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class FileManager {
	
	public static String Abre() {
		String texto = "";
		FileDialog tela =  new FileDialog((Frame)null, "Teste de Leitura", FileDialog.LOAD);
		tela.setVisible(true);
		
		try (
			FileReader file =  new FileReader(tela.getDirectory()+tela.getFile());
			BufferedReader arquivo = new BufferedReader(file) 
			) {
			
			String linha = arquivo.readLine();
			while(linha != null) {
				texto += linha + "\n";
				
				linha = arquivo.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		
	
		
	}
		return texto;

}
	
	public static void Salvar (JTextArea txt) {
		try {
			FileDialog fd = new FileDialog((JDialog) null, "Salvar", FileDialog.SAVE);
			fd.setFile("*.txt");
			fd.setVisible(true);
			String nomearq = fd.getDirectory() + fd.getFile();
			
			PrintWriter out = new PrintWriter(nomearq);
			
			int inicio = 0;
			int fim = -1;
			for (int i = 0; i < txt.getLineCount(); i++) {
				fim = txt.getLineEndOffset(i);
				String linha = "";
				if(fim > inicio) {
					String texto = txt.getText().substring(inicio, fim);
					if(texto.contains("\n"))
						linha = texto.substring(0, texto.length()-1);
					else
						linha = texto;
				}
				out.println(linha);
				inicio = fim;
			}
			txt.setText("");
			out.close();
		} catch (Exception ex) {
			ex.printStackTrace();
	}
		
	}
	
		
		
		
	public static void Novo (JTextArea txt) {

		try { 
			
			if (!txt.getText().isEmpty()) { 
				
				int op = JOptionPane.showOptionDialog(null, "message, title, optionType, messageType, icon, "sim" "nao", initialValue");
			
						
			}
			
		
		
		 
		} catch (Exception ex ) { 
			
			ex.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	