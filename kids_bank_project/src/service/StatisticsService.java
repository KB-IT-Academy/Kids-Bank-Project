package service;

import dto.StatisticsDto;
import exception.SearchNotFoundException;

public interface StatisticsService {	
	
	/**
	 * 주간 통계를 가져오는 메서드
	 * @param 현재 날짜
	 * @return StatisticsDto => 안에 카테고리Dto도 있어서 둘다 채워주기. 
	 */
	StatisticsDto getWeekAmountInfo(int num, String date) throws SearchNotFoundException;
	
	/**
	 * 월간 통계를 가져오는 메서드
	 * @param 현재 날짜 
	 * @return StatisticsDto => 안에 카테고리Dto도 있어서 둘다 채워주기.
	 */
	StatisticsDto getMonthAmountInfo(int num, int month) throws SearchNotFoundException; 
	
	
	/**
	 * 1년 통계를 가져오는 메서드
	 * @param 현재 날짜 
	 * @return StatisticsDto => 안에 카테고리Dto도 있어서 둘다 채워주기.
	 */
	StatisticsDto getYearAmountInfo(int num, int year) throws SearchNotFoundException;

	/**
	 * 기간 통계를 가져오는 메서드
	 * @param 현재 날짜 
	 * @return StatisticsDto => 안에 카테고리Dto도 있어서 둘다 채워주기.
	 */
	StatisticsDto getRangeAmountInfo(int num, String startDate, String endDate) throws SearchNotFoundException;
}
