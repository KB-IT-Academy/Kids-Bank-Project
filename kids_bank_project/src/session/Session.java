package session;
 
/**
 * 사용자 객체
 * */
public class Session {
	private String sessionId; 
	private int userNum;
	
	
	// 로그인 중인 회원의 pk
	public int getSessionUserNum() {
		return userNum;
	}
	 
	
	public Session(int user_num) { 
		this.userNum = user_num;
	}




	public int getUserNum() {
		return userNum;
	}


	public void setUserNum(int userNum) {
		this.userNum = userNum;
	}


	public Session(String id) {
		this.sessionId = id;
	} 
	
	public String getSessionId() {
		return sessionId;
	}
	
  

	public void setSessionId(String id) {
		this.sessionId = id;
	}

	public void getSessionId(String id) {
		this.sessionId = id;
	}
	
	 
	 
	
	@Override
	public String toString() {
		return "Session [sessionId=" + sessionId + "]"+"\n"; // 현제 접속중인 sessionId 출
	}
	
	
	@Override
	public int hashCode() { 
		return sessionId.hashCode();
	}

	@Override
	public boolean equals(Object obj) { // 같은 객체인지 확인 
		Session other = (Session) obj;
		if(sessionId.equals(other.sessionId)) {
			return true; // 같은 객체 
		}else {
			return false;
		}
		
	}
}