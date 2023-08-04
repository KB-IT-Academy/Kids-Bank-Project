package controller;

import java.util.List;

import dto.MoneyBookDto;
import exception.SearchNotFoundException;
import service.MoneyBookService;
import service.MoneyBookServiceImpl;
import view.FailView;
import view.SuccessView;

public class MoneyBookController {

	private static MoneyBookService moneyBookService = MoneyBookServiceImpl.getInstance();

	/**
	 * 기입장 생성하는 메서드
	 * 
	 * @param MoneyBookdto 입력받은값들 저장한 dto
	 * @param childNum     자식 고유번호
	 * @return 메시지
	 */
	public static void createMoneyBook(int childNum, MoneyBookDto dto) {
		moneyBookService.createMoneyBook(childNum, dto);

	}

	/**
	 * 기입장 수정하는 메서드
	 * 
	 * @param type         수정할 내역 선택 번호
	 * @param childNum     자식 고유번호
	 * @param MoneyBookDto 수정할 내역 정보
	 */
	public static void updateMoneyBook(int type, int childNum, MoneyBookDto dto) {
		try {
			moneyBookService.updateMoneyBook(type, childNum, dto);
			SuccessView.messagePrint("게시물 수정 성공");
		} catch (SearchNotFoundException e) {
			FailView.errorMessage(e.getMessage());

		}
	}

	/**
	 * 자신의 전체 기입장을 삭제하는 메서드
	 * 
	 * @param childNum 자식 고유번호
	 */
	public static void deleteAllMoneyBook(int childNum) {
	
		try{
			moneyBookService.deleteAllMoneyBook(childNum);
			SuccessView.messagePrint("게시물을 삭제하였습니다");
		}catch(SearchNotFoundException e) {
			FailView.errorMessage(e.getMessage());
		}
	}
	
	/**
	 * rownum을 활용하여 기입장을 삭제하는 메서드(rownum으로 고유번호 확인)
	 * @param 기입장 row number 
	 */
	public static void deleteAllMoneyBook(String date, int childNum, int rownum) {
		try{
			moneyBookService.deleteMoneyBook(date, childNum, rownum);
			SuccessView.messagePrint("게시물을 삭제하였습니다");
		}catch(SearchNotFoundException e) {
			FailView.errorMessage(e.getMessage());
		}
	}
	
	/**
	 * 작성한 전체 기입장을 조회하는 메서드
	 */
	public static void getAllMoneyBook(int num, int childNum) {
		
		 try {
			 List<MoneyBookDto> list = moneyBookService.getAllMoneyBook(num);
				 SuccessView.moneyBookSelectPrint(list);
			  }catch (SearchNotFoundException e) {
				  FailView.errorMessage(e.getMessage());
			  }
	}
	
	/**
	 * 지정한 날짜의 기입장 조회하는 메서드
	 * @param 날짜 조회 => 입력 값 "2023-08-03"
	 */
	public static void getDayMoneyBook(int num, int childNum, String date) {

		try {
			moneyBookService.deleteAllMoneyBook(childNum);
			SuccessView.messagePrint("게시물을 삭제하였습니다");
		} catch (SearchNotFoundException e) {
			FailView.errorMessage(e.getMessage());
		}
	}

	/**
	 * 내역 한 건 삭제하는 메서드
	 * 
	 * @param date     삭제할 날짜 -> 내역조회 가능
	 * @param childNum 자식 고유번호
	 * @param rownum   조회된 내역들 선택 번호
	 */
	public static void deleteMoneyBook(String date, int childNum, int rownum) {
		try {
			moneyBookService.deleteMoneyBook(date, childNum, rownum);
			SuccessView.messagePrint("게시물을 삭제하였습니다");
		} catch (SearchNotFoundException e) {
			FailView.errorMessage(e.getMessage());
		}
	}

	/**
	 * 작성한 전체 기입장을 조회하는 메서드
	 * 
	 * @param childNum 자식 고유번호
	 */
	public static void getAllMoneyBook(int childNum) {

		try {
			List<MoneyBookDto> list = moneyBookService.getAllMoneyBook(childNum);
			SuccessView.moneyBookSelectPrint(list);
		} catch (SearchNotFoundException e) {
			FailView.errorMessage(e.getMessage());
		}
	}

	/**
	 * 지정한 날짜의 기입장 조회하는 메서드
	 * 
	 * @param childNum 자식 고유번호
	 * @param 날짜       조회 => 입력 값 "YYYYMMDD"
	 */
	public static void getDayMoneyBook(int childNum, String date) {

		try {
			List<MoneyBookDto> list = moneyBookService.getDayMoneyBook(childNum, date);
			SuccessView.moneyBookSelectPrint(list);
		} catch (SearchNotFoundException e) {
			FailView.errorMessage(e.getMessage());
		}

	}

	/**
	 * 기입장 한달 분을 조회하는 메서드
	 * 
	 * @param childNum 자식 고유번호
	 * @param 한달       조회 => 입력 값 "YYYYMM
	 */
	public static void getMonthMoneyBook(int num, String date) {
		
		try {
			List<MoneyBookDto> list = moneyBookService.getMonthMoneyBook(num, date);
			SuccessView.moneyBookSelectPrint(list);
		} catch (SearchNotFoundException e) {
			FailView.errorMessage(e.getMessage());
		}
	}

	/**
	 * 최근 5개의 기입장을 조회하는 메서드
	 * 
	 * @param childNum 자식 고유번호
	 */
	public static void getRecentMoneyBook(int num) {
		
		try {
			List<MoneyBookDto> list = moneyBookService.getRecentMoneyBook(num);
			SuccessView.moneyBookSelectPrint(list);
		} catch (SearchNotFoundException e) {
			FailView.errorMessage(e.getMessage());
		}
	}

}