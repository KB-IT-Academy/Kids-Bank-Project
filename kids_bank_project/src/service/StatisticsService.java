package service;

import dto.StatisticsDto;

public interface StatisticsService {

	/**
	 * 하루 통계
	 */
	StatisticsDto getDateAmountInfo(String date);
	
	
	/**
	 * 주간 통계
	 */
	StatisticsDto getWeekAmountInfo(String date);
	
	/**
	 * 월간 통계
	 */
	StatisticsDto getMonthAmountInfo(String date); 
	
	
	/**
	 * 1년 통계
	 */
	StatisticsDto getYearAmountInfo(String date);

	
}
