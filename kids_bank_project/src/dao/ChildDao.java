package dao;

import java.sql.SQLException;

import dto.ChildDto;
import exception.SearchNotFoundException;
import exception.SearchWrongException;

public interface ChildDao {
	/**
	 * 자식 회원 가입하는 메서드
	 * @param Childdto 
	 */
	int CreateChild(ChildDto dto);
	
	/**
	 * 자식 회원 수정하는 메서드
	 * @param Childdto
	 */
	void updateChild(ChildDto dto);
	
	/**
	 * 자식 로그인하는 메서드
	 * @param id
	 * @param password
	 * @throws SQLException 
	 * @throws SearchNotFoundException 
	 */ 

	ChildDto loginChild(String id, String password) throws SearchWrongException;
}
