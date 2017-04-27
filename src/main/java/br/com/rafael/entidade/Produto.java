package br.com.rafael.entidade;

import java.util.Date;
import java.util.List;

public class Produto {
	
	private String nomeProduto;
	private Double valor;
	private Date dataValidade;
	private List<Compra> compras;
	private Artesao artesao;
	
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Date getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}
	public List<Compra> getCompras() {
		return compras;
	}
	public void setCompras(List<Compra> compras) {
		this.compras = compras;
	}
	public Artesao getArtesao() {
		return artesao;
	}
	public void setArtesao(Artesao artesao) {
		this.artesao = artesao;
	}
	

}
