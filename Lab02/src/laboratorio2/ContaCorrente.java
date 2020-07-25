package laboratorio2;

import laboratorio1.Conta;

public class ContaCorrente extends Conta {
	public ContaCorrente() {
		super(10000);
	}
	
	public double saque(double valor) {
		if(valor < saldo + limite) {
			saldo = saldo + limite - valor;
		}
		
		return saldo;
	}
	
	public static void main(String[] args) {
		ContaCorrente CC = new ContaCorrente();
		
		System.out.println(CC.saldo());
		CC.deposito(1000);
		System.out.println(CC.saldo());
		CC.saque(5000);
		System.out.println(CC.saldo());	
	}
	
}
