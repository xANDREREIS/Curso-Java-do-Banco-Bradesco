package classes;

public class Conta {
	String cliente;
	double saldo;
	
	public void exibeSaldo() {
		System.out.println(cliente + " valor na conta de: " + saldo);
	}
	
	public void saca(double valor) {
		saldo -= valor;
	}
	
	public void deposita(double valor) {
		saldo += valor;
	}
	
	public void transferePara(Conta destino , double valor) {
		this.saca(valor);
		destino.deposita(valor);
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	

	@Override
	public String toString() {
		return "Conta [cliente=" + cliente + ", saldo=" + saldo + "]";
	}
	
	
}
