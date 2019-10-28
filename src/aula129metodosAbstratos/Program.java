package aula129metodosAbstratos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import aula129metodosAbstratos.entities.Circulo;
import aula129metodosAbstratos.entities.Retangulo;
import aula129metodosAbstratos.entities.Shape;
import aula129metodosAbstratos.entities.enums.Color;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		List<Shape> list = new ArrayList<>();
		
		System.out.println("Entre com o numero de figuras: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.print("Figura #" + i + " dados: ");
			System.out.print("Retangulo ou  circulo (r/c)? ");
			char ch = sc.next().charAt(0);
			System.out.println("Cor(PRETO/AZUL/VERMELHO)");
			Color color =  Color.valueOf(sc.next());
			
			if(ch == 'r') {
				System.out.print("Largura: ");
				double largura = sc.nextDouble();
				System.out.print("Altura: ");
				double altura = sc.nextDouble();
				list.add(new Retangulo(color, largura, altura));
			} else if (ch == 'c') {
				System.out.println("Raio: ");
				double raio = sc.nextDouble();
				list.add(new Circulo(color, raio));
			}
		}
		
		System.out.println();
		System.out.println("Area das figuras");
		for(Shape figura : list) {
			System.out.println(String.format("%.2f", figura.area()));
		}
	}
}
