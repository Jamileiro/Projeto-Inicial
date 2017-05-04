package br.com.rafael.teste;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.com.rafael.dao.DAO;
import br.com.rafael.dao.Entidade;

public class PessoaDaoMock implements DAO {
	
	private Map<Serializable, Entidade> pessoas = new HashMap<Serializable, Entidade>();

	public <T extends Entidade<ID>, ID extends Serializable> void salvarObjeto(T objeto) {
		pessoas.put(objeto.getId(), objeto);
		
	}

	public <T extends Entidade<ID>, ID extends Serializable> void atualizarObjeto(T objeto) {
		pessoas.put(objeto.getId(), objeto);
		
	}

	public <T extends Entidade<ID>, ID extends Serializable> void excluiObjeto(T objeto) {
		pessoas.remove(objeto.getId());
		
	}

	public <T extends Entidade<ID>, ID extends Serializable> T getObjeto(Class<T> tipoDaClasse, ID id) {
		
		return (T) pessoas.get(id.toString());
	}

	public <T extends Entidade<ID>, ID extends Serializable> Collection<T> getObjetos(Class<T> tipoDaClasse) {
		
		return (Collection<T>) pessoas.values();
	}
	
}
