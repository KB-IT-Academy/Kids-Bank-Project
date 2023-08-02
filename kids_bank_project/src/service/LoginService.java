package service;

public interface LoginService {
	/**
	 * 자식 로그인
	 * @param id
	 * @param password
	 */
	void loginChild(String id, String password);

	/**
	 * 자식 로그아웃
	 */
	void logoutChild();
	
	/**
	 * 부모 로그인
	 * @param id
	 * @param password
	 */
	void loginParent(String id, String password);
	
	/**
	 * 부모 로그아웃
	 */
	void logoutParent();
}
