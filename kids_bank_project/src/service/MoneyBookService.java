package service;

import java.util.List;

import dto.MoneyBookDto;

public interface MoneyBookService {
	/**
	 * 기입장 생성하는 메서드
	 * @param MoneyBookdto
	 * @return total_amount(잔액)
	 */
	int createMoneyBook(MoneyBookDto dto);
	
	/**
	 * 기입장을 수정하는 메서드
	 * @param MoneyBookDto
	 */
	void updateMoneyBook(MoneyBookDto dto);
	
	/**
	 * 자신의 전체 기입장을 삭제하는 메서드
	 */
	void deleteAllMoneyBook();
	
	/**
	 * 단일 기입장을 삭제하는 메서드
	 * @param num
	 */
	void deleteMoneyBook(int rownum);
	
	/**
	 * 작성한 전체 기입장을 조회하는 메서드
	 * @return
	 */
	List<MoneyBookDto> getAllMoneyBook();
	
	/**
	 * 지정한 날짜의 기입장 조회하는 메서드
	 * @param date
	 * @return
	 */
	List<MoneyBookDto> getDayMoneyBook(String date);
	
	/**
	 * 한 달치 기입장 조회하는 메서드
	 * @param date
	 * @return
	 */
	List<MoneyBookDto> getMonthMoneyBook(String date);
	
	/**
	 * 최근 5개의 기입장을 조회하는 메서드
	 * @return
	 */
	List<MoneyBookDto> getRecentMoneyBook();
}
