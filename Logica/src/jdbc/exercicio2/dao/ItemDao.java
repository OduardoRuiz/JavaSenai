package jdbc.exercicio2.dao;

import java.awt.event.ItemEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import jdbc.exercicio2.model.Compra;
import jdbc.exercicio2.model.ItemDeCompra;

public class ItemDao {
	
	
	private PreparedStatement incluir;
	private PreparedStatement consultar;

	public ItemDao() throws DaoException { 
		
		try { 
		Connection con = Database.getConnection();
		
		incluir = con.prepareStatement("insert into Itemdecompra (nome, quantidade, valor, idcompra) Values (?, ?, ?, ?)");
		
		consultar = con.prepareStatement("select * from itemdecompra where idcompra = ? ");
		
	}catch (SQLException ex) {
		
		ex.printStackTrace();
		
		throw new DaoException("houve um problemana conexão com o banco de dados");
		
	}
	

	} public void incluir(ItemDeCompra obj, int idcompra) throws DaoException {
		
		
		try { 
			incluir.setString(1, obj.getNome());
			incluir.setInt(2, obj.getQuantidade());
			incluir.setDouble(3, obj.getValor());
			incluir.setInt(4, idcompra);
			incluir.execute();
			
		}catch (SQLException ex) { 
			
			ex.printStackTrace();
			throw new DaoException("falha ao incluir um produto");
		}

		
	}
	
	public List<ItemDeCompra> consultar (int idcompra) throws DaoException { 
		
		
		try {  
			List<ItemDeCompra> lista = new ArrayList<>();
			
			consultar.setInt(1, idcompra);
			
			ResultSet resultado = consultar.executeQuery();
			
			
			while (resultado.next())  { 
				
				 ItemDeCompra obj = new ItemDeCompra();
				
				obj.setId(resultado.getInt("idcompra"));
				obj.setNome(resultado.getString("nome"));
				obj.setQuantidade(resultado.getInt("quantidade"));
				obj.setValor(resultado.getDouble("Valor"));
				
				lista.add(obj);
				
				
			}
			
			return lista;
			
		} catch (SQLException ex) {
			ex.printStackTrace();
			throw new DaoException("Houve falha ao listar os Itens");
		}
		
	}
}























