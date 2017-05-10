package br.com.rafael.teste;

import java.util.Date;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.rafael.dao.DAO;
import br.com.rafael.entidade.Artesao;
import br.com.rafael.entidade.Produto;
import junit.framework.TestCase;

public class ProdutoTest extends TestCase {
	
	protected DAO daoProduto;
	
	@Before
	
		public void before() {
			daoProduto = new ProdutoDaoMock();
		}
	
	@After
	
	public void after() {

	}
	
	@Test
	
	public void incluirPessoa() {
		
		Produto produto = new Produto();
		
		produto.setNomeProduto("Bolo no pote");
		produto.setValor("13.50");
		produto.setDataValidade(new Date());
		produto.setArtesao(new Artesao());
		
	}

}
