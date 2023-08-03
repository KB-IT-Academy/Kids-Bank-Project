package controller;

import java.util.List;


import dto.ChildDto;
import dto.ParentDto;
import service.JoinServiceImpl;
import service.MyPageService;
import service.MyPageServiceImpl;
import service.joinService;
import view.FailView;
import view.SuccessView;
import service.joinService;

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
	public static void createParent(ParentDto dto, String registNum) {
		
	}
	
	/**
	 * 부모 회원 수정하는 메서드
	 * @param Parentdto
	 */
	public static void updateParent(ParentDto dto) {
		
	}
	
	

	
	
}	
