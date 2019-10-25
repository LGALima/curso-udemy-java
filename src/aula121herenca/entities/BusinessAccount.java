package aula121herenca.entities;

public class BusinessAccount extends Account{
	
	private Double limiteEmprestimo;
	
	public BusinessAccount() {
		super();
	}
	
	public BusinessAccount(Integer numero, String titular, Double saldo, Double limiteEmprestimo) {
		super(numero, titular, saldo);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public Double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(Double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}
	
	public void emprestimo(Double quantidade) {
		if(quantidade <= limiteEmprestimo)
			deposito(quantidade);
	} 
}
