package aula191HerencaMultipla.model.entities;

public class ConcreteImpressora extends Device implements Impressora {

	public ConcreteImpressora(String serialNumber) {
		super(serialNumber);
	}
	
	public void imprimir(String doc) {
		System.out.println("Imprimindo: " + doc);
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Impressora processando: " + doc);
	}
	
}
