package jdbc.exemplo.cadastro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//Data Acess Object

// um padr�o de desenvolvimento de projetos utilizado
// para concentrar o acesso a um determinado mecanismo
//que forne�a dados para uma aplica��o

public class FornecedorDao {
	private Connection con;
	private PreparedStatement incluir;
	private PreparedStatement atualizar;
	private PreparedStatement consultar;
	private PreparedStatement remover;
	private PreparedStatement consultarY;

	public FornecedorDao() throws DaoException {
		// REGISTRAR O DRIVER JDBC
		try {
			Class.forName("com.mysql.jdbc.Driver");

			// estabelecer conex�o com o banco de dados
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javan1801", "root", "root132");
			// Prepara os sqls para a utiliza��o posterior

			incluir = con.prepareStatement("insert into fornecedor (nome, endereco)VALUES(?,?)");
			atualizar = con.prepareStatement("update fornecedor set nome=?, endereco=? where idfornecedor=?");

			consultar = con.prepareStatement("select * from fornecedor");

			remover = con.prepareStatement("delete fornecedor where idfornecedor=?");
			consultarY = con.prepareStatement("select nome, endereco where idfornecedor=?");
		} catch (ClassNotFoundException ex) {

			throw new DaoException("o driver jdbc nao foi encontrado");

		} catch (SQLException ex) {
			ex.printStackTrace();
			throw new DaoException("Houve problema na conex�o com o banco de dados");
		}

	}

	// contru��o das Rotinas que far�o a gest�o dos dados
	public void incluir(Fornecedor obj) throws DaoException {

		try {
			atualizar.setString(1, obj.getNome());
			atualizar.setString(2, obj.getEndereco());
			atualizar.setInt(3, obj.getIdfornecedor());
			atualizar.execute();

		} catch (SQLException ex) {
			ex.printStackTrace();
			throw new DaoException("FALHA AO ATUALIZAR UM FORNECEDOR");
		}
	}

	public void remover(int id) throws DaoException {
		try {
			remover.setInt(1, id);

			remover.execute();

		} catch (SQLException ex) {

			ex.printStackTrace();
			throw new DaoException("FALHA AO REMOVER UM FORNECEDOR");
		}

	}

	@SuppressWarnings("unused")
	private void consultarY(Fornecedor obj) throws DaoException {
		try {
			consultarY.setInt(1, obj.getIdfornecedor());

		} catch (SQLException ex) {
			ex.printStackTrace();
			throw new DaoException("falha ao buscar um fornecedor");

		}

	}

	public List<Fornecedor> consultar() throws SQLException, DaoException {
		try {
			List<Fornecedor> lista = new ArrayList<>();

			ResultSet resultado = consultar.executeQuery();
			while (resultado.next()) {

				Fornecedor obj = new Fornecedor();
				obj.setIdfornecedor(resultado.getInt("idfornecedor"));
				obj.setNome(resultado.getString("nome"));
				obj.setEndereco(resultado.getString("Endereco"));
			}

			return lista;
		} catch (SQLException ex) {
			throw new DaoException("Houve falha ao listar os Fornecedores");

		}
	}

	public void fecharConexao() {
		try {

			if (con != null) {
				con.close();
			}

		} catch (SQLException ex) {
			ex.printStackTrace();

		}
	}
}