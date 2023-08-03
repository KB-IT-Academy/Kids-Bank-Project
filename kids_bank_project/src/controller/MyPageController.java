package controller;

import java.util.List;
import dto.ChildDto;
import dto.ParentDto;
import dto.UserDto;
import service.MyPageService;
import service.MyPageServiceImpl;
import view.FailView;
import view.SuccessView;

public class MyPageController {
	private static MyPageService myPageService = MyPageServiceImpl.getInstance();
	/**
	 * 모든 자식 회원 조회하는 메서드
	 */
	public static void childFindAll() {
		try {			
		List<ChildDto> list = myPageService.childFindAll();
		System.out.println(list);
		} catch (RuntimeException e) {
			FailView.errorMessage(e.getMessage());
		}
	}
	
	/**
	 * 자식 고유 번호로 회원 조회하는 메서드
	 * @param num 자식 고유 번호
	 */
	public static void childFindByNumber(int num) {
		try {			
		ChildDto dto = myPageService.childFindByNumber(num);
		System.out.println(dto);
		} catch (RuntimeException e) {
			FailView.errorMessage(e.getMessage());
		}
	}
	
	/**
	 * 자식 회원 탈퇴하는 메서드
	 */
	public static void childDelete() {
		try {			
		int result = myPageService.childDelete();
		System.out.println(result);
		} catch (RuntimeException e) {
			FailView.errorMessage(e.getMessage());
		}
	}
	
	/**
	 * 모든 부모 회원 조회하는 메서드
	 */
	public static void parentFindAll() {
		try {			
		List<ParentDto> list = myPageService.parentFindAll();
		System.out.println(list);
		} catch (RuntimeException e) {
			FailView.errorMessage(e.getMessage());
		}
	}
	
	/**
	 * 부모 고유 번호로 회원 조회하는 메서드
	 * @param 부모 고유 번호
	 */
	public static void parentFindByNumber(int num) {
		try {			
		ParentDto dto = myPageService.parentFindByNumber(num);
		System.out.println(dto);
		} catch (RuntimeException e) {
			FailView.errorMessage(e.getMessage());
		}
	}
	
	/**
	 * 부모 회원 탈퇴하는 메서드 
	 */
	public static void parentDelete() {
		try {			
		int result = myPageService.parentDelete();
		System.out.println(result);
		} catch (RuntimeException e) {
			FailView.errorMessage(e.getMessage());
		}
	}
	
	/**
	 * 연결된 부모 확인하는 메서드
	 */
	public static void getParent() {
		try {			
		List<UserDto> list = myPageService.getParent();
		SuccessView.printParents(list);
		} catch (RuntimeException e) {
			FailView.errorMessage(e.getMessage());
		}
	}
	
	/**
	 * 연결된 자식 보여주고 반환하는 메서드
	 */
	public static List<UserDto> getChild() {
		try {			
		List<UserDto> list = myPageService.getChild();
		SuccessView.printChilds(list);
		return list;
		} catch (RuntimeException e) {
			FailView.errorMessage(e.getMessage());
		}
		return null;
	}
	
	/**
	 * 가족 관계 생성(부모 => 자식)
	 * @param 주민등록번호(registNum)
	 * @param 자식 순서(첫째인지 둘째인지)
	 */
	public static void createRelation(String registNum, int order) {
		try {			
		int result = myPageService.createRelation(registNum, order);
		System.out.println(result);
		} catch (RuntimeException e) {
			FailView.errorMessage(e.getMessage());
		}
	}
}
