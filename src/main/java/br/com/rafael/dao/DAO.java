package br.com.rafael.dao;

import java.io.Serializable;
import java.util.Collection;

public interface DAO {
	
	
	<T extends Entidade<ID>, ID extends Serializable> void salvarObjeto(T objeto);

	<T extends Entidade<ID>, ID extends Serializable> void atualizarObjeto(T objeto);

	<T extends Entidade<ID>, ID extends Serializable> void excluiObjeto(T objeto);

	<T extends Entidade<ID>, ID extends Serializable> T getObjeto(Class<T> tipoDaClasse, ID id);

	<T extends Entidade<ID>, ID extends Serializable> Collection<T> getObjetos(Class<T> tipoDaClasse);

}
