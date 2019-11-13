package aula185InterfacesSolucaoProblema.model.services;

public class TaxaBrasilService implements TaxaService{

	public double taxa(double quantia) {
		if ( quantia <= 100.0) {
			return quantia * 0.2;
		} else {
			return quantia * 0.15;
		}
	}
}
