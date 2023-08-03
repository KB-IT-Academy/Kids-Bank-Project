package exception;

public class SearchWrongException extends RuntimeException{
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
