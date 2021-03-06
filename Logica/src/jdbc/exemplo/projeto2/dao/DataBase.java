package jdbc.exemplo.projeto2.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import jdbc.exemplo.projeto.DaoException;

public class DataBase {
	
	private static Connection con;
	
	
	// impedindo a criação de um objeto desta Classe

	
	private DataBase () {
		
	}
	
	
	public static Connection getConnection () throws DaoException {
		if (con == null) { 
			
			try { 
				//REGISTRAR O DRIVER JDBC 
				
				Class.forName("com.mysql.jdbc.Driver");
				
				//ESTABELECER A CONEXÃO COM O BANCO DE DADOS 
				
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javan1801", "root", "root132");
				
			}catch (ClassNotFoundException ex) { 
				throw new DaoException("o driver JDBC não foi encontrado");
			}catch (SQLException ex ) {
				ex.printStackTrace();
				throw new DaoException("Houve problema na conexão com o banco de dados");
				
			}
		}
		
		
		return con;
	}
	
	
	public static void closeConnection() { 
		
		
		try { 
			
			if (con != null) {
				
				con.close();
			}
		} catch (SQLException ex) { 
			
			ex.printStackTrace();
		}
	}
	
}


