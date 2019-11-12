package aula137exceptionPersonalizadas.model.exceptions;

public class DomainException extends RuntimeException{
	/**
	 * A runtimeexception não te obriga a tratar, mas caso não haja vatch a aplicação quebra
	 */
	
	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
	}
}
