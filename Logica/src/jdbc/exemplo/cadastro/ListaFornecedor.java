package jdbc.exemplo.cadastro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ListaFornecedor {

	public static void main(String[] args) {
	
		
		Connection con;
		
		List<Fornecedor> lista = new ArrayList<>();
		
		try {
			// Registrar o driver JDBC

			Class.forName("com.mysql.jdbc.Driver");

			// conectar ao banco de dados

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javan1801", "root", "root132");

			
			//Preparar uma consulta sql
			
			PreparedStatement sql = con.prepareStatement ("SELECT * FROM fornecedor");
		    
			ResultSet resultado = sql.executeQuery();
			while (resultado.next()) {
				
				Fornecedor obj = new Fornecedor();
				obj.setIdfornecedor(resultado.getInt("idfornecedor"));
				obj.setNome(resultado.getString("nome"));
				obj.setEndereco(resultado.getString("endereco"));
				
			}
			
			
			con.close();
			
			
			
			String msg = "cadastro de fornecedores \n\n";
			
			for(Fornecedor obj: lista) {
				msg += obj + "\n" ;
				
			}
			JOptionPane.showMessageDialog(null, msg);
		} catch (ClassNotFoundException e) {

			JOptionPane.showMessageDialog(null, "driver jdbc nao encontrado");

		} catch (SQLException ex) {

			JOptionPane.showMessageDialog(null, "Problemas ao conectar ao banco de dados");

			ex.printStackTrace();
		}
	}
}
