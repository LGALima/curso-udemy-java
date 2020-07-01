package aula069metodosStaticos;

import java.util.Locale;
import java.util.Scanner;

import aula069metodosStaticos.util.Calculator;

public class Program {
	

	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//Calculator calc = new Calculator();
		
		System.out.println("Entre com o valor do raio");
		double radius = sc.nextDouble();
		
		double c = Calculator.circumference(radius);
		
		double v = Calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n ", v);
		System.out.printf("PI: %.2f%n", Calculator.PI);
		sc.close();  
	}


}
