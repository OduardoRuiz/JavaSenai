package jdbc.exercicio.ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CadastroDao {
	
	private Connection con;
	private PreparedStatement incluir;
	private PreparedStatement atualizar;
	private PreparedStatement consultar;
	private PreparedStatement remover;
	//private PreparedStatement consultarY;
	
	
	
	public CadastroDao() throws CadastroDaoException {  
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
		
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/exsql", "root", "root132");
			
			incluir = con.prepareStatement("INSERT INTO Endereco(logradouro,numero,bairro,cep) VALUES(?,?,?,?)");
			
			atualizar = con.prepareStatement("UPDATE Endereco set logradouro=?, numero=? , bairro=?, cep=? WHERE idendereco=?");
			
			consultar = con.prepareStatement("SELECT * FROM Endereco");
			
			remover = con.prepareStatement("DELETE endereco WHERE idendereco=?");
			
			//consultarY = con.prepareStatement("SELECT logradouro,numero,bairro,cep WHERE idendereco");
			
			
		}catch (ClassNotFoundException ex) {
			throw new CadastroDaoException("O Driver JDBC nÃ£o foi encontrato");
			
			}catch (SQLException ex) { 
				ex.printStackTrace();
				throw new CadastroDaoException("Houve um problema na conexão de banco de dados");
				
				
				
			}
	}
	


	public void incluir (Endereco obj) throws CadastroDaoException {
		
		
		try { 
			
			incluir.setString(1, obj.getLogradouro());
			
			incluir.setString(2, obj.getNumero());
			
			incluir.setString(3, obj.getCep());
			
			incluir.setString(4, obj.getBairro());
			incluir.execute();
			
			
			
			
		
		}catch (SQLException ex) {
			ex.printStackTrace();
			throw new CadastroDaoException("falha ao incluir um endereço");
			
			
		}
	}
	
	public void atualizar (Endereco obj) throws CadastroDaoException { 
		
		try { 
			
			atualizar.setString(1, obj.getBairro());
		
			atualizar.setString(2, obj.getCep());
			
			atualizar.setString(3, obj.getLogradouro());
			
			atualizar.setString(4, obj.getNumero());
			
			atualizar.setInt(5, obj.getIdendereco());
		} catch (SQLException ex) {
			ex.printStackTrace();
			throw new CadastroDaoException("falha ao atualizar um endereço");
		
		
	}
} 
	public List <Endereco> consultar () throws CadastroDaoException {
		
		try {
			List<Endereco> lista = new ArrayList<>();
			
			ResultSet resultado = consultar.executeQuery();
			
			while(resultado.next()) { 
				
				Endereco obj = new Endereco ();
				obj.setIdendereco(resultado.getInt("idendereco"));
				obj.setLogradouro(resultado.getString("Logradouro"));
				
				obj.setNumero(resultado.getString("numero"));
				obj.setCep(resultado.getString("cep"));
				obj.setBairro(resultado.getString("Bairro"));
				lista.add(obj);
				
				
			}
			return lista;
			
		}catch (SQLException ex) {
			ex.printStackTrace();
			throw new CadastroDaoException("falha ao listar um endereço");
	}
	
	
	
}

	
	public void remover (int id) throws CadastroDaoException { 
		
		try { 
			
			remover.setInt(1, id);
			
			remover.execute();
		} catch (SQLException ex) {
			ex.printStackTrace();
			throw new CadastroDaoException("falha ao remover um endereço");
	}
}
	
	
	public void fecharConexao() {
		try { 
			if(con !=null)  { 
				
				con.close();
				
			}
		} catch (SQLException ex ) {
			
			ex.printStackTrace();
			
			
		}
	}
}



































