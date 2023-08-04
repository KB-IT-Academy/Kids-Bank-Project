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
		SuccessView.printChilds(list);
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
		SuccessView.printOneChild(dto);
		} catch (RuntimeException e) {
			FailView.errorMessage(e.getMessage());
		}
	}
	
	/**
	 * 자식 주민등록번호로 자식 번호를 가져오는 메서드
	 * @param registNum
	 * @return 자식 번호
	 */
	public static int childFindByRegistNum(String registNum) {
		try {			
		int result = myPageService.childFindByRegistNum(registNum);
			return result;
		} catch (RuntimeException e) {
			FailView.errorMessage(e.getMessage());
		}
		return -1;
	}
	
	/**
	 * 자식의 비밀번호 가져오는 함수
	 * @param num
	 * @return
	 */
	public static String getChildPassword(int num) {
		try {
			String password = myPageService.getChildPassword(num);
			return password;
		} catch (RuntimeException e) {
			FailView.errorMessage(e.getMessage());
		}
		return null;
	}
	
	/**
	 * 부모의 비밀번호 가져오는 함수
	 * @param num
	 * @return
	 */
	public static String getParentPassword(int num) {
		try {
			String password = myPageService.getParentPassword(num);
			return password;
		} catch (RuntimeException e) {
			FailView.errorMessage(e.getMessage());
		}
		return null;
	}
	/**
	 * 자식 회원 탈퇴하는 메서드
	 */
	public static void childDelete(int childNum) {
		try {			
		int result = myPageService.childDelete(childNum);
		SuccessView.messagePrint("탈퇴되었습니다.");
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
		SuccessView.printParents(list);
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
		SuccessView.printOneParent(dto);
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
		} catch (RuntimeException e) {
			FailView.errorMessage(e.getMessage());
		}
	}
	
	/**
	 * 연결된 부모 확인하는 메서드
	 */
	public static void getParent(int childNum) {
		try {			
		List<ParentDto> list = mypageDao.getParent(childNum);
		SuccessView.printParentName(list);
		} catch (RuntimeException e) {
			FailView.errorMessage(e.getMessage());
		}
	}
	
	/**
	 * 연결된 자식 보여주고 반환하는 메서드
	 */ 
	public static List<ChildDto> getChild(int num) {
		try {			
			List<ChildDto> list = myPageService.getChild(num);  
			
			//SuccessView.printChildName(list);
			SuccessView.printChilds(list);
			return list;
		} catch (RuntimeException e) {
			FailView.errorMessage(e.getMessage()); 
			return null; 
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
	public static void createRelation(int parentNum, String registNum, int order) {
		try {			
		int result = myPageService.createRelation(parentNum ,registNum, order);
		} catch (RuntimeException e) {
			FailView.errorMessage(e.getMessage());
		}
	}
}
