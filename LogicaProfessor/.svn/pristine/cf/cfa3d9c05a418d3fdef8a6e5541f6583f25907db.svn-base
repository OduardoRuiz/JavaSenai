package objetos.exemplos._interfaces;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;

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
		
		JOptionPane.showMessageDialog(null, 
				lista.stream()
					.map(Cliente::toString)
					.collect(Collectors.joining("\n")));
				
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