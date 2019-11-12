package aula141ExercicioFixacaoExceptions.model.entities;

import aula141ExercicioFixacaoExceptions.model.exceptions.DomainException;

public class Account {
	private Integer numero;
	private String suporte;
	private Double saldo;
	private Double limiteDeSaque;
	
	public Account(Integer numero, String suporte, Double saldo, Double limiteDeSaque) {
		this.numero = numero;
		this.suporte = suporte;
		this.saldo = saldo;
		this.limiteDeSaque = limiteDeSaque;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getSuporte() {
		return suporte;
	}

	public void setSuporte(String suporte) {
		this.suporte = suporte;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Double getLimiteDeSaque() {
		return limiteDeSaque;
	}

	public void setLimiteDeSaque(Double limiteDeSaque) {
		this.limiteDeSaque = limiteDeSaque;
	}
	
	public void depositar(Double quantidade) {
		this.saldo += quantidade;
	}
	
	public void sacar(Double quantidade) {
		if(quantidade > this.limiteDeSaque) {
			throw new DomainException("Limite de saque ultrapassado!");
		}
		if(quantidade > this.saldo) {
			throw new DomainException("Saldo insuficiente!");
		}
		this.saldo -= quantidade;
	}
}
