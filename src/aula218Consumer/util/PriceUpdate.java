package aula218Consumer.util;

import java.util.function.Consumer;

import aula218Consumer.entities.Product;

public class PriceUpdate implements Consumer<Product>{

	@Override
	public void accept(Product p) {
		p.setPrice(p.getPrice() * 1.1D);
	}
	
}
