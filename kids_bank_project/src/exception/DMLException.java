package exception;

/**
 * insert, update, delete 에 결과가 오류가 있을때 발생시킬예외
 * */
public class DMLException extends RuntimeException{
	
	public DMLException() {}
	/**
	 * 기입장을 생성할 수 없습니다.
	 * 기입장을 수정할 수 없습니다.
	 * 기입장을 삭제할 수 없습니다.
	 * 
	 * 댓글을 생성할 수 없습니다.
	 * 댓글을 수정할 수 없습니다.
	 * 댓긍르 삭제할 수 없습니다.
	 * 
	 * 좋아요를 누를 수 없습니다.
	 * 좋아요를 취소할 수 없습니다.
	 * 
	 * 탈퇴할 수 없습니다.
	 * 관계를 설정할 수 없습니다.
	 * 
	 * 이미 존재하는 아이디입니다.
	 */
	public DMLException(String message) {
		super(message);
	}
	
}
