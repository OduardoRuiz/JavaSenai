package jdbc.exemplo.projeto2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jdbc.exemplo.projeto.DaoException;
import jdbc.exemplo.projeto2.model.Fornecedor;
import jdbc.exemplo.projeto2.model.Produto;

//Data Acess Object

// um padr�o de desenvolvimento de projetos utilizado
// para concentrar o acesso a um determinado mecanismo
//que forne�a dados para uma aplica��o

public class FornecedorDao {
	private Connection con;
	private PreparedStatement incluir;
	private PreparedStatement consultar;
	private PreparedStatement obterId;

	private ProdutoDao produtoDao;

	public FornecedorDao() throws DaoException {
		// REGISTRAR O DRIVER JDBC
		try {

			con = DataBase.getConnection();

			produtoDao = new ProdutoDao();

			incluir = con.prepareStatement("insert into Endereco (nome, cnpj)VALUES(?,?)");

			consultar = con.prepareStatement("select * from Endereco");

			obterId = con.prepareStatement("selec last_insert_id() as id from fornecedor");

		} catch (SQLException ex) {
			ex.printStackTrace();
			throw new DaoException("Houve problema na conex�o com o banco de dados");
		}

	}

	// contru��o das Rotinas que far�o a gest�o dos dados
	public void incluir(Fornecedor obj) throws DaoException {

		try {
			incluir.setString(1, obj.getNome());

			incluir.setString(2, obj.getCnpj());

			incluir.execute();

			ResultSet resultado = obterId.executeQuery();

			if (resultado.next()) {

				int idfornecedor = resultado.getInt("id");

				for (Produto produto : obj.getProdutos()) {

					produtoDao.incluir(produto, idfornecedor);

				}

			} else {
				throw new DaoException("FALHA AO INCLUIR UM FORNECEDOR");
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
			throw new DaoException("FALHA AO INCLUIR UM FORNECEDOR");
		}
	}

	public List<Fornecedor> consultar() throws SQLException, DaoException {
		try {
			List<Fornecedor> lista = new ArrayList<>();

			ResultSet resultado = consultar.executeQuery();
			while (resultado.next()) {

				Fornecedor obj = new Fornecedor();
				
			    int idfornecedor = resultado.getInt("idfornecedor");
			    obj.setIdfornececdor(idfornecedor);
				obj.setIdfornececdor(resultado.getInt("idfornecedor"));
				obj.setNome(resultado.getString("nome"));
				obj.setCnpj(resultado.getString("cnpj"));
				obj.setProdutos(produtoDao.consultar(idfornecedor));

				lista.add(obj);
			}

			return lista;
		} catch (SQLException ex) {
			ex.printStackTrace();
			throw new DaoException("Houve falha ao listar os Fornecedores");

		}
	}

}