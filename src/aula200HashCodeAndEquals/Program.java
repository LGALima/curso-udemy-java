package aula200HashCodeAndEquals;

import aula200HashCodeAndEquals.entities.Client;

public class Program {

	public static void main(String[] args) {
		Client c1 = new Client("MAria", "seila");
		Client c2 = new Client("MAria", "seila");

		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2);
	}

}
