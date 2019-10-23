package aula115composicao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import aula115composicao.entities.Departament;
import aula115composicao.entities.HourContract;
import aula115composicao.entities.Worker;
import aula115composicao.enums.WorkerLevel;

public class Program {
	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Entre com o nome do departamento: ");
		String departmentName = sc.nextLine();
		System.out.println("Entre com os dados do trabalhador: ");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Departament(departmentName));
		
		System.out.print("Quantos contratos esse trabalhador tem?");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.print("Entre com os dados do contrato #" + i + ":");
			System.out.print("Data (DD/MM/YY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duração (horas): ");
			int hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		}
		
		System.out.println();
		System.out.print("Entre com o mes e o ano para calcular o salario (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0,2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Nome: " + worker.getName());
		System.out.println("Departamento: " + worker.getDepartament().getName());
		System.out.println("Salario total: " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
	}
}
