package service;

import java.util.List;

import dao.RankDao;
import dao.RankDaoImpl;
import dto.RankDto;
import exception.SearchNotFoundException;

public class RankServiceImpl implements RankService {

	private static RankService instance = new RankServiceImpl();
	
	private RankDao rankDao = RankDaoImpl.getInstance();
	
	private RankServiceImpl() {}
	public static RankService getInstance() {
		return instance;
	}
	
	@Override
	public List<RankDto> countLike(String date) throws SearchNotFoundException{
		List<RankDto> rankList = rankDao.countLike(date);
		if(rankList.size()==0) {
			throw new SearchNotFoundException("조회할 데이터가 없습니다.");
		}
		return rankList;
	}

	@Override
	public List<RankDto> getMonthRank(String date, int type) throws SearchNotFoundException{
		List<RankDto> rankList = rankDao.getMonthRank(date,type);
		if(rankList.size()==0) {
			throw new SearchNotFoundException("조회할 데이터가 없습니다.");
		}
		return rankList;
	}
	
	@Override
	public List<RankDto> getWeekRank(String date, int type) {
		List<RankDto> rankList = rankDao.getWeekRank(date,type);
		if(rankList.size()==0) {
			throw new SearchNotFoundException("조회할 데이터가 없습니다.");
		}
		return rankList;
	}
	/*@Override
	public List<RankDto> rankSort(List<RankDto> rankList) {
		// TODO Auto-generated method stub
		return null;
	}*/

}
