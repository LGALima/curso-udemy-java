package aula185InterfacesSolucaoProblema;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import aula185InterfacesSolucaoProblema.model.entities.AluguelDeCarro;
import aula185InterfacesSolucaoProblema.model.entities.Veiculo;
import aula185InterfacesSolucaoProblema.model.services.AluguelService;
import aula185InterfacesSolucaoProblema.model.services.TaxaBrasilService;

public class Program {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
		
		System.out.println("Entre com os dados do aluguel");
		System.out.print("Modelo do carro: ");
		String modeloCarro = sc.nextLine();
		System.out.print("Dia de saida (dd/MM/yyyy hh:ss): ");
		Date start = sdf.parse(sc.nextLine());
		System.out.print("Dia de retorno (dd/MM/yyyy hh:ss):");
		Date finish = sdf.parse(sc.nextLine());
		
		AluguelDeCarro aluguelDeCarro = new AluguelDeCarro(start, finish, new Veiculo(modeloCarro));
		
		System.out.print("Entre com o preco por hora: ");
		double precoPorHora = sc.nextDouble();
		System.out.print("Entre com o preco por dia: ");
		double precoPorDia = sc.nextDouble();
		
		AluguelService aluguelService = new AluguelService(precoPorDia, precoPorHora, new TaxaBrasilService());
		
		aluguelService.processarNotaDePagamento(aluguelDeCarro);
		System.out.println("Nota de Pagamento: ");
		System.out.println("Pagamento basico: " + String.format("%.2f", aluguelDeCarro.getNotaDePagamento().getPagamentoBasico()));
		System.out.println("Taxa: " + String.format("%.2f", aluguelDeCarro.getNotaDePagamento().getTaxa()));
		System.out.println("Pagamento total: " + String.format("%.2f", aluguelDeCarro.getNotaDePagamento().getPagamentoTotal()));

		
		sc.close();
	}
}
