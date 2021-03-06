package jdbc.exercicio2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;

import jdbc.exercicio2.model.Compra;
import jdbc.exercicio2.model.ItemDeCompra;

     public class CompraDao {
	
	private PreparedStatement incluir;
	private PreparedStatement consultar;
	private PreparedStatement obterId;
	
	
	
	private ItemDao itemDao;
	
	
	public CompraDao() throws DaoException {  
		
		try { 
			Connection con = Database.getConnection();
			
			itemDao = new ItemDao();
			
			
			
			incluir = con.prepareStatement("insert into compra (Data) Values (?)");
			
			consultar = con.prepareStatement("select * from compra");
			
			obterId = con.prepareStatement ("select last_insert_id() as idcompra from compra ");
		} catch (SQLException ex ) { 
			
			ex.printStackTrace();
			throw new DaoException("Houve problema na conexÃ£o com o Banco de Dados");
			
		}
	
	

}
	
	
	public void incluir (Compra obj) throws DaoException { 
		
		try { 
			
			incluir.setDate(1, new java.sql.Date(obj.getData().getTime()));
			incluir.execute();
			
			ResultSet resultado = obterId.executeQuery();
			
			if(resultado.next()) { 
				
				int idcompra = resultado.getInt("idcompra");
				
				for (ItemDeCompra item : obj.getItens()) { 
					
					itemDao.incluir(item, idcompra);
					
				} 
			} else { 
				throw new DaoException("falha ao incluir Compra");
			}
		
	} catch (SQLException ex ) { 
		
		ex.printStackTrace();
		
		throw new DaoException("falha ao incluir compra");
	}
} 
	
	public List<Compra> consultar() throws DaoException { 
		
		try { 
			
			List<Compra> lista = new ArrayList<>();
			
			
			ResultSet resultado = consultar.executeQuery();
			
			while(resultado.next()) { 
				
				Compra obj = new Compra();
				
				int idcompra =  resultado.getInt("idcompra");
				
				obj.setData(resultado.getDate("data"));
				obj.setId(idcompra);
				obj.setItens(itemDao.consultar(idcompra));
				
			   lista.add(obj);
			}
			
			
			return lista;
		
		
		
		}catch (SQLException ex) {
			ex.printStackTrace();
			throw new DaoException("Houve falha ao listar os items ");
	}
	
	
}
}


















