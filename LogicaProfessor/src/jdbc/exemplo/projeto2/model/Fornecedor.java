package jdbc.exemplo.projeto2.model;

import java.util.List;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Fornecedor {
	private Integer idfornecedor;
	private String nome;
	private String cnpj;
	private List<Produto> produtos;
	
	@Override
	public String toString() {
		return "Nome: " + nome + " CNPJ: " + cnpj + "\nProdutos:\n" + 
		produtos.stream()
			.map(f -> f.toString())
			.collect(Collectors.joining("\n")) + "\n";
	}	
}
