
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.sorvetegostosodepressa.Produto;
import br.com.sorvetegostosodepressa.ProdutoDAO;

public class ProdutoDAOMock extends ProdutoDAO {
	
	@Override
	public void sqlUpdate(Produto p){
				
	}
	
	@Override
	public void sqlInsert(Produto p){
			
	}
	
	@Override
	public void sqlDelete(Produto p){		
	}
	
	@Override
	public Produto sqlSelect(int codigo){
		return new Produto(1,"Sorvete", "Sorvete de baunilha");
	}
}
