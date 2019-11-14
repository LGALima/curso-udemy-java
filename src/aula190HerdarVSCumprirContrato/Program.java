package aula190HerdarVSCumprirContrato;

import aula190HerdarVSCumprirContrato.model.entities.AbstractShape;
import aula190HerdarVSCumprirContrato.model.entities.Circulo;
import aula190HerdarVSCumprirContrato.model.entities.Retangulo;
import aula190HerdarVSCumprirContrato.model.entities.Shape;
import aula190HerdarVSCumprirContrato.model.enums.Cor;

public class Program {
	public static void main(String[] args) {

		AbstractShape s1 = new Circulo(Cor.PRETO, 2.0);
		AbstractShape s2 = new Retangulo(Cor.BRANCO, 3.0, 4.0);
		System.out.println("Cor do circulo: " + s1.getColor());
		System.out.println("Area do circulo: " + String.format("%.3f", s1.area()));
		System.out.println("Cor do retangulo: " + s1.getColor());
		System.out.println("Area do retangulo: " + String.format("%.3f", s1.area()));
	}
}
