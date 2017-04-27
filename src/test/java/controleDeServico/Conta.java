package controleDeServico;

public class Conta {

	int numero;
	String titular;
    double saldo;
	int agencia;
	
	void deposita (double valorASerDepositado){
		this.saldo += valorASerDepositado;
	}
	
	void saca (double valorASerSacado){
		if(this.saldo >= valorASerSacado){
			this.saldo -= valorASerSacado;
		}
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	
}
