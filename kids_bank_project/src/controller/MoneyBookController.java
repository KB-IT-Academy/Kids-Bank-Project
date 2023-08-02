package controller;

import java.util.List;

import dto.MoneyBookDto;

public class MoneyBookController{
	/**
	 * 기입장 생성
	 * @param MoneyBookDto
	 * @return int amount(잔액)
	 */
	public int createMoneyBook(MoneyBookDto dto) {
		
		return 0; 
	}
	
	/**
	 * 기입장 수정
	 * @param MoneyBookDto
	 */
	public void updateMoneyBook(MoneyBookDto dto) {
		
	}
	
	/**
	 * 기입장 전체 삭제
	 */
	public void deleteAllMoneyBook() {
		
	}
	
	/**
	 * 기입장 일부 삭제
	 * @param 기입장 고유 번호
	 */
	public void deleteMoneyBook(int num) {
		
	}
	
	/**
	 * 기입장 전체 조회
	 */
	public List<MoneyBookDto> getAllMoneyBook() {
		
		return null;
	}
	
	/**
	 * 기입장 하루 조회
	 * @param 날짜 조회
	 */
	public List<MoneyBookDto> getDayMoneyBook(String date) {
		
		return null;
	}
	
	/**
	 * 기입장 한달 조회
	 * @param 한달 조회 => 입력 값 "2023-08"로 할지 정해야함
	 */
	public List<MoneyBookDto> getMonthMoneyBook(String date) {
	
		return null;
	}
	
	/**
	 * 기입장 최근 5개 조회
	 * @return
	 */
	public List<MoneyBookDto> getRecentMoneyBook() {
		
		return null;
	}
	
}	