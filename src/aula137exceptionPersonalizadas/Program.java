package aula137exceptionPersonalizadas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import aula137exceptionPersonalizadas.model.entities.Reserva;
import aula137exceptionPersonalizadas.model.exceptions.DomainException;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			
		System.out.print("Numero do quarto: ");
		int numero = sc.nextInt();
		System.out.print("data do check-in (dd/MM/yyyy): ");
		Date checkin = sdf.parse(sc.next());
		System.out.print("data do check-out (dd/MM/yyyy): ");
		Date checkout = sdf.parse(sc.next());

		Reserva reserva = new Reserva(numero, checkin, checkout);
		System.out.println("Reserva: " + reserva);

		System.out.println();
		System.out.println("Entre com os dados para o update da reserva: ");
		System.out.print("data do check-in (dd/MM/yyyy): ");
		checkin = sdf.parse(sc.next());
		System.out.print("data do check-out (dd/MM/yyyy): ");
		checkout = sdf.parse(sc.next());
		
		reserva.updateDates(checkin, checkout);
		System.out.println("Reserva: " + reserva);
		
		} catch(ParseException e) {
			System.out.println("Formato de data inválido!");
		} catch(DomainException e) {
			System.out.println("Erro na reserva: " + e.getMessage());
		} catch(RuntimeException e) {
			System.out.println("Erro inesperado");
		}
		
		sc.close();
	}
}
