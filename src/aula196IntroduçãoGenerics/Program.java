package aula196IntroduçãoGenerics;

import java.util.Scanner;

import aula196IntroduçãoGenerics.services.PrintService;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PrintService<String> ps = new PrintService<String>();
		
		System.out.print("Quantos valores? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			String value = sc.next();
			ps.addValue(value);
		}
		ps.print();
		System.out.println("First: " + ps.first());
		sc.close();
	}

}
