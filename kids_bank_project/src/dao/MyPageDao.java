package dao;

import java.sql.SQLException;
import java.util.List;

import dto.ChildDto;
import dto.ParentDto;
import dto.UserDto;
import exception.DMLException;
import exception.SearchWrongException;

public interface MyPageDao {
	
	/**
	 * 모든 자식 회원 조회하는 메서드
	 * select * from child;
	 */
	List<ChildDto> childFindAll() throws SearchWrongException; 
	
	/**
	 * 자식 고유 번호로 회원 조회하는 메서드
	 * @param num 자식 고유 번호
	 * select * from child where child_num = ? (자식 고유 번호)
	 */
	ChildDto childFindByNumber(int num) throws SearchWrongException;
	
	/**
	 * 자식 주민등록번호로 자식 번호를 가져오는 메서드
	 * @param registNum
	 * @return 자식 번호
	 * @throws SQLException 
	 */
	int childFindByRegistNum(String registNum) throws SearchWrongException;
	
	/**
	 * 자식 회원 탈퇴하는 메서드
	 * delete child where child_num = ? (자식 고유 번호)
	 */
	int childDelete(int childNum) throws DMLException;
	
	/**
	 * 모든 부모 회원 조회하는 메서드
	 * select * from parent
	 */
	List<ParentDto> parentFindAll() throws SearchWrongException;
	
	/**
	 * 부모 고유 번호로 회원 조회하는 메서드
	 * @param 부모 고유 번호
	 * select * from parent where parent_num = ? (부모 고유 번호)
	 */
	ParentDto parentFindByNumber(int num) throws SearchWrongException;
	
	/**
	 * 부모 회원 탈퇴하는 메서드 
	 * delete parent where parent_num = ? (부모 고유 번호)
	 */
	int parentDelete(int parentNum) throws DMLException;
	
	/**
	 * 연결된 부모 확인하는 메서드
	 * select * from parent_child where child_num = ? (자식 고유 번호)
	 * select * from parent where parent_num = ? (부모 고유 번호)
	 */
	List<UserDto> getParent() throws SearchWrongException;
	
	/**
	 * 연결된 자식 확인하는 메서드
	 * select * from parent_child where parent_num = ?
	 * select * from parent where child_
	 */
	List<ChildDto> getChild(int num) throws SearchWrongException;
	
	/**
	 * 가족 관계 생성(부모 => 자식)
	 * @param 주민등록번호(registNum)
	 * @param 자식 순서(첫째인지 둘째인지)
	 * select * from child where registration_num = ? (주민등록번호)
	 * insert into parent_child values (?, ?, ?, ?) (1. parent_child_num, 2. child_num, 3. parent_num, 4. child_order) 
	 */
	int createRelation(int parentNum,String registNum, int order) throws DMLException;
}
