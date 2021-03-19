package jdbc.exercicio.ex02.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jdbc.exercicio.ex02.model.ItemDeCompra;

public class ItemDao {
	private PreparedStatement incluir;
	private PreparedStatement consultar; 

	public ItemDao() throws DaoException {
		try {
			// Estabelecer a conexão com o Bando de Dados
			Connection con = Database.getConnection();
			
			// Preparar os SQLs para a utilização posterior
			incluir = con.prepareStatement(
					"insert into item (nome, quantidade, valor, idcompra) values (?, ?, ?, ?)");
			consultar = con.prepareStatement("select * from item where idcompra = ?"); 
		} catch (SQLException ex) {
			ex.printStackTrace();
			throw new DaoException("Houve problema na conexão com o Banco de Dados");
		}
	}
	
	// construção das rotinas que farão a gestão dos dados
	public void incluir(ItemDeCompra obj, int idcompra) throws DaoException {
		try {
			incluir.setString(1, obj.getNome());
			incluir.setInt(2, obj.getQuantidade());
			incluir.setDouble(3, obj.getValor());
			incluir.setInt(4, idcompra);
			incluir.execute();
		} catch (SQLException ex) {
			ex.printStackTrace();
			throw new DaoException("Falha ao incluir um Item");
		}
	}


	public List<ItemDeCompra> consultar(int idcompra) throws DaoException {  
		try {
			List<ItemDeCompra> lista = new ArrayList<>();
			
			consultar.setInt(1, idcompra);  
			ResultSet resultado = consultar.executeQuery();
			
			while(resultado.next()) {
				ItemDeCompra obj = new ItemDeCompra();
				obj.setId(resultado.getInt("iditem"));				
				obj.setNome(resultado.getString("nome"));
				obj.setQuantidade(resultado.getInt("quantidade"));
				obj.setValor(resultado.getDouble("valor"));
				
				lista.add(obj);
			}
			
			return lista;
		} catch (SQLException ex) {
			ex.printStackTrace();
			throw new DaoException("Houve falha ao listar os Itens");
		}
	}

}
