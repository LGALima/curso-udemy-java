package aula121herenca;

import aula121herenca.entities.Account;
import aula121herenca.entities.BusinessAccount;
import aula121herenca.entities.SavingsAccount;

public class Program {
	public static void main(String[] args) {
		
		Account acc1 = new Account(1001, "Alex", 1000.0);
		acc1.saque(200.0);
		System.out.println(acc1.getSaldo());
		
		Account acc2 = new SavingsAccount(1002, "Lucas", 1000.0, 0.01);
		acc2.saque(200.0);
		System.out.println(acc2.getSaldo());
		
		Account acc3 = new BusinessAccount(1003, "Empresario", 1000.0, 500.0);
		acc3.saque(200.0);
		System.out.println(acc3.getSaldo());
	}
}
