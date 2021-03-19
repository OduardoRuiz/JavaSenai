package objetos.gui.resposta.ex02.model;

public class Alimenticio extends Produto {
	private String dataValidade;
	private String dataProducao;

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}

	public String getDateProducao() {
		return dataProducao;
	}

	public void setDateProducao(String dateProducao) {
		this.dataProducao = dateProducao;
	}

	@Override
	public String toString() {
		return super.toString() + " Data Validade: " + dataValidade + " Data Produção: " + dataProducao;
	}

}
