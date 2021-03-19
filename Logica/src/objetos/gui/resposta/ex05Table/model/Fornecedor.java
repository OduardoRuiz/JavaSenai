package objetos.gui.resposta.ex05Table.model;

import java.util.List;


import lombok.Data;

@Data
public class Fornecedor {
	private String nome;
	private String cnpj;
	private List<Produto> produtos;
}
