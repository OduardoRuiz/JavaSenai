package jdbc.exemplo.projeto2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jdbc.exemplo.projeto2.model.Fornecedor;
import jdbc.exemplo.projeto2.model.Produto;

/* Data Access Object
// um padrão de desenvolvimento de projetos utilizado
// para concentrar o acesso a um determinado mecanismo
// que forneça dados para uma aplicação
*/
public class FornecedorDao {
	private PreparedStatement incluir;
	private PreparedStatement consultar;
	private PreparedStatement obterId;  // <<====
	
	private ProdutoDao produtoDao;  // <<=====
	
	public FornecedorDao() throws DaoException {
		try {
			// Estabelecer a conexão com o Bando de Dados
			Connection con = Database.getConnection();
			
			produtoDao = new ProdutoDao();   // <<=====
			
			// Preparar os SQLs para a utilização posterior
			incluir = con.prepareStatement(
					"insert into fornecedor (nome, cnpj) values (?,?)");
			consultar = con.prepareStatement("select * from fornecedor");
			
			obterId = con.prepareStatement("select last_insert_id() as idCriadoParaOFornecedor from fornecedor"); // <<==
		} catch (SQLException ex) {
			ex.printStackTrace();
			throw new DaoException("Houve problema na conexão com o Banco de Dados");
		}
	}
	
	// construção das rotinas que farão a gestão dos dados
	public void incluir(Fornecedor obj) throws DaoException {
		try {
			incluir.setString(1, obj.getNome());
			incluir.setString(2, obj.getCnpj());
			incluir.execute();
			
			ResultSet resultado = obterId.executeQuery();						// <<====
			if(resultado.next()) {												//
				int idfornecedor = resultado.getInt("idCriadoParaOFornecedor"); //
				for (Produto produto : obj.getProdutos()) {						//
					produtoDao.incluir(produto, idfornecedor);					//
				}																//
			} else {															//
				throw new DaoException("Falha ao incluir um Fornecedor");		//
			}																	//
		} catch (SQLException ex) {
			ex.printStackTrace();
			throw new DaoException("Falha ao incluir um Fornecedor");
		}
	}
	
	public List<Fornecedor> consultar() throws DaoException {
		try {
			List<Fornecedor> lista = new ArrayList<>();
			
			ResultSet resultado = consultar.executeQuery();
			while(resultado.next()) {
				Fornecedor obj = new Fornecedor();
				int idfornecedor = resultado.getInt("idfornecedor"); // <<====
				obj.setIdfornecedor(idfornecedor);					 // <<====
				obj.setNome(resultado.getString("nome"));
				obj.setCnpj(resultado.getString("cnpj"));
				obj.setProdutos(produtoDao.consultar(idfornecedor)); // <<====
				
				lista.add(obj);
			}
			
			return lista;
		} catch (SQLException ex) {
			ex.printStackTrace();
			throw new DaoException("Houve falha ao listar os Fornecedores");
		}
	}
}







