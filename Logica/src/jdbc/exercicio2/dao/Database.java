package jdbc.exercicio2.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	private static Connection con;

	// Impedindo a criação de um objeto desta Classe
	private Database() {
	}
	
	public static Connection getConnection() throws DaoException {
		if(con == null) {
			try {
				// Registrar o Driver JDBC
				Class.forName("com.mysql.jdbc.Driver");
		
				// Estabelecer a conexão com o Bando de Dados
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/exercicio02", 
						"root", "root132");
			} catch (ClassNotFoundException ex) {
				throw new DaoException("O Driver JDBC não foi encontrato");
			} catch (SQLException ex) {
				ex.printStackTrace();
				throw new DaoException("Houve problema na conexão com o Banco de Dados");
			}
		}
		return con;
	}
	
	public static void closeConnection() {
		try {
			if(con != null) {
				con.close();
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
}
