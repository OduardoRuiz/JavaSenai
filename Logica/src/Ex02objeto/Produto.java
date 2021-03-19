package Ex02objeto;

public class Produto {
	
	
	private String codigo ;
	private String descricao ;
	private double preco;
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
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	@Override
	public String toString() {
		return "codigo : " + codigo + ", descricao : " + descricao + ", preco : " + preco + "]";
	}
	
	
}
	