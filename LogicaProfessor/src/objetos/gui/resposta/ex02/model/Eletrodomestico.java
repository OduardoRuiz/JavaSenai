package objetos.gui.resposta.ex02.model;

public class Eletrodomestico extends Produto {
	private String codigoFornecedor;
	private String nomeFornecedor;

	public String getCodigoFornecedor() {
		return codigoFornecedor;
	}

	public void setCodigoFornecedor(String codigoFornecedor) {
		this.codigoFornecedor = codigoFornecedor;
	}

	public String getNomeFornecedor() {
		return nomeFornecedor;
	}

	public void setNomeFornecedor(String nomeFornecedor) {
		this.nomeFornecedor = nomeFornecedor;
	}

	@Override
	public String toString() {
		return super.toString() + " Código do Fornecedor: " + codigoFornecedor + 
				" Nome do Fornecedor: " + nomeFornecedor;
	}

}
