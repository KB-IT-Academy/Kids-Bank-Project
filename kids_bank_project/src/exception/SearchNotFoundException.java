package exception;


public class SearchNotFoundException extends RuntimeException{
	 
	

	private static final long serialVersionUID = 1L;
	
	/**
	 * 데이터가 존재하지 않습니다.
	 */
	public SearchNotFoundException() {
		super("데이터가 존재하지 않습니다.");
	}
	
	
	public SearchNotFoundException(String message) {
		super(message);
	}
	
}
