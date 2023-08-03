package exception;

/**
 * insert, update, delete 에 결과가 오류가 있을때 발생시킬예외
 * */
public class SearchNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public SearchNotFoundException() {}
	
	
	public SearchNotFoundException(String message) {
		super(message);
	}
	
}
