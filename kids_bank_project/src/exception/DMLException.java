package exception;

/**
 * insert, update, delete 에 결과가 오류가 있을때 발생시킬예외
 * */
public class DMLException extends RuntimeException{
	public DMLException() {}
	public DMLException(String message) {
		super(message);
	}
	
}
