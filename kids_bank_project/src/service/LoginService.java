package service;

import dao.ChildDao;
import dao.ChildDaoImpl;
import dto.ChildDto;
import dto.ParentDto;
import session.Session;
import session.SessionSet;

import dao.ParentDao;
import dao.ParentDaoImpl;

public class LoginService {
	//public static boolean loginCheck = true;
	static ChildDao childDao = new ChildDaoImpl();  
	static ParentDao parentDao = new ParentDaoImpl();  
	

	/**
	 * 자식 로그인하는 메서드
	 * @param id
	 * @param password
	 * @throws Exception 
	 */
	public static ChildDto loginChild(String id, String password) throws Exception {
		ChildDto child = childDao.loginChild(id, password);
		if(child == null) { 
			//System.out.println("로그인 틀림 "); // 지우기  
			throw new Exception("정보를 다시 확인해주세요.");
		} 
		
		//로그인 된 정보 저장하기
		Session session = new Session(id);
		
		
		SessionSet sessionSet = SessionSet.getInstance();
		sessionSet.add(session); //인증된사용자를 SessionSet에 저장한다.
		
		//System.out.println(session.toString());
		
		return child;
	}

	/**
	 * 자식 로그아웃하는 메서드
	 */
	public static void logoutChild(Session session) {
		SessionSet sessionSet = new SessionSet();
		sessionSet.remove(session); 
		
	}
	
	/**
	 * 부모 로그인하는 메서드
	 * @param id
	 * @param password
	 */
	public static ParentDto loginParent(String id, String password) throws Exception {
		ParentDto parent = parentDao.loginParent(id, password);
		if(parent == null) { 
			System.out.println("로그인 틀림 "); // 지우기  
			throw new Exception("정보를 다시 확인해주세요.");
		} 
		
		//로그인 된 정보 저장하기
		Session session = new Session(id);
		
		
		SessionSet sessionSet = SessionSet.getInstance();
		sessionSet.add(session); //인증된사용자를 SessionSet에 저장한다.
		
		//System.out.println(session.toString());
		
		return parent;
		
	}
	
	/**
	 * 부모 로그아웃하는 메서드
	 */
	public static void logoutParent(Session session) {  
		
		SessionSet sessionSet = new SessionSet();
		sessionSet.remove(session); 
		
	}
}
