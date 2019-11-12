package aula141ExercicioFixacaoExceptions;

import java.util.Scanner;

import aula141ExercicioFixacaoExceptions.model.entities.Account;
import aula141ExercicioFixacaoExceptions.model.exceptions.DomainException;

public class Program {
	public static void main(String[] args) {
		try {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com os dados da conta: ");
		System.out.print("Numero: ");
		Integer numero = sc.nextInt();
		System.out.print("Suporte: ");
		sc.nextLine();
		String suporte = sc.nextLine();
		System.out.print("Saldo inicial: ");
		Double saldo = sc.nextDouble();
		System.out.print("Limite de saque: ");
		Double limite = sc.nextDouble();
		
		Account account = new Account(numero, suporte, saldo, limite);
		
		System.out.print("Entre com a quantidade de saque: ");
		Double quantidade = sc.nextDouble();
		account.sacar(quantidade);
		System.out.println("Novo saldo: " + account.getSaldo());
		}catch (DomainException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
	}	
}
