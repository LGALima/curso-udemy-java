package aula190HerdarVSCumprirContrato.model.entities;

import aula190HerdarVSCumprirContrato.model.enums.Cor;

public class Circulo extends AbstractShape{

	private Double raio;

	public Circulo(Cor color, Double raio) {
		super(color);
		this.raio = raio;
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}

	@Override
	public double area() {
		return Math.PI * raio * raio;
	}

}
