package objetos.exemplos.agregacao.itemDePedido.model;

public class ItemDePedido {
	private int numero;
	private Produto item;
	private int quantidade;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Produto getItem() {
		return item;
	}

	public void setItem(Produto item) {
		this.item = item;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		String msg = String.format("Nº %d Produto: %s Qtd: %d Preço Total: %,.2f",
				numero, item.getNome(), quantidade, quantidade * item.getPrecoUnitario());
		
		return msg;
	}
}
