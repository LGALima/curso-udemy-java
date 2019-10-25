package aula121herenca;

import aula121herenca.entities.Account;
import aula121herenca.entities.BusinessAccount;
import aula121herenca.entities.SavingsAccount;

public class Program {
	public static void main(String[] args) {
		
		Account x = new Account(1001, "Lucas", 1000.0);
		Account y = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		
		x.saque(50.0);
		y.saque(50.0);
		
		System.out.println(x.getSaldo());
		System.out.println(y.getSaldo());
	}
}
