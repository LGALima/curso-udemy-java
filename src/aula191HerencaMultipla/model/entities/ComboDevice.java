package aula191HerencaMultipla.model.entities;

public class ComboDevice extends Device implements Scanner, Impressora {

	public ComboDevice(String serialNumber) {
		super(serialNumber);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimir(String doc) {
		System.out.println("Combo Imprimir: " + doc);
	}

	@Override
	public String scan() {
		return "Combo scan resultado";
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Combo processing: " + doc);
	}

}
