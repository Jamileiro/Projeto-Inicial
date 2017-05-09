package br.com.rafael.entidade;

import br.com.rafael.enumerado.status;

public class Pedido {

	private Cliente cliente;
	private Produto produto;
	private status status;
	

	public status getStatus() {
		return status;
	}

	public void setStatus(status status) {
		this.status = status;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
