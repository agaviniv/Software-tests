import java.sql.SQLException;

import org.junit.Test;

import br.com.sorvetegostosodepressa.Produto;
import br.com.sorvetegostosodepressa.ProdutoDAO;
import br.com.sorvetegostosodepressa.Exceptions.ProdutoInvalidoException;

public class TesteProdutoDAO {

	@Test(expected = ProdutoInvalidoException.class)
	public void inserirProdutoVazio() {
		ProdutoDAO dao = new ProdutoDAO();
		dao.sqlInsert(new Produto());
	}
	@Test(expected = ProdutoInvalidoException.class)
	public void buscarProdutoVazio() {
		ProdutoDAO dao = new ProdutoDAO();
		Produto p = new Produto();
		p = dao.sqlSelect(p.getCodigo());
	}
}
