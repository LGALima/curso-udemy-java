 package aula193DefaultMethods;

import java.util.Locale;
import java.util.Scanner;

import aula193DefaultMethods.services.BrazilInterestService;
import aula193DefaultMethods.services.InterestService;
import aula193DefaultMethods.services.UsaInterestService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantia: ");
		double quantia = sc.nextDouble();
		System.out.println("Meses: ");
		int meses = sc.nextInt();
		
		InterestService is = new UsaInterestService(1.0);
		double payment = is.payment(quantia, meses);
		
		System.out.println("Payment after " + meses + " months: ");
		System.out.println(String.format("%.2f", payment));
		sc.close();
		
	}

}
