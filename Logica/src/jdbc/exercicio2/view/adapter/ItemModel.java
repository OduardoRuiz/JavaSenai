package jdbc.exercicio2.view.adapter;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import jdbc.exercicio2.model.ItemDeCompra;



@SuppressWarnings("serial")
public class ItemModel extends AbstractTableModel {
	private List<ItemDeCompra> lista;
	private String[] titulo = { "Nome" , "Quantidade", "Valor" };
	
	public ItemModel(List<ItemDeCompra> lista) {
		this.lista = lista;
	}

	public void adicionar(ItemDeCompra item) {
		lista.add(item);
		fireTableDataChanged();
	}

	public void excluir(int linha) {
		lista.remove(linha);
		fireTableDataChanged();
	}

	@Override
	public int getRowCount() {
		return lista.size();
	}

	@Override
	public int getColumnCount() {
		return titulo.length;
	}

	@Override
	public String getColumnName(int col) {
		return titulo[col];
	}
	
	@Override
	public Object getValueAt(int linha, int col) {
		Object valor = null;
		ItemDeCompra obj = lista.get(linha);
		
		switch (col) {
		case 0:
			valor = obj.getNome();
			break;
		case 1:
			valor = String.valueOf(obj.getQuantidade());
			break;
		case 2:
			valor = String.format("%,.2f", obj.getValor());
			break;
		}
		return valor;
	}
}
