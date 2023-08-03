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
	 * 모든 자식 회원 조회하는 메서드
	 */
	public static void childFindAll() {
		List<ChildDto> list = myPageService.childFindAll();
		System.out.println(list);
	}
	
	/**
	 * 자식 고유 번호로 회원 조회하는 메서드
	 * @param num 자식 고유 번호
	 */
	public static void childFindByNumber(int num) {
		ChildDto dto = myPageService.childFindByNumber(num);
		System.out.println(dto);
	}
	
	/**
	 * 자식 회원 탈퇴하는 메서드
	 */
	public static void childDelete() {
		int result = myPageService.childDelete();
		System.out.println(result);
	}
	
	/**
	 * 모든 부모 회원 조회하는 메서드
	 */
	public static void parentFindAll() {
		List<ParentDto> list = myPageService.parentFindAll();
		System.out.println(list);
	}
	
	/**
	 * 부모 고유 번호로 회원 조회하는 메서드
	 * @param 부모 고유 번호
	 */
	public static void parentFindByNumber(int num) {
		ParentDto dto = myPageService.parentFindByNumber(num);
		System.out.println(dto);
	}
	
	/**
	 * 부모 회원 탈퇴하는 메서드 
	 */
	public static void parentDelete() {
		int result = myPageService.parentDelete();
		System.out.println(result);
	}
	
	/**
	 * 연결된 부모 확인하는 메서드
	 */
	public static void getParent() {
		List<UserDto> list = myPageService.getParent();
		System.out.println(list);
	}
	
	/**
	 * 연결된 자식 확인하는 메서드
	 */
	public static void getChild() {
		List<UserDto> list = myPageService.getChild();
		System.out.println(list);
	}
	/**
	 * 가족 관계 생성(부모 => 자식)
	 * @param 주민등록번호(registNum)
	 * @param 자식 순서(첫째인지 둘째인지)
	 */
	public static void createRelation(String registNum, int order) {
		int result = myPageService.createRelation(registNum, order);
		System.out.println(result);
	}
}
