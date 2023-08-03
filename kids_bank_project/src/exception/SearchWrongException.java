package exception;

public class SearchWrongException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public SearchWrongException() {};
	
	/**
	 * 자식 데이터를 조회할 수 없습니다.
	 * 부모 데이터를 조회할 수 없습니다. 
	 * 
	 */
	public SearchWrongException(String message) {
		super(message);
	}
}
