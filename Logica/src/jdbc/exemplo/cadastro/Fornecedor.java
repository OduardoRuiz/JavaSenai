package jdbc.exemplo.cadastro;
import lombok.Data;

@Data
public class Fornecedor { 
	
	private Integer idfornecedor;
	private String nome;
	private String endereco;
	@Override
	public String toString() {
		return "idfornecedor: " + idfornecedor + " nome: " + nome + " endereco: " + endereco;
	}
	
	

}
