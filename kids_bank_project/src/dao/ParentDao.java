package dao;

import java.sql.SQLException;

import dto.ParentDto;

public interface ParentDao {
	/**
	 * 부모 회원 가입하는 메서드
	 * @param ParentDto
	 * @param registNum(자식 주민등록번호)
	 */
	void createParent(ParentDto dto, String registNum);
	
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
}
