package service;

import java.util.List;

import dto.ChildDto;
import dto.ParentDto;
import dto.UserDto;

public interface MyPageService {
	/**
	 * 모든 자식 회원 조회
	 */
	public List<ChildDto> childFindAll(); 
	
	/**
	 * 자식 고유 번호로 회원 조회
	 */
	public ChildDto childFindByNumber(int num);
	
	/**
	 * 자식 회원 탈퇴
	 */
	public void childDelete();
	
	/**
	 * 모든 부모 회원 조회
	 */
	public List<ParentDto> parentFindAll();
	
	/**
	 * 부모 고유 번호로 회원 조회
	 */
	public ParentDto parentFindByNumber(int num);
	
	/**
	 * 부모 회원 탈퇴 
	 */
	public void parentDelete();
	
	/**
	 * 연결된 부모 확인
	 */
	public List<UserDto> getParent();
	
	/**
	 * 연결된 자식 확인
	 */
	public List<UserDto> getChild();
	
	/**
	 * 가족 관계 생성(부모 => 자식)
	 */
	public void createRelation(String registNum) ;
}
