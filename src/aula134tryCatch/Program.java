package aula134tryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
		String[] vetor = sc.nextLine().split(" ");
		int position = sc.nextInt();
		System.out.println(vetor[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
		} catch (InputMismatchException e) {
			System.out.println("Input error");
		}
		
		System.out.println("Deu certo!");
		sc.close();
	}
}
