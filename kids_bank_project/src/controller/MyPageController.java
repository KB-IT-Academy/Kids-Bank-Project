package controller;

import java.util.List;
import dto.ChildDto;
import dto.ParentDto;
import dto.UserDto;
import service.MyPageService;
import service.MyPageServiceImpl;

public class MyPageController {
	private static MyPageService myPageService = MyPageServiceImpl.getInstance();
	/**
	 * 모든 자식 회원 조회
	 */
	public static void childFindAll() {
		
	}
	
	/**
	 * 자식 고유 번호로 회원 조회
	 * @param 자식 고유 번호
	 */
	public static void childFindByNumber(int num) {
		
	}
	
	/**
	 * 자식 회원 탈퇴
	 */
	public static void childDelete() {
		
	}
	
	/**
	 * 모든 부모 회원 조회
	 */
	public static void parentFindAll() {
		
	}
	
	/**
	 * 부모 고유 번호로 회원 조회
	 * @param 부모 고유 번호
	 */
	public void parentFindByNumber(int num) {
		
	}
	
	/**
	 * 부모 회원 탈퇴 
	 */
	public static void parentDelete() {
		
	}
	
	/**
	 * 연결된 부모 확인
	 */
	public static void getParent() {
		List<UserDto> list = myPageService.getParent();
	}
	
	/**
	 * 연결된 자식 확인
	 */
	public static void getChild() {

	}
	/**
	 * 가족 관계 생성(부모 => 자식)
	 * @param 주민등록번호(registNum)
	 */
	public static void createRelation(String registNum) {
		
	}
}
