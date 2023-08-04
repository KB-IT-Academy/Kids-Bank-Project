package session;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SessionSet {

	private static SessionSet ss = new SessionSet();
	private Set<Session> set; 
	
	public SessionSet() {
		set = new HashSet<>();
	}
	
	public static SessionSet getInstance() {//SessionSet.getInstance() 호출해서 SessionSet 리턴받는다.
		return ss;
	}
	
	
	/**
	 * 사용자 찾기
	 * */
	public Session get(String sessionId) {
		for(Session session : set) {
			if(session.getSessionId().equals(sessionId)) { 
				return session;
			}
		}
		return null;
	}
	
	
	/**
	 * 사용자 찾기 - pk값으로 찾기 
	 * */
	public Session get(int num) {
		for(Session session : set) {
			if(session.getUserNum() == num) { 
				return session;
			}
		}
		return null;
	}
	
	//세션 객체들 반환
	public Set<Session> getSet(){
			return set;
	}
	
 
	
	/**
	* 로그인 된 사용자 추가
	* */
	public void add(Session session) {
		set.add(session);
	}
		
	/**
	 * 사용자 제거 - 로그아웃
	 * */
	public void remove(Session session) {
		set.remove(session);
	}

	
}
