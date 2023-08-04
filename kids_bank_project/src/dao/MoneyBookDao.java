package dao;

import java.util.List;

import dto.MoneyBookDto;
import dto.UserDto;

public interface MoneyBookDao {
	/**
	 * 기입장 생성하는 메서드
	 * @param MoneyBookdto
	 * @return total_amount(잔액)
	 */
	public int createMoneyBook(int childNum, MoneyBookDto dto);
	
	/**
	 * 기입장을 수정하는 메서드
	 * @param MoneyBookDto
	 */
	public int updateMoneyBook(int type, int childNum, MoneyBookDto dto);
	
	/**
	 * 자신의 전체 기입장을 삭제하는 메서드
	 */
	public int deleteAllMoneyBook(int childNum);
	
	/**
	 * rownum을 활용하여 기입장을 삭제하는 메서드(rownum으로 고유번호 확인)
	 * @param 기입장 row number 
	 */
	public int deleteMoneyBook(String date, int childNum, int rownum);
	
	/**
	 * 작성한 전체 기입장을 조회하는 메서드
	 * @return
	 */
	public List<MoneyBookDto> getAllMoneyBook(int childNum);
	
	/**
	 * 지정한 날짜의 기입장 조회하는 메서드
	 * @param 날짜 조회 => 입력 값 "2023-08-03"
	 * @return
	 */
	public List<MoneyBookDto> getDayMoneyBook(int childNum, String date);
	
	/**
	 * 기입장 한달 분을 조회하는 메서드
	 * @param 한달 조회 => 입력 값 "2023-08"
	 * @return
	 */
	public List<MoneyBookDto> getMonthMoneyBook(int childNum, String date);
	
	/**
	 * 최근 5개의 기입장을 조회하는 메서드
	 * @return
	 */
	public List<MoneyBookDto> getRecentMoneyBook(int childNum);

}
