package aula134tryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		System.out.println("*****method2 start******");
		method1();
		
		System.out.println("Deu certo!");
	}
	
	public static void method1() {
		System.out.println("*****method1 start******");
		method2();
		System.out.println("*****method1 finish*****");

	}
	
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		
		try {
			
		String[] vetor = sc.nextLine().split(" ");
		int position = sc.nextInt();
		System.out.println(vetor[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
			e.printStackTrace();
			sc.next();
		} catch (InputMismatchException e) {
			System.out.println("Input error");
		}
		sc.close();
		System.out.println("******method2 finish*****");
	}
	
}
