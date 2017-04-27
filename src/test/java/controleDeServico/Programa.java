package controleDeServico;

public class Programa {
	
	public static void main (String[] args){
		
		Conta rafael = new Conta();
		
		rafael.numero = 123;
		rafael.agencia = 321;
		rafael.titular = "Rafael";
		rafael.saldo = 1200.0;
		
		rafael.deposita(100.0);
		rafael.saca(55.0);
		
		Conta jaqueline = new Conta();
		
		jaqueline.numero = 111;
		jaqueline.agencia = 222;
		jaqueline.titular = "Jaqueline";
		jaqueline.saldo = 1200.0;
		
		jaqueline.deposita(250.0);
		jaqueline.saca(60.0);
		
		System.out.println(rafael.saldo);
		System.out.println(jaqueline.saldo);
		
	}
	
}
