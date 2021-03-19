package jdbc.exemplo.projeto2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jdbc.exemplo.projeto.DaoException;
import jdbc.exemplo.projeto2.model.Produto;

public class ProdutoDao {
	
	private PreparedStatement incluir;
	private PreparedStatement consultar;
	
	
	
	public ProdutoDao() throws DaoException {
		
		try { 
			// Estabelecer a conexão com o banco de dados
			
			Connection con = DataBase.getConnection();
			
			//Prepara os SQLs para a utilização posterior
			
			incluir = con.prepareStatement("INSERTO INTO produto (nome, preco, idfornecedor) VALUES (?, ?, ?)");
			consultar = con.prepareStatement("select * from produto where idfornecedor = ? ");
			
		}catch (SQLException ex ) {
			
			ex.printStackTrace();
			
			throw new DaoException("HOUVE PROBLEMA NA CONEXÃO COM O BANCO DE DADOS");
		}
	}

	// construção das rotinas que farão a gestao dos dados
	public void incluir ( Produto obj, int idfornecedor) throws DaoException {
		
		
			
	
		try {  
			
			
			incluir.setString(1, obj.getNome());
			incluir.setDouble(2, obj.getPreco());
			incluir.setInt(3, idfornecedor);
			
			incluir.execute();
		}catch (SQLException ex ) {
			
			ex.printStackTrace();
			
			throw new DaoException("falha ao incluir um Produto");
		}
	}

	public List<Produto> consultar(int idfornecedor) throws DaoException {

		try { 
			
			List <Produto> lista = new ArrayList<>();
			
			consultar.setInt(1, idfornecedor);
			ResultSet resultado = consultar.executeQuery();
			
			while (resultado.next()) { 
				
				Produto obj = new Produto();
				obj.setIdproduto(resultado.getInt("idproduto"));
				obj.setNome(resultado.getString("nome"));
				obj.setPreco(resultado.getDouble("preco"));
				
				lista.add(obj);
			}
		
		
		
		
		return lista;
	} catch (SQLException ex ) { 
		
		ex.printStackTrace();
		throw new DaoException("Houve falha ao listar os Produtos");
	}
}
	
}
