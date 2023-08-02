package controller;

import java.util.List;
import dto.ChildDto;
import dto.ParentDto;
import dto.UserDto;

public class MyPageController {
	/**
	 * 모든 자식 회원 조회
	 */
	public List<ChildDto> childFindAll() {
		
		return null;
	}
	
	/**
	 * 자식 고유 번호로 회원 조회
	 * @param 자식 고유 번호
	 */
	public ChildDto childFindByNumber(int num) {
		
		return null;
	}
	
	/**
	 * 자식 회원 탈퇴
	 */
	public void childDelete() {
		
	}
	
	/**
	 * 모든 부모 회원 조회
	 */
	public List<ParentDto> parentFindAll() {
		
		return null;
	}
	
	/**
	 * 부모 고유 번호로 회원 조회
	 * @param 부모 고유 번호
	 */
	public ParentDto parentFindByNumber(int num) {
		
		return null;
	}
	
	/**
	 * 부모 회원 탈퇴 
	 */
	public void parentDelete() {
		
	}
	
	/**
	 * 연결된 부모 확인
	 */
	public List<UserDto> getParent() {
		return null;
	}
	
	/**
	 * 연결된 자식 확인
	 */
	public List<UserDto> getChild() {
		return null;
	}
	/**
	 * 가족 관계 생성(부모 => 자식)
	 * @param 주민등록번호(registNum)
	 */
	public void createRelation(String registNum) {
		
	}
}
