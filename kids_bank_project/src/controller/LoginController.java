package controller;

import dto.ChildDto;
import dto.ParentDto;
import service.LoginService;
import view.FailView; 

public class LoginController {
	// 생각해보니 로그아웃은 controller없어도 될것같은느낌?
	static LoginService loginService = new LoginService();
	public static boolean loginCheck = true;
	  
	
	/**
	 * 자식 로그인하는 메서드
	 * @param id
	 * @param password
	 */
	public static boolean loginChild(String id, String password) {
		try {
			ChildDto child = loginService.loginChild(id, password); 
			//ChildStartView.printChildStart(child.getId()); // 아이 id 넘겨주기
			//ChildStartView.printMainMenu(); 
			return loginCheck;
		 
			
		}catch(Exception e) { 
			loginCheck = false; 
			FailView.errorMessage("다시 로그인 해주세요.");
			return loginCheck; 
 
			
		} 
		
	}
	
	/**
	 * 자식 로그아웃하는 메서드
	 */
	public static void logoutChild(String parentChild) {
		remove(parentChild);
		
	}
	
	private static void remove(String parentChild) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 부모 로그인하는 메서드
	 * @param id
	 * @param password
	 */
	public static ParentDto loginParent(String id, String password) {
		try {
			ParentDto parent = LoginService.loginParent(id, password); 
			//ChildStartView.printChildStart(child.getId()); // 아이 id 넘겨주기
			//ChildStartView.printMainMenu(); 
			return parent;
		 
			
		}catch(Exception e) { 
			loginCheck = false; 
			FailView.errorMessage("다시 로그인 해주세요.");
			return null; 
 
			
		} 
		
	}
	
	/**
	 * 부모 로그아웃하는 메서드
	 */
	public static void logoutParent() {
		
	}
}
