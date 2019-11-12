package aula137exceptionPersonalizadas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import aula137exceptionPersonalizadas.model.entities.Reserva;

public class Program {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Numero do quarto: ");
		int numero = sc.nextInt();
		System.out.print("data do check-in (dd/MM/yyyy): ");
		Date checkin = sdf.parse(sc.next());
		System.out.print("data do check-out (dd/MM/yyyy): ");
		Date checkout = sdf.parse(sc.next());

		if (!checkout.after(checkin)) {
			System.out.println("Erro ao reservar: Check-out deve ser depois de Check-in");
		} else {
			Reserva reserva = new Reserva(numero, checkin, checkout);
			System.out.println("Reserva: " + reserva);
			System.out.println();
			System.out.println("Entre com os dados para o update da reserva: ");
			System.out.print("data do check-in (dd/MM/yyyy): ");
			checkin = sdf.parse(sc.next());
			System.out.print("data do check-out (dd/MM/yyyy): ");
			checkout = sdf.parse(sc.next());

			String error = reserva.updateDates(checkin, checkout);
			if(error !=null) {
				System.out.println("Erro na reserva: " + error);				
			} else {
				System.out.println("Reserva: " + reserva);				
			}
		}
		sc.close();
	}
}
