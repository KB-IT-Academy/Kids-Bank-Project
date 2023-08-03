package dao;

import java.sql.SQLException;

import dto.ParentDto;
import exception.DMLException;
import exception.SearchWrongException;

public interface ParentDao {
	/**
	 * 부모 회원 가입하는 메서드
	 * @param ParentDto
	 * @param registNum(자식 주민등록번호)
	 */
	int createParent(ParentDto dto, String registNum) throws DMLException;
	
	/**
	 * 부모 회원 수정하는 메서드
	 * @param Parentdto
	 */
	void updateParent(ParentDto dto);
	
	/**
	 * 부모 로그인하는 메서드
	 * @param id
	 * @param password
	 * @return 
	 * @throws SQLException 
	 */
	ParentDto loginParent(String id, String password) throws SQLException;
	
	/**
	 * 부모 아이디로 number 값 찾는 메서드
	 * @param id
	 * @return
	 * @throws SearchWrongException
	 */
	int getParentNum(String id) throws SearchWrongException;
}
