package objetos.gui.resposta.ex02.model;

public class Produto {
	private String codigo;
	private String descricao;
	private double valor;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return String.format("Código: %s Descrição: %s Valor: %,.2f", 
				 codigo, descricao, valor);
	}

}
