package controller;

import java.util.List;

import dto.ChildDto;
import dto.ParentDto;
import exception.SearchNotFoundException;
import service.JoinServiceImpl;
import service.MyPageService;
import service.MyPageServiceImpl;
import service.joinService;
import view.FailView;
import view.SuccessView;

public class JoinController {
	private static joinService joinservice = JoinServiceImpl.getInstance();

	/**
	 * 자식 회원 가입하는 메서드
	 * @param Childdto 
	 */
	public static void CreateChild(ChildDto dto) {
		try {			
			int result = joinservice.CreateChild(dto);
			SuccessView.messagePrint("회원가입 성공!!");
		} catch (RuntimeException e) {
			FailView.errorMessage(e.getMessage());
		}
	}
	
	/**
	 * 자식 회원 수정하는 메서드
	 * @param Childdto
	 */
	public static void updateChild(ChildDto dto) {
		
	}
	
	
	
	
	///////////////////////////////////////
	
	/**
	 * 부모 회원 가입하는 메서드
	 * @param ParentDto
	 * @param registNum(자식 주민등록번호)
	 */
	public static int createParent(ParentDto dto, String registNum) {
		try {			
			int result = joinservice.createParent(dto, registNum);
			return result;
		} catch (RuntimeException e) {
			FailView.errorMessage(e.getMessage());
		}
		return -1;
	}
	
	public static int getParentNum(String id) {
		try {
			int parentNum = joinservice.getParentNum(id);
			return parentNum;
		} catch (RuntimeException e) {
			FailView.errorMessage(e.getMessage());
		}
		return -1;
	}
	/**
	 * 부모 회원 수정하는 메서드
	 * @param Parentdto
	 */
	public static void updateParent(ParentDto dto) {
		
	}
	
	

	
	
}	
