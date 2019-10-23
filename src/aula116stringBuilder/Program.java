package aula116stringBuilder;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import aula116stringBuilder.entities.Comment;
import aula116stringBuilder.entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Comment c1 = new Comment("Have a nice trip");
		Comment c2 = new Comment("Lol that is awesome");
		Post p1 = new Post(sdf.parse("21/06/2018 13:03:20"), "Traveling to New Zealand", "Preguica de inventar", 14);

		p1.addCommnet(c1);
		p1.addCommnet(c2);
		
		System.out.println(p1);
	}

}
