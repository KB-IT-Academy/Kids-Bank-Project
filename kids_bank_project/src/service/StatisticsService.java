package service;

import dto.StatisticsDto;

public interface StatisticsService {

	/**
	 * 하루 통계
	 */
	public StatisticsDto getDateAmountInfo(String date);
	
	
	/**
	 * 주간 통계
	 */
	public StatisticsDto getWeekAmountInfo(String date);
	
	/**
	 * 월간 통계
	 */
	public StatisticsDto getMonthAmountInfo(String date); 
	
	
	/**
	 * 1년 통계
	 */
	public StatisticsDto getYearAmountInfo(String date);

	
}
