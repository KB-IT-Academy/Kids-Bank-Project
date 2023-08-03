package service;

import java.util.List;

import dto.ChildDto;
import dto.ParentDto;
import dto.UserDto;

public interface MyPageService {
	/**
	 * 모든 자식 회원 조회하는 메서드
	 */
	List<ChildDto> childFindAll(); 
	
	/**
	 * 자식 고유 번호로 회원 조회하는 메서드
	 * @param num 자식 고유 번호
	 */
	ChildDto childFindByNumber(int num);
	
	/**
	 * 자식 회원 탈퇴하는 메서드
	 */
	int childDelete();
	
	/**
	 * 모든 부모 회원 조회하는 메서드
	 */
	List<ParentDto> parentFindAll();
	
	/**
	 * 부모 고유 번호로 회원 조회하는 메서드
	 * @param 부모 고유 번호
	 */
	ParentDto parentFindByNumber(int num);
	
	/**
	 * 부모 회원 탈퇴하는 메서드 
	 */
	int parentDelete();
	
	/**
	 * 연결된 부모 확인하는 메서드
	 */
	List<UserDto> getParent();
	
	/**
	 * 연결된 자식 확인하는 메서드
	 */
	List<UserDto> getChild();
	
	/**
	 * 가족 관계 생성(부모 => 자식)
	 * @param 주민등록번호(registNum)
	 */
	int createRelation(String registNum) ;
}
