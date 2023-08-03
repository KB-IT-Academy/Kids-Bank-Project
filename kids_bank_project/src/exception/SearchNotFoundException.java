package exception;

<<<<<<< HEAD
/**
 * insert, update, delete 에 결과가 오류가 있을때 발생시킬예외
 * */
public class SearchNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public SearchNotFoundException() {}
	
=======

/**
 * 검색했을때 찾고자하는 정보가 없는 경우 예외
 * */
public class SearchNotFoundException extends Exception{
	public  SearchNotFoundException() {
	}
>>>>>>> bb0b7a63f3039fd4b3ba9b65ddbc671443058194
	
	public SearchNotFoundException(String message) {
		super(message);
	}
<<<<<<< HEAD
	
=======

>>>>>>> bb0b7a63f3039fd4b3ba9b65ddbc671443058194
}
 
