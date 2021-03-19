package Ex01;

public class Fornecedores {

	private String nome;
	private String ender;

	public Fornecedores() {
	}

	public String getNome() {
		return nome;

	}

	public void setNome(String nome) {
		this.nome = nome;

	}

	public String getEnder() {
		return ender;

	}

	public void setEnder(String ender) {
		this.ender = ender;

	}

	@Override
	public String toString() {

		return  "Nome:  " + nome +  "\n" + " Endereço: " + ender + "\n" + "__________________________" + "\n";
	}

}