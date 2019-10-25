package aula121herenca.entities;

public class SavingsAccount extends Account{
	
	private Double taxaDeJuro;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer numero, String titular, Double saldo, Double taxaDeJuro) {
		super(numero, titular, saldo);
		this.taxaDeJuro = taxaDeJuro;
	}

	public Double getTaxaDeJuro() {
		return taxaDeJuro;
	}

	public void setTaxaDeJuro(Double taxaDeJuro) {
		this.taxaDeJuro = taxaDeJuro;
	}	
	
	public void atualizarSaldo() {
		saldo += saldo * taxaDeJuro;
	}
	
	@Override
	public void saque(Double quantidade) {
		saldo -= quantidade;
	}
}
