package aula185InterfacesSolucaoProblema.model.entities;

import java.util.Date;

public class AluguelDeCarro {
	private Date start;
	private Date finish;

	private Veiculo veiculo;
	private NotaDePagamento notaDePagamento;

	public AluguelDeCarro() {

	}

	public AluguelDeCarro(Date start, Date finish, Veiculo veiculo) {
		this.start = start;
		this.finish = finish;
		this.veiculo = veiculo;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getFinish() {
		return finish;
	}

	public void setFinish(Date finish) {
		this.finish = finish;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public NotaDePagamento getNotaDePagamento() {
		return notaDePagamento;
	}

	public void setNotaDePagamento(NotaDePagamento notaDePagamento) {
		this.notaDePagamento = notaDePagamento;
	}

}
