package br.com.rafael.teste;

import java.io.Serializable;
import java.util.Collection;

import br.com.rafael.dao.DAO;
import br.com.rafael.dao.Entidade;

public class ProdutoDaoMock implements DAO {

	public <T extends Entidade<ID>, ID extends Serializable> void salvarObjeto(T objeto) {
		// TODO Auto-generated method stub

	}

	public <T extends Entidade<ID>, ID extends Serializable> void atualizarObjeto(T objeto) {
		// TODO Auto-generated method stub

	}

	public <T extends Entidade<ID>, ID extends Serializable> void excluiObjeto(T objeto) {
		// TODO Auto-generated method stub

	}

	public <T extends Entidade<ID>, ID extends Serializable> T getObjeto(Class<T> tipoDaClasse, ID id) {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends Entidade<ID>, ID extends Serializable> Collection<T> getObjetos(Class<T> tipoDaClasse) {
		// TODO Auto-generated method stub
		return null;
	}

}
