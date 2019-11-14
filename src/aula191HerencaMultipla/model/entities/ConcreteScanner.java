package aula191HerencaMultipla.model.entities;

public class ConcreteScanner extends Device implements Scanner{

	public ConcreteScanner(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Scanner processando: " + doc);
	}
	
	public String scan() {
		return "Scanned content";
	}
}
