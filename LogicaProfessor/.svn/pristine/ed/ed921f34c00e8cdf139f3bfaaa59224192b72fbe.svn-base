package objetos.gui.resposta.ex05Table.view;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import objetos.gui.resposta.ex05Table.model.Produto;

@SuppressWarnings("serial")
public class ProdutoModel extends AbstractTableModel {
	private final String[] nomeDasColunas = new String[] {"Nome", "Preço"};
	private List<Produto> lista;
	
	public ProdutoModel(List<Produto> lista) {
		this.lista = lista;
	}
	
	// Determina a quantidade de registros (linhas) aprasentadas na Tabela
	@Override
	public int getRowCount() {
		return lista.size();
	}

	// Determina o nome das colunas apresentadas na Tabela
	@Override
	public String getColumnName(int col) {
		return nomeDasColunas[col];
	}

	// Determina o número de colunas apresentadas na Tabela
	@Override
	public int getColumnCount() {
		return nomeDasColunas.length;
	}

	// Determina o conteúdo a ser apresentado em cada célula da Tabela
	@Override
	public Object getValueAt(int linha, int col) {
		Produto obj = lista.get(linha);
		Object valor = null;
		
		switch (col) {
		case 0:
			valor = obj.getNome();
			break;
		case 1:
			valor = String.format("%,.2f", obj.getPreco());
			break;
		}
		
		return valor;
	}

}
