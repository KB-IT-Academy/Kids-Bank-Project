package exception;


/**
 * 검색했을때 찾고자하는 정보가 없는 경우 예외
 * */
public class SearchNotFoundException extends Exception{
	public  SearchNotFoundException() {
	}
	
	public SearchNotFoundException(String message) {
		super(message);
	}

}
 
