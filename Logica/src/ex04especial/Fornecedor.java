package ex04especial;

public class Fornecedor {

	private String nome;
	private String end;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	@Override
	public String toString() {
		return "nome: " + nome + " end: " + end;
	}

}
