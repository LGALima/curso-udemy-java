package aula129metodosAbstratos.entities;

import aula129metodosAbstratos.entities.enums.Color;

public class Retangulo extends Shape{

	private Double largura;
	private Double altura;
	

	public Retangulo(Color color, Double largura, Double altura) {
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
