package bancoPocolandia;

public class Conta {
	private Cliente cliente;
	private double saldo;
	private int numero;
	private int agencia;
	
	private static int total;
	
	public Conta(int agencia, int numero) {
		total++;
		this.agencia = agencia;
		this.numero = numero;
		
	}
	
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo-=valor;
			return true;
		}else {
			return false;
		}
	}
	
	public void deposita(double valor) {
		if(valor >0) {
			this.saldo +=valor;
		}else {
			System.out.println("Não é possível depositar um valor menor do que 0");
		}
	}
	
	public boolean transfere(Conta destino, double valor) {
		if(this.saldo >=valor) {
			saldo -=valor;
			destino.deposita(valor);
			return true;
		}else {
			return false;
		}
	}
	
	
	
	public static int getTotal() {
		return total;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		if(numero>0) {
		this.numero = numero;
		}
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		if(agencia>0) {
		this.agencia = agencia;
		}
	}
	
	
	
	
}
