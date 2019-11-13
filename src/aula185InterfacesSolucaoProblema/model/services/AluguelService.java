package aula185InterfacesSolucaoProblema.model.services;

import aula185InterfacesSolucaoProblema.model.entities.AluguelDeCarro;
import aula185InterfacesSolucaoProblema.model.entities.NotaDePagamento;

public class AluguelService {
	private Double precoPorDia;
	private Double precoPorHora;

	private TaxaService taxaService;

	public AluguelService(Double precoPorDia, Double precoPorHora, TaxaService taxaService) {
		super();
		this.precoPorDia = precoPorDia;
		this.precoPorHora = precoPorHora;
		this.taxaService = taxaService;
	}

	public void processarNotaDePagamento(AluguelDeCarro aluguelDeCarro) {
		long t1 = aluguelDeCarro.getStart().getTime();
		long t2 = aluguelDeCarro.getFinish().getTime();
		double horas = (double) (t2 - t1) / 1000 / 60 / 60;
		double pagamentoBasico;
		if (horas <= 12.0) {
			pagamentoBasico = Math.ceil(horas) * precoPorHora;
		} else {
			pagamentoBasico = Math.ceil(horas / 24) * precoPorDia; 
		} 
		
		double taxa = taxaService.taxa(pagamentoBasico);
		
		aluguelDeCarro.setNotaDePagamento(new NotaDePagamento(pagamentoBasico, taxa));
		
	}
}
