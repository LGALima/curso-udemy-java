package aula099tipoDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program {
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT")); // horario green
		
		Date y1 = sdf1.parse("25/06/2019");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		Date dataAtual1 = new Date();
		Date dataAtual2 = new Date(System.currentTimeMillis());
		
		Date x = new Date(0L);
		Date x2 = new Date(1000L * 60 * 60 * 5);
		
		System.out.println(sdf2.format(y1));
		System.out.println(sdf2.format(y2));
		System.out.println(sdf2.format(y3));
		System.out.println("----------------");
		System.out.println(sdf2.format(dataAtual1));
		System.out.println(sdf2.format(dataAtual2));
		System.out.println("----------------");
		System.out.println(sdf2.format(x));
		System.out.println(sdf2.format(x2));
		System.out.println("----------------");
		System.out.println(sdf3.format(y3));
	}
}
