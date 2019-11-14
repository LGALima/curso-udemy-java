package aula191HerencaMultipla;

import aula191HerencaMultipla.model.entities.ComboDevice;
import aula191HerencaMultipla.model.entities.ConcreteImpressora;
import aula191HerencaMultipla.model.entities.ConcreteScanner;

public class Program {

	public static void main(String[] args) {
		ConcreteImpressora p = new ConcreteImpressora("1080");
		p.processDoc("Minha carta");
		p.imprimir("Minha carta");
	System.out.println();
		ConcreteScanner s = new ConcreteScanner("2003");
		s.processDoc("Meu email");
		System.out.println("Scan result: " + s.scan());
		System.out.println();
		ComboDevice c = new ComboDevice("2081");
		c.processDoc("minha dissertação");
		c.imprimir("Minha dissertacao");
		System.out.println("Scan result: " + c.scan());
	}

}
