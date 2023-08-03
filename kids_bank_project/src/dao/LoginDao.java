package dao;

public interface LoginDao {
	/**
	 * 자식 로그인하는 메서드
	 * @param id
	 * @param password
	 */
	void loginChild(String id, String password);

	
	/**
	 * 부모 로그인하는 메서드
	 * @param id
	 * @param password
	 */
	void loginParent(String id, String password);
	
}
