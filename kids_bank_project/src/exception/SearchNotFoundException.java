package exception;

public class SearchNotFoundException extends RuntimeException{
	 
	

	private static final long serialVersionUID = 1L;
	

	public SearchNotFoundException() {}

	/**
	 * 주간 통계 조회에 오류가 발생했습니다.
	 * 
	 */

	public SearchNotFoundException(String message) {
		super(message);
	}



}
 
