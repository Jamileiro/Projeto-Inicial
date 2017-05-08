package br.com.rafael.entidade;

import java.util.List;

import br.com.rafael.enumerado.HABILIDADE;

public class Artesao extends Pessoa {
	
	private List<HABILIDADE> habilidades;
	
	public List<HABILIDADE> getHabilidades() {
		return habilidades;
	}
	public void setHabilidades(List<HABILIDADE> habilidades) {
		this.habilidades = habilidades;
	}
	
}
