package controller;

import java.util.List;

import dto.MoneyBookDto;
import exception.SearchNotFoundException;
import service.MoneyBookService;
import service.MoneyBookServiceImpl;
import view.FailView;
import view.SuccessView;

public class MoneyBookController{
	
	private static MoneyBookService moneyBookService = MoneyBookServiceImpl.getInstance();
	/**
	 * 기입장 생성하는 메서드
	 * @param MoneyBookdto
	 * @return total_amount(잔액)
	 */
	public static void createMoneyBook(MoneyBookDto dto) {
		moneyBookService.createMoneyBook(dto);
		
	}
	
	/**
	 * 기입장 수정하는 메서드
	 * @param MoneyBookDto
	 */
	public static void updateMoneyBook(MoneyBookDto dto) {
		try {
			moneyBookService.updateMoneyBook(dto);
			SuccessView.messagePrint("게시물 수정 성공");
		}catch(SearchNotFoundException e){
			FailView.errorMessage(e.getMessage());
			
		}
	}
	
	/**
	 * 자신의 전체 기입장을 삭제하는 메서드
	 */
	public static void deleteAllMoneyBook() {
	
		try{
			moneyBookService.deleteAllMoneyBook();
			SuccessView.messagePrint("게시물을 삭제하였습니다");
		}catch(SearchNotFoundException e) {
			FailView.errorMessage(e.getMessage());
		}
	}
	
	/**
	 * rownum을 활용하여 기입장을 삭제하는 메서드(rownum으로 고유번호 확인)
	 * @param 기입장 row number 
	 */
	public static void deleteMoneyBook(int rownum) {
		try{
			moneyBookService.deleteMoneyBook(rownum);
			SuccessView.messagePrint("게시물을 삭제하였습니다");
		}catch(SearchNotFoundException e) {
			FailView.errorMessage(e.getMessage());
		}
	}
	
	/**
	 * 작성한 전체 기입장을 조회하는 메서드
	 */
	public static void getAllMoneyBook() {
		
		 try {
			 List<MoneyBookDto> list = moneyBookService.getAllMoneyBook();
				 SuccessView.moneyBookSelectPrint(list);
			  }catch (SearchNotFoundException e) {
				  FailView.errorMessage(e.getMessage());
			  }
	}
	
	/**
	 * 지정한 날짜의 기입장 조회하는 메서드
	 * @param 날짜 조회 => 입력 값 "2023-08-03"
	 */
	public static void getDayMoneyBook(String date) {

		try {
			List<MoneyBookDto> list = moneyBookService.getDayMoneyBook(date);
			 SuccessView.moneyBookSelectPrint(list);
		  }catch (SearchNotFoundException e) {
			  FailView.errorMessage(e.getMessage());
		  }
		
	}
	
	/**
	 * 기입장 한달 분을 조회하는 메서드
	 * @param 한달 조회 => 입력 값 "2023-08"
	 */
	public static void getMonthMoneyBook(String date) {
		
		try {
			List<MoneyBookDto> list = moneyBookService.getMonthMoneyBook(date);
			 SuccessView.moneyBookSelectPrint(list);
		  }catch (SearchNotFoundException e) {
			  FailView.errorMessage(e.getMessage());
		  }
	}
	
	/**
	 * 최근 5개의 기입장을 조회하는 메서드
	 * @return
	 */
	public static void getRecentMoneyBook() {
		
		try {
			List<MoneyBookDto> list = moneyBookService.getRecentMoneyBook();
			 SuccessView.moneyBookSelectPrint(list);
		  }catch (SearchNotFoundException e) {
			  FailView.errorMessage(e.getMessage());
		  }
	}
	
}	