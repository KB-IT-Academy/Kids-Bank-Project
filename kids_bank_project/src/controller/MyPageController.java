package controller;

import java.util.List;

import dao.ChildDao;
import dao.ChildDaoImpl;
import dto.ChildDto;
import dto.ParentDto;
import dto.UserDto;
import service.MyPageService;
import service.MyPageServiceImpl;
import view.FailView;
import view.SuccessView;
import dao.MyPageDao;
import dao.MyPageDaoImpl;

public class MyPageController {
	private static MyPageService myPageService = MyPageServiceImpl.getInstance();
	
	static MyPageDao mypageDao = new MyPageDaoImpl(); 
	/**
	 * 모든 자식 회원 조회하는 메서드
	 */
	public static void childFindAll() {
		try {			
		List<ChildDto> list = mypageDao.childFindAll();
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
	public static void childDelete(int childNum) {
		try {			
		int result = myPageService.childDelete(childNum);
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
	public static void parentDelete(int parentNum) {
		try {			
		int result = myPageService.parentDelete(parentNum);
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
		List<UserDto> list = mypageDao.getParent();
		SuccessView.printParents(list);
		} catch (RuntimeException e) {
			FailView.errorMessage(e.getMessage());
		}
	}
	
	/**
	 * 연결된 자식 보여주고 반환하는 메서드
	 */ 
	public static int getChild(int num) {
		try {			
			List<ChildDto> list = myPageService.getChild(num); 
			//System.out.println("자식찾기 성공 ");
			
			SuccessView.printChilds(list);
			return 0;
		} catch (RuntimeException e) {
			FailView.errorMessage(e.getMessage());
			return 1;
		
		}
	}
	
	/**
	 * 자식 보여주는 메서드(부모 메인 view)
	 */
	/*
	public static List<ChildDto> showChild(int num) {
		try {			
		List<ChildDto> list = myPageService.getChild(num); 
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
	*/
	
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
