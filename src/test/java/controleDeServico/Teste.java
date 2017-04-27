package controleDeServico;

import java.util.ArrayList;
import java.util.List;

import br.com.rafael.entidade.Cliente;
import br.com.rafael.entidade.Pedido;

public class Teste {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		Pedido pedido = new Pedido();
		
		pedido.getCliente().getNome();
		
		List<Pedido> pedidos = new ArrayList<Pedido>();
		pedidos.add(pedido);
		pedidos.remove(pedido);
		
		cliente.setPedidos(pedidos);

	}

}
