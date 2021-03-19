package Ex03Objeto;

public class CadastroEndereco {

	String lograd;
	String complemento;
	String cep;
	String cidade;
	String numero;
	String bairro;
	String uf;

	public String getLograd() {
		return lograd;
	}

	public void setLograd(String lograd) {
		this.lograd = lograd;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	@Override
	public String toString() {
		return "CadastroEndereco [lograd=" + lograd + ", complemento=" + complemento + ", cep=" + cep + ", cidade="
				+ cidade + ", numero=" + numero + ", bairro=" + bairro + ", uf=" + uf + "]";
	}
}
