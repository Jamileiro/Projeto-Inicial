package br.com.rafael.entidade;

import br.com.rafael.enumerado.STATUS;

public class Pedido {

	private Cliente cliente;
	private Produto produto;
	private STATUS status;
	

	public STATUS getStatus() {
		return status;
	}

	public void setStatus(STATUS status) {
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
