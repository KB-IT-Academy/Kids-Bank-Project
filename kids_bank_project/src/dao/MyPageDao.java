package dao;

import java.util.List;

import dto.ChildDto;
import dto.ParentDto;
import dto.UserDto;

public interface MyPageDao {
	
	/**
	 * 모든 자식 회원 조회하는 메서드
	 * select * from child;
	 */
	List<ChildDto> childFindAll(); 
	
	/**
	 * 자식 고유 번호로 회원 조회하는 메서드
	 * @param num 자식 고유 번호
	 * select * from child where child_num = ? (자식 고유 번호)
	 */
	ChildDto childFindByNumber(int num);
	
	/**
	 * 자식 회원 탈퇴하는 메서드
	 * delete child where child_num = ? (자식 고유 번호)
	 */
	int childDelete();
	
	/**
	 * 모든 부모 회원 조회하는 메서드
	 * select * from parent
	 */
	List<ParentDto> parentFindAll();
	
	/**
	 * 부모 고유 번호로 회원 조회하는 메서드
	 * @param 부모 고유 번호
	 * select * from parent where parent_num = ? (부모 고유 번호)
	 */
	ParentDto parentFindByNumber(int num);
	
	/**
	 * 부모 회원 탈퇴하는 메서드 
	 * delete parent where parent_num = ? (부모 고유 번호)
	 */
	int parentDelete();
	
	/**
	 * 연결된 부모 확인하는 메서드
	 * select * from parent_child where child_num = ? (자식 고유 번호)
	 * select * from parent where parent_num = ? (부모 고유 번호)
	 */
	List<UserDto> getParent();
	
	/**
	 * 연결된 자식 확인하는 메서드
	 * select * from parent_child where parent_num = ?
	 * select * from parent where child_
	 */
	List<ChildDto> getChild(int num);
	
	/**
	 * 가족 관계 생성(부모 => 자식)
	 * @param 주민등록번호(registNum)
	 * @param 자식 순서(첫째인지 둘째인지)
	 * select * from child where registration_num = ? (주민등록번호)
	 * insert into parent_child values (?, ?, ?, ?) (1. parent_child_num, 2. child_num, 3. parent_num, 4. child_order) 
	 */
	int createRelation(String registNum, int order) ;
}
