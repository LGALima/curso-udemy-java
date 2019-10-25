package aula121herenca;

import aula121herenca.entities.Account;
import aula121herenca.entities.BusinessAccount;
import aula121herenca.entities.SavingsAccount;

public class Program {
	public static void main(String[] args) {
		
		Account acc = new Account(1001, "alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		
		//Upcasting
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);
		
		// downcasting
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.emprestimo(100.0);
		
		//BusinessAccount acc5 = (BusinessAccount)acc3; errado
		
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.emprestimo(200.0);
			System.out.println("Emprestimo!");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.atualizarSaldo();
			System.out.println("Update! ");
		}
	}
}
