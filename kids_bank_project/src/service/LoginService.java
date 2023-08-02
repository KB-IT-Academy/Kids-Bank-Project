package service;

public interface LoginService {
	/**
	 * 자식 로그인하는 메서드
	 * @param id
	 * @param password
	 */
	void loginChild(String id, String password);

	/**
	 * 자식 로그아웃하는 메서드
	 */
	void logoutChild();
	
	/**
	 * 부모 로그인하는 메서드
	 * @param id
	 * @param password
	 */
	void loginParent(String id, String password);
	
	/**
	 * 부모 로그아웃하는 메서드
	 */
	void logoutParent();
}
