package aula057strings;

public class PropriedadesStrings {

	public static void main(String[] args) {
		String original = "Teste varios testes espaco     ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("tes", "tex");
		int i = original.indexOf("te");
		int j = original.lastIndexOf("te");
		
		System.out.println("original: " + original);
		System.out.println("toLowerCase: " + s01);
		System.out.println("toUpperCase: "+s02);
		System.out.println("trim: " + s03);
		System.out.println("substring(2): " + s04);
		System.out.println("substring(2,9):" +s05);
		System.out.println("replace('a', 'x'): " + s06);
		System.out.println("replace(\"tes\", \"TES\"): " + s07);
		System.out.println("Index of 'te': " + i);
		System.out.println("LastIndex of 'te': " + j);
		
		System.out.println("--------");
		
		String s = "potato apple lemon";
		
		String [] vect = s.split(" ");
		
		for (String string : vect) {
			System.out.println(string);
		}
	}

}
