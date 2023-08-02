package service;

import dto.ChildDto;
import dto.ParentDto;

public interface joinService {
	/**
	 * 자식 회원 가입
	 * @param Childdto 
	 */
	void CreateChild(ChildDto dto);
	
	/**
	 * 자식 회원 수정
	 * @param Childdto
	 */
	void updateChild(ChildDto dto);
	
	/**
	 * 부모 회원 가입
	 * @param ParentDto
	 * @param registNum(자식 주민등록번호)
	 */
	void createParent(ParentDto dto, String registNum);
	
	/**
	 * 부모 회원 수정
	 * @param Parentdto
	 */
	void updateParent(ParentDto dto);
}
