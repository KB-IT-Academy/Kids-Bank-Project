package service;

import dao.StatisticsDao;
import dao.StatisticsDaoImpl;
import dto.StatisticsDto;
import exception.SearchNotFoundException;

public class StatisticsServiceImpl implements StatisticsService{
	private static StatisticsService instance = new StatisticsServiceImpl();
	
	private StatisticsDao statisticsDao = StatisticsDaoImpl.getInstance();
	
	private StatisticsServiceImpl() {}
	
	public static StatisticsService getInstance() {
		return instance;
	}

	@Override
	public StatisticsDto getWeekAmountInfo(int num, String date) throws SearchNotFoundException{
		StatisticsDto statistics = statisticsDao.getWeekAmountInfo(num, date);
		return statistics;
	}

	@Override
	public StatisticsDto getMonthAmountInfo(int num, int month) throws SearchNotFoundException{
		StatisticsDto statistics = statisticsDao.getMonthAmountInfo(num, month);
		return statistics;
	}

	@Override
	public StatisticsDto getYearAmountInfo(int num, int year) throws SearchNotFoundException{
		StatisticsDto statistics = statisticsDao.getYearAmountInfo(num, year);
		return statistics;
	}

	@Override
	public StatisticsDto getRangeAmountInfo(int num, String startDate, String endDate) throws SearchNotFoundException{
		StatisticsDto statistics = statisticsDao.getRangeAmountInfo(num, startDate, endDate);
		return statistics;
	}
}
