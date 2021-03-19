package jdbc.exemplo.cadastro;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class GravaFornecedor {
	// guarda conexão com o banco de dados

	static Connection con;

	// Guarda a instrução da gravação sql no banco de dados

	static PreparedStatement sql;

	public static void main(String[] args) throws SQLException {

		String nome = JOptionPane.showInputDialog("informe o nome do fornecedor");

		while (!nome.equals("fim")) {

			Fornecedor obj = new Fornecedor();
			obj.setNome(nome);
			obj.setEndereco(JOptionPane.showInputDialog("informe o endereço"));

			try {

				// Inclui no banco de dados

				gravarFornecedor(obj);

			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, "houve erro na gravação dos dados");

				ex.printStackTrace();

			
			}
			nome = JOptionPane.showInputDialog("informe o nome do fornecedor");

		}

		closeConnection();
	}
	

	private static void gravarFornecedor(Fornecedor obj) throws SQLException, ClassNotFoundException {

		// executado somente na primeira vez quando a declaração sql nao estiver criada

		if (sql == null) {

			// cria ( prepara ) a instrução sql

			 sql = getConnection()
					.prepareStatement("INSERT INTO fornecedor(nome, endereco) VALUES (?,?)");
		} // Monta os argumentos na insrução sql preparada previamente
		sql.setString(1, obj.getNome());
		sql.setString(2, obj.getEndereco());

		// executa a instrução sql
		sql.executeUpdate();
	}

	private static Connection getConnection() throws ClassNotFoundException, SQLException {
		// executado somente na primeira vez quando a conexão ao banco de dados nao
		// estiver estabelecida

		if (con == null) {
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javan1801", "root", "root132");

		}
		return con;

	}

	private static void closeConnection() throws SQLException {
		if (con != null) {
			con.close();
		}
	}
}
