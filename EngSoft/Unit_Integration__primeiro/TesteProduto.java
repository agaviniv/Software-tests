import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

import br.com.sorvetegostosodepressa.Produto;
import br.com.sorvetegostosodepressa.Exceptions.ProdutoInvalidoException;

public class TesteProduto {
	Produto p;
	@Deprecated
	public void instanciarProdutoSemParametros() {
		Produto p = new Produto();
		assertEquals(0,p.getCodigo());
		assertEquals("",p.getNome());
		assertEquals("",p.getDescricao());
	}
	@Test
	public void instanciarProdutoComParametros() {
		p = new Produto(700,"Sorvete","Palito");
		assertEquals(700,p.getCodigo());
		assertEquals("Sorvete",p.getNome());
		assertEquals("Palito",p.getDescricao());
	}
	
	@Test
	public void salvarProduto(){
		p = new Produto(700,"Sorvete","Palito");
		p.salvar();
	}
	@Test
	public void buscarProdutoPeloCodigo700(){
		Produto p = Produto._buscar(700);
		assertEquals(700,p.getCodigo());
		assertEquals("Sorvete",p.getNome());
		assertEquals("Palito",p.getDescricao());
	}
	@Test
	public void alterarNomeEDescricoDeProdutoCodigo700() {
		p = Produto._buscar(700);
		p.setNome("Picolé");
		p.setDescricao("Copo");
		p.alterar();
		assertEquals(700,p.getCodigo());
		assertEquals("Picolé",p.getNome());
		assertEquals("Copo",p.getDescricao());
	}
	@Test
	public void excluirProdutoCodigo700(){
		p = new Produto(700,"Sorvete","Palito");
		p.excluir();
	}
	@Test(expected = ProdutoInvalidoException.class)
	public void buscarProdutoCodigoInvalido(){
		Produto p = Produto._buscar(701);	
	}
}
