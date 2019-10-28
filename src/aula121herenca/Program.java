package aula121herenca;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import aula121herenca.entities.Account;
import aula121herenca.entities.BusinessAccount;
import aula121herenca.entities.SavingsAccount;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		List<Account> list = new ArrayList<>();
		list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
		list.add(new BusinessAccount(1002, "Lucas", 1000.0, 400.0));
		list.add(new SavingsAccount(1004, "Maria", 300.00, 0.01));
		list.add(new BusinessAccount(1007, "Paulin", 1000.0, 500.0));
		
		double sum = 0.0;
		
		for(Account acc : list) {
			sum += acc.getSaldo();
		}
		
		System.out.printf("Total saldo: %.2f%n", sum);
		for (Account acc : list) {
			acc.deposito(10.0);
		}
		
		for (Account acc : list) {
			System.out.printf("Conta atualizada %d: %.2f%n", acc.getNumero(), acc.getSaldo());
		}
	}
}
