package aula217Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import aula217Predicate.entities.Product;
import aula217Predicate.util.ProductPredicate;

public class Program {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		list.removeIf(p-> p.getPrice() >= 100);
		
//		Predicate<Product> pred = p -> p.getPrice() >= 100;
//		list.removeIf(pred);
		
//		list.removeIf(Product::staticProductPredicate);
//		list.removeIf(Product::nonStaticProductPredicate); 
		
		for(Product p : list) {
			System.out.println(p);
		}
	}
}
