package service;

import dto.ChildDto;
import dto.ParentDto;
import exception.DMLException;
import exception.SearchNotFoundException;

public interface joinService {
	/**
	 * 자식 회원 가입하는 메서드
	 * @param Childdto 
	 */
	int CreateChild(ChildDto dto) throws DMLException;
	
	/**
	 * 자식 회원 수정하는 메서드
	 * @param Childdto
	 */
	void updateChild(ChildDto dto);
	
	/**
	 * 부모 회원 가입하는 메서드
	 * @param ParentDto
	 * @param registNum(자식 주민등록번호)
	 */
	int createParent(ParentDto dto, String registNum) throws DMLException;
	
	/**
	 * 부모 id로 부모 번호 가져오는 메서드
	 * @param id
	 * @return
	 * @throws SearchNotFoundException
	 */
	public int getParentNum(String id) throws SearchNotFoundException;
	/**
	 * 부모 회원 수정하는 메서드
	 * @param Parentdto
	 */
	void updateParent(ParentDto dto);
}
