package fileio.exemplos;

import java.awt.FileDialog;
import java.awt.Frame;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Ordena {
	public static void main(String[] args) {
		List<Cliente> lista = new ArrayList<>();
		lista.add(new Cliente("João", 34));
		lista.add(new Cliente("Mateus", 22));
		lista.add(new Cliente("Bela", 34));
		
		Collections.sort(lista, 
				Comparator.comparing(Cliente::getIdade)
				.thenComparing(Cliente::getNome)
				.reversed());
		
		FileDialog tela = new FileDialog((Frame)null, "Teste de gravação", FileDialog.SAVE);
		tela.setVisible(true);
		
		try (
			PrintWriter arquivo = new PrintWriter(tela.getDirectory() + tela.getFile());
			) {
			arquivo.println( lista.stream()
					.map(Cliente::toString)
					.collect(Collectors.joining("\n")));

		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
}

@Data
@AllArgsConstructor
class Cliente {
	private String nome;
	private int idade;
	
	@Override
	public String toString() {
		return "nome: " + nome + " idade: " + idade;
	}
}