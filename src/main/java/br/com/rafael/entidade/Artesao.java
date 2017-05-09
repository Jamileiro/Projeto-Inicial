package br.com.rafael.entidade;

import java.util.List;

import br.com.rafael.enumerado.habilidade;

public class Artesao extends Pessoa {
	
	private List<habilidade> habilidades;
	
	public List<habilidade> getHabilidades() {
		return habilidades;
	}
	public void setHabilidades(List<habilidade> habilidades) {
		this.habilidades = habilidades;
	}
	
}
