package controller;

import java.util.List;

import dto.MoneyBookDto;
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
		moneyBookService.updateMoneyBook(dto);
	}
	
	/**
	 * 자신의 전체 기입장을 삭제하는 메서드
	 */
	public static void deleteAllMoneyBook() {
		moneyBookService.deleteAllMoneyBook();
	}
	
	/**
	 * rownum을 활용하여 기입장을 삭제하는 메서드(rownum으로 고유번호 확인)
	 * @param 기입장 row number 
	 */
	public static void deleteMoneyBook(int rownum) {
		moneyBookService.deleteMoneyBook(rownum);
	}
	
	/**
	 * 작성한 전체 기입장을 조회하는 메서드
	 */
	public static void getAllMoneyBook() {
		 List<MoneyBookDto> list = moneyBookService.getAllMoneyBook();
	}
	
	/**
	 * 지정한 날짜의 기입장 조회하는 메서드
	 * @param 날짜 조회 => 입력 값 "2023-08-03"
	 */
	public static void getDayMoneyBook(String date) {
		List<MoneyBookDto> list = moneyBookService.getDayMoneyBook(date);
	}
	
	/**
	 * 기입장 한달 분을 조회하는 메서드
	 * @param 한달 조회 => 입력 값 "2023-08"
	 */
	public static void getMonthMoneyBook(String date) {
		List<MoneyBookDto> list = moneyBookService.getMonthMoneyBook(date);
	}
	
	/**
	 * 최근 5개의 기입장을 조회하는 메서드
	 * @return
	 */
	public static void getRecentMoneyBook() {
		List<MoneyBookDto> list = moneyBookService.getRecentMoneyBook();
	}
	
}	