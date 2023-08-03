package service;

import dto.RankDto;

public interface RankService {

	
	/**
	 * 일주일 랭킹
	 */
	public RankDto getWeekRank(boolean type, String date);
	
	
	/**
	 * 한달 랭킹
	 */
	public RankDto getMonthRank(boolean type, String date);
	
	
	/**
	 * 달 별 좋아요 개수 카운팅
	 */
	public int getLikeCount();
	
	/**
	 * 좋아요 개수에 따라 랭킹
	 */
	public RankDto rankChildByLike();
		
	/**
	 * 상위 소비자 선별
	 */
	public RankDto getLowerSpenders();
	
	/**
	 * 하위 소비자 선별
	 */
	public RankDto getTopSpenders();
}
