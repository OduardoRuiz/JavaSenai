package jdbc.exercicio2.model;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;

public class Compra {
	private Integer id;
	private Date data;
	private List<ItemDeCompra> itens;
	private static DateFormat df = DateFormat.getDateInstance();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public List<ItemDeCompra> getItens() {
		return itens;
	}

	public void setItens(List<ItemDeCompra> itens) {
		this.itens = itens;
	}

	@Override
	public String toString() {
		String lista = "";
		for (ItemDeCompra item : itens)
			lista += item + "\n";
		
		return "Data: " + df.format(data) + "\n" + lista;
	}

}
