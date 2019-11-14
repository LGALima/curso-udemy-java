package aula190HerdarVSCumprirContrato.model.entities;

import aula190HerdarVSCumprirContrato.model.enums.Cor;

public abstract class AbstractShape implements Shape{
	
	private Cor color;

	public AbstractShape(Cor color) {
		this.color = color;
	}

	public Cor getColor() {
		return color;
	}

	public void setColor(Cor color) {
		this.color = color;
	}
	
	
}
