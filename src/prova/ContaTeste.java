package prova;

import classes.Conta;

public class ContaTeste {
	public static void main(String[] args) {
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		
		conta1.setCliente("Andre");
		conta1.setSaldo(4000);
		
		conta2.setCliente("Marilani");
		conta2.setSaldo(0);
		
		conta1.saca(500);
		conta1.exibeSaldo();
		conta1.deposita(600);
		conta1.exibeSaldo();
		conta1.transferePara(conta2, 800);
		conta1.exibeSaldo();
		conta2.exibeSaldo();
		
	}
}
