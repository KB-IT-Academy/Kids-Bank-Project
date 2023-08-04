package dao;

import java.util.List;

import dto.MoneyBookDto;
import dto.UserDto;

public interface MoneyBookDao {

	/**
	 * 기입장 생성하는 메서드
	 * 
	 * @param MoneyBookdto 입력받은값들 저장한 dto
	 * @param childNum     자식 고유번호
	 * @return 메시지
	 */
	public int createMoneyBook(int childNum, MoneyBookDto dto);

	/**
	 * 기입장 수정하는 메서드
	 * 
	 * @param type         수정할 내역 선택 번호
	 * @param childNum     자식 고유번호
	 * @param MoneyBookDto 수정할 내역 정보
	 */
	public int updateMoneyBook(int type, int childNum, MoneyBookDto dto);

	/**
	 * 자신의 전체 기입장을 삭제하는 메서드
	 * 
	 * @param childNum 자식 고유번호
	 */
	public int deleteAllMoneyBook(int childNum);

	/**
	 * 내역 한 건 삭제하는 메서드
	 * 
	 * @param date     삭제할 날짜 -> 내역조회 가능
	 * @param childNum 자식 고유번호
	 * @param rownum   조회된 내역들 선택 번호
	 */
	public int deleteMoneyBook(String date, int childNum, int rownum);

	/**
	 * 작성한 전체 기입장을 조회하는 메서드
	 * 
	 * @param childNum 자식 고유번호
	 */
	public List<MoneyBookDto> getAllMoneyBook(int childNum);

	/**
	 * 지정한 날짜의 기입장 조회하는 메서드
	 * 
	 * @param childNum 자식 고유번호
	 * @param 날짜       조회 => 입력 값 "YYYYMMDD"
	 */
	public List<MoneyBookDto> getDayMoneyBook(int childNum, String date);

	/**
	 * 기입장 한달 분을 조회하는 메서드
	 * 
	 * @param childNum 자식 고유번호
	 * @param 한달       조회 => 입력 값 "YYYYMM
	 */
	public List<MoneyBookDto> getMonthMoneyBook(int childNum, String date);

	/**
	 * 최근 5개의 기입장을 조회하는 메서드
	 * 
	 * @param childNum 자식 고유번호
	 */
	public List<MoneyBookDto> getRecentMoneyBook(int childNum);

}
