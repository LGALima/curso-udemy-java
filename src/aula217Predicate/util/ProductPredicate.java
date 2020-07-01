package aula217Predicate.util;

import java.util.function.Predicate;

import aula217Predicate.entities.Product;

public class ProductPredicate implements Predicate<Product>{

	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 100;
	}
	
}
