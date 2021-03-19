package objetos.gui.resposta.ex05Table.model;

import java.util.List;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Fornecedor {
	private String nome;
	private String cnpj;
	private List<Produto> produtos;
	
	@Override
	public String toString() {
		return "Nome: " + nome + " CNPJ: " + cnpj + " Produtos\n" + 
		produtos.stream()
			.map(f -> f.toString())
			.collect(Collectors.joining("\n"));
	}	
}
