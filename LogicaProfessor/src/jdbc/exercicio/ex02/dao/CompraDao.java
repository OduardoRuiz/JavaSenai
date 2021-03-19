package jdbc.exercicio.ex02.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jdbc.exercicio.ex02.model.Compra;
import jdbc.exercicio.ex02.model.ItemDeCompra;


/* Data Access Object
// um padrão de desenvolvimento de projetos utilizado
// para concentrar o acesso a um determinado mecanismo
// que forneça dados para uma aplicação
*/
public class CompraDao {
	private PreparedStatement incluir;
	private PreparedStatement consultar;
	private PreparedStatement obterId;
	
	private ItemDao itemDao;
	
	public CompraDao() throws DaoException {
		try {
			// Estabelecer a conexão com o Bando de Dados
			Connection con = Database.getConnection();
			
			itemDao = new ItemDao();
			
			// Preparar os SQLs para a utilização posterior
			incluir = con.prepareStatement("insert into compra (data) values (?)");
			consultar = con.prepareStatement("select * from compra");
			
			obterId = con.prepareStatement("select last_insert_id() as id from compra"); // <<==
		} catch (SQLException ex) {
			ex.printStackTrace();
			throw new DaoException("Houve problema na conexão com o Banco de Dados");
		}
	}
	
	// construção das rotinas que farão a gestão dos dados
	public void incluir(Compra obj) throws DaoException {
		try {
			incluir.setDate(1, new java.sql.Date( obj.getData().getTime() ));
			incluir.execute();
			
			ResultSet resultado = obterId.executeQuery();						
			if(resultado.next()) {												
				int idcompra = resultado.getInt("id"); 
				for (ItemDeCompra item : obj.getItens()) {						
					itemDao.incluir(item, idcompra);					
				}																
			} else {															
				throw new DaoException("Falha ao incluir um Compra");		
			}																	
		} catch (SQLException ex) {
			ex.printStackTrace();
			throw new DaoException("Falha ao incluir um Compra");
		}
	}
	
	public List<Compra> consultar() throws DaoException {
		try {
			List<Compra> lista = new ArrayList<>();
			
			ResultSet resultado = consultar.executeQuery();
			while(resultado.next()) {
				Compra obj = new Compra();
				int idcompra = resultado.getInt("idcompra"); 
				obj.setId(idcompra);
				obj.setData(resultado.getDate("data"));
				obj.setItens(itemDao.consultar(idcompra));
				
				lista.add(obj);
			}
			
			return lista;
		} catch (SQLException ex) {
			ex.printStackTrace();
			throw new DaoException("Houve falha ao listar os Compras");
		}
	}
}







