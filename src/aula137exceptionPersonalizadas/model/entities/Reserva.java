package aula137exceptionPersonalizadas.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import aula137exceptionPersonalizadas.model.exceptions.DomainException;

public class Reserva {
	
	private Integer numeroQuarto;
	private Date checkIn;
	private Date checkOut;
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reserva(Integer numeroQuarto, Date checkIn, Date checkOut) {
		if(!checkOut.after(checkIn)) {
			throw new DomainException("Check-out deve ser depois de Check-in");			
		}
		this.numeroQuarto = numeroQuarto;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getNumeroQuarto() {
		return numeroQuarto;
	}

	public void setNumeroQuarto(Integer numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public long duracao() {
		long diferenca = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);
	}
	
	public void updateDates(Date checkIn, Date checkOut) {
		
		Date now = new Date();
		if(checkIn.before(now) || checkOut.before(now)) {
			throw new DomainException("A reserva deve ser em uma data futura");
		}
		
		if(!checkOut.after(checkIn)) {
			throw new DomainException("Check-out deve ser depois de Check-in");			
		}
		
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	@Override
	public String toString() {
		return "Quarto " 
				+ this.numeroQuarto
				+ ", check-in: "
				+ sdf.format(this.checkIn)
				+ ", check-out: "
				+ sdf.format(checkOut)
				+ ", "
				+ this.duracao()
				+ " noites";
	}
	
	
}
