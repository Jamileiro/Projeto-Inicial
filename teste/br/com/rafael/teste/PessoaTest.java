package br.com.rafael.teste;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.rafael.dao.DAO;
import br.com.rafael.entidade.Pessoa;
import junit.framework.TestCase;

public class PessoaTest extends TestCase {
	
	protected DAO daoPessoa;
	
	@Before
	
	public void before() {
		daoPessoa = new PessoaDaoMock();
	}

	@After
	public void after() {

	}

	@Test
	
	public void incluirPessoa() {
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setCpf("123456789");
		pessoa.setEmail("teste@teste.com.br");
		pessoa.setEndereco("Av. Pasteur");
		pessoa.setNome("Rafael");
		daoPessoa.salvarObjeto(pessoa);

		Pessoa pessoaGet = (Pessoa) daoPessoa.getObjeto(Pessoa.class, pessoa.getId());

		assertEquals(pessoa.getCpf(), pessoaGet.getCpf());
		assertEquals(pessoa.getEmail(), pessoaGet.getEmail());
		assertEquals(pessoa.getEndereco(), pessoaGet.getEndereco());
		assertEquals(pessoa.getNome(), pessoaGet.getNome());
	}
	
	@Test
	
	public void alterarPessoa() {
		
		Pessoa pessoa = new Pessoa();

		pessoa.setCpf("123456789");
		pessoa.setEmail("teste@teste.com.br");
		pessoa.setEndereco("Av. Pasteur");
		pessoa.setNome("Rafael");
		daoPessoa.salvarObjeto(pessoa);
		
		Pessoa pessoaGet = (Pessoa) daoPessoa.getObjeto(Pessoa.class, pessoa.getId());
		

		pessoaGet.setCpf("12345678");
		pessoaGet.setEmail("teste@teste.com");
		pessoaGet.setEndereco("Av. Bela Vista");
		pessoaGet.setNome("Jaqueline");
		daoPessoa.atualizarObjeto(pessoaGet);
		
		Pessoa alterarPessoa = (Pessoa) daoPessoa.getObjeto(Pessoa.class, pessoaGet.getId());
		
		assertEquals("12345678", alterarPessoa.getCpf());
		assertEquals("teste@teste.com", alterarPessoa.getEmail());
		assertEquals("Av. Bela Vista", alterarPessoa.getEndereco());
		assertEquals("Jaqueline", alterarPessoa.getNome());
		
		}
		
	@Test
	
	public void excluirPessoa() {
		
		Pessoa pessoa = new Pessoa();

		pessoa.setCpf("1010101010");
		pessoa.setEmail("teste2@gmail.com.br");
		pessoa.setEndereco("Garavalo");
		pessoa.setNome("Manoel");
		daoPessoa.salvarObjeto(pessoa);
		
		Pessoa pessoaGet = (Pessoa) daoPessoa.getObjeto(Pessoa.class, pessoa.getId());
		
		Assert.assertNotNull(pessoaGet);
		
		daoPessoa.excluiObjeto(pessoaGet);
		
		Pessoa excluirPessoa = (Pessoa) daoPessoa.getObjeto(Pessoa.class, pessoa.getId());
		
		assertNull (excluirPessoa);
		
		}
	}

