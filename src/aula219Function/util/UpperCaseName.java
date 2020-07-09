package aula219Function.util;

import java.util.function.Function;

import aula219Function.entities.Product;

public class UpperCaseName implements Function<Product, String>{

	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}
	
}
