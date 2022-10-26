package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
	public static void main(String[] args) {
		
	/*	Account acc1 = new Account(1001,"Alex",1000.00); //Iniciando conta
		acc1.withDraw(200.0);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new SavingsAccount(1002,"Maria",1000.0, 0.01);
		acc2.withDraw(200.0);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAccount(1003,"Bob", 1000.0, 500.0);
		acc3.withDraw(200.0);
		System.out.println(acc3.getBalance()); */
		
		Account x = new Account(1020, "Alex", 1000.0); //Instaciando conta comum X tipo Account comum
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01); //Instaciando conta tipo conta poupança
		x.withDraw(50.0);
		y.withDraw(50.0);       //Polimorfismo chamado mesma operacao em variaveis do mesmo tipo
								//Porem com comportamento diferentes.
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		
	}
}
