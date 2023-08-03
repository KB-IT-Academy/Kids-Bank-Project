package service;

import java.util.List;

import dto.MoneyBookDto;
import exception.SearchNotFoundException;

public interface MoneyBookService {
	/**
	 * 기입장 생성하는 메서드
	 * @param MoneyBookdto
	 * @return total_amount(잔액)
	 */
	int createMoneyBook(MoneyBookDto dto)throws SearchNotFoundException;
	
	/**
	 * 기입장을 수정하는 메서드
	 * @param MoneyBookDto
	 */
	void updateMoneyBook(MoneyBookDto dto)throws SearchNotFoundException;
	
	/**
	 * 자신의 전체 기입장을 삭제하는 메서드
	 */
	void deleteAllMoneyBook()throws SearchNotFoundException;
	
	/**
	 * rownum을 활용하여 기입장을 삭제하는 메서드(rownum으로 고유번호 확인)
	 * @param 기입장 row number 
	 */
	void deleteMoneyBook(int rownum)throws SearchNotFoundException;
	
	/**
	 * 작성한 전체 기입장을 조회하는 메서드
	 * @return
	 */
	List<MoneyBookDto> getAllMoneyBook()throws SearchNotFoundException;
	
	/**
	 * 지정한 날짜의 기입장 조회하는 메서드
	 * @param 날짜 조회 => 입력 값 "2023-08-03"
	 * @return
	 */
	List<MoneyBookDto> getDayMoneyBook(String date)throws SearchNotFoundException;
	
	/**
	 * 기입장 한달 분을 조회하는 메서드
	 * @param 한달 조회 => 입력 값 "2023-08"
	 * @return
	 */
	List<MoneyBookDto> getMonthMoneyBook(String date)throws SearchNotFoundException;
	
	/**
	 * 최근 5개의 기입장을 조회하는 메서드
	 * @return
	 */
	List<MoneyBookDto> getRecentMoneyBook()throws SearchNotFoundException;
}
