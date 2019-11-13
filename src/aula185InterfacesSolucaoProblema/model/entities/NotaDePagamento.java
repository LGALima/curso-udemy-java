package aula185InterfacesSolucaoProblema.model.entities;

public class NotaDePagamento {
	
	private Double pagamentoBasico;
	private Double taxa;
	
	public NotaDePagamento() {
		
	}
	
	public NotaDePagamento(Double pagamentoBasico, Double taxa) {
		this.pagamentoBasico = pagamentoBasico;
		this.taxa = taxa;
	}

	public Double getPagamentoBasico() {
		return pagamentoBasico;
	}

	public void setPagamentoBasico(Double pagamentoBasico) {
		this.pagamentoBasico = pagamentoBasico;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}
	
	public Double getPagamentoTotal() {
		return getPagamentoBasico() + getTaxa();
	}
}
