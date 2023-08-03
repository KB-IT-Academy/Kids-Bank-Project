package session;
 
/**
 * 사용자 객체
 * */
public class Session {
	private String sessionId; 
	
	public Session() {}
	
	
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