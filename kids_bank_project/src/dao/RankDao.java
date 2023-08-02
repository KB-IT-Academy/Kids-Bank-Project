package dao;

import dto.RankDto;

public interface RankDao {
	/**
	 * 일주일 랭킹을 조회하는 메서드
	 * @param (type : true : 지출 많은 순, false : 수입 많은 순), date : 현재 날짜
	 */
	RankDto getWeekRank(boolean type, String date);
	
	
	/**
	 * 한달 랭킹을 조회하는 메서드
	 * * @param (type : true : 지출 많은 순, false : 수입 많은 순), date : 현재 날짜
	 */
	RankDto getMonthRank(boolean type, String date);
}
