package service;

import dto.RankDto;

public interface RankService {

	
	/**
	 * 일주일 랭킹
	 */
	RankDto getWeekRank(boolean type, String date);
	
	
	/**
	 * 한달 랭킹
	 */
	RankDto getMonthRank(boolean type, String date);
}
