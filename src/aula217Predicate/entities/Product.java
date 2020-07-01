package aula217Predicate.entities;

public class Product {
	private String name;
	private Double price;

	public Product(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public Product() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public static boolean staticProductPredicate(Product p) {
		return p.getPrice() >= 100;
	}
	
	public boolean nonStaticProductPredicate() {
		return price >= 100;
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}

}