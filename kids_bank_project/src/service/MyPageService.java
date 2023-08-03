package service;

import java.util.List;

import dto.ChildDto;
import dto.ParentDto;
import dto.UserDto;
import exception.DMLException;
import exception.SearchNotFoundException;

public interface MyPageService {
	/**
	 * 모든 자식 회원 조회하는 메서드
	 */
	List<ChildDto> childFindAll() throws SearchNotFoundException; 
	
	/**
	 * 자식 고유 번호로 회원 조회하는 메서드
	 * @param num 자식 고유 번호
	 */
	ChildDto childFindByNumber(int num) throws SearchNotFoundException;
	
	/**
	 * 자식 회원 탈퇴하는 메서드
	 */
	int childDelete(int childNum) throws DMLException;
	
	/**
	 * 모든 부모 회원 조회하는 메서드
	 */
	List<ParentDto> parentFindAll() throws SearchNotFoundException;
	
	/**
	 * 부모 고유 번호로 회원 조회하는 메서드
	 * @param 부모 고유 번호
	 */
	ParentDto parentFindByNumber(int num) throws SearchNotFoundException;
	
	/**
	 * 부모 회원 탈퇴하는 메서드 
	 */
	int parentDelete(int parentNum) throws DMLException;
	
	/**
	 * 연결된 부모 확인하는 메서드
	 */
	List<UserDto> getParent() throws SearchNotFoundException;
	
	/**
	 * 연결된 자식 확인하는 메서드
	 */
	List<ChildDto> getChild(int num) throws SearchNotFoundException;
	
	/**
	 * 가족 관계 생성(부모 => 자식)
	 * @param 주민등록번호(registNum)
	 * @param 자식 순서(첫째인지 둘째인지)
	 */
	int createRelation(String registNum, int order) throws DMLException;
}
