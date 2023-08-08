package controller;
 
import dto.StatisticsDto;

import exception.SearchNotFoundException;
import service.StatisticsService; 
import view.FailView;
import view.SuccessView;
import service.StatisticsServiceImpl;

public class StatisticsController {
	
	private static StatisticsService statisticsService = StatisticsServiceImpl.getInstance();
	
	/**
	 * 주간 통계를 가져오는 메서드
	 * @param 현재 날짜 
	 */
	public static void getWeekAmountInfo(int num, String date) {
		try {
			StatisticsDto statistics = statisticsService.getWeekAmountInfo(num, date);
			SuccessView.printStatistics(statistics);
		} catch (SearchNotFoundException e) {
			FailView.errorMessage(e.getMessage());
		}
	}
	
	/**
	 * 월간 통계를 가져오는 메서드
	 * @param 현재 날짜 
	 */
	public static void getMonthAmountInfo(int num, int year, int month) {
		try {
			StatisticsDto statistics = statisticsService.getMonthAmountInfo(num, year, month);
			SuccessView.printStatistics(statistics);
		} catch (SearchNotFoundException e) {
			FailView.errorMessage(e.getMessage());
		}
	}
	
	/**
	 * 1년 통계를 가져오는 메서드
	 * @param 현재 날짜 
	 */
	public static void getYearAmountInfo(int num, int year) {
		try {
			StatisticsDto statistics = statisticsService.getYearAmountInfo(num, year);
			SuccessView.printStatistics(statistics);
		} catch (SearchNotFoundException e) {
			FailView.errorMessage(e.getMessage());
		}
	}
	
	/**
	 * 기간 통계를 가져오는 메서드
	 * @param 현재 날짜 
	 */
	public static void getRangeAmountInfo(int num, String startDate, String endDate) {
		try {
			StatisticsDto statistics = statisticsService.getRangeAmountInfo(num, startDate, endDate);
			SuccessView.printStatistics(statistics);
		} catch (SearchNotFoundException e) {
			FailView.errorMessage(e.getMessage());
		}
	}
}
