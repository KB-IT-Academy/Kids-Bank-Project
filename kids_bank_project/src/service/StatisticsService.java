package service;

import dto.StatisticsDto;

public interface StatisticsService {

	/**
	 * 하루 통계를 가져오는 메서드
	 * @param 현재 날짜 
	 * @return StatisticsDto => 안에 카테고리Dto도 있어서 둘다 채워주기.
	 */
	StatisticsDto getDateAmountInfo(String date);
	
	
	/**
	 * 주간 통계를 가져오는 메서드
	 * @param 현재 날짜
	 * @return StatisticsDto => 안에 카테고리Dto도 있어서 둘다 채워주기. 
	 */
	StatisticsDto getWeekAmountInfo(String date);
	
	/**
	 * 월간 통계를 가져오는 메서드
	 * @param 현재 날짜 
	 * @return StatisticsDto => 안에 카테고리Dto도 있어서 둘다 채워주기.
	 */
	StatisticsDto getMonthAmountInfo(String date); 
	
	
	/**
	 * 1년 통계를 가져오는 메서드
	 * @param 현재 날짜 
	 * @return StatisticsDto => 안에 카테고리Dto도 있어서 둘다 채워주기.
	 */
	StatisticsDto getYearAmountInfo(String date);

	
}
