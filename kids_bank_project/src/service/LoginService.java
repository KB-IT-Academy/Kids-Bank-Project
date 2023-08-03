package service;

import dao.ChildDao;
import dao.ChildDaoImpl;
import dto.ChildDto;
import session.Session;
import session.SessionSet;

public class LoginService {
	//public static boolean loginCheck = true;
	static ChildDao childDao = new ChildDaoImpl();  
	

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
	//void logoutChild();
	
	/**
	 * 부모 로그인하는 메서드
	 * @param id
	 * @param password
	 */
	//void loginParent(String id, String password);
	
	/**
	 * 부모 로그아웃하는 메서드
	 */
	//void logoutParent();
}
