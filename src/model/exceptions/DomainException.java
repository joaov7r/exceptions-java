package model.exceptions;

//RuntimeException, o compilador não te obriga a tratar as exceções, como é com Exception apenas.
public class DomainException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
	}

}
