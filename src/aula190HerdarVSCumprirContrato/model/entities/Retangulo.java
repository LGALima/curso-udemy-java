package aula190HerdarVSCumprirContrato.model.entities;

import aula190HerdarVSCumprirContrato.model.enums.Cor;

public class Retangulo extends AbstractShape{

	private Double largura;
	private Double altura;
	

	public Retangulo(Cor color, Double largura, Double altura) {
		super(color);
		this.largura = largura;
		this.altura = altura;
	}

	public Double getLargura() {
		return largura;
	}

	public void setLargura(Double largura) {
		this.largura = largura;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	@Override
	public double area() {
		return largura * altura;
	}
	
}
