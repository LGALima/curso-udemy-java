package aula220FuncaoQueRecebeFuncaoPorParametro;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import aula220FuncaoQueRecebeFuncaoPorParametro.entities.Product;
import aula220FuncaoQueRecebeFuncaoPorParametro.model.services.ProductService;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD Case", 80.50));
		
		ProductService ps = new ProductService();
		
		double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'M');
		System.out.println("Su = " + String.format("%.2f", sum));
	}
}
