package dao;

import dto.ChildDto;

public interface ChildDao {
	/**
	 * 자식 회원 가입하는 메서드
	 * @param Childdto 
	 */
	void CreateChild(ChildDto dto);
	
	/**
	 * 자식 회원 수정하는 메서드
	 * @param Childdto
	 */
	void updateChild(ChildDto dto);
	
	/**
	 * 자식 로그인하는 메서드
	 * @param id
	 * @param password
	 */
	void loginChild(String id, String password);
}
