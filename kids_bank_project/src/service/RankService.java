package service;

import java.util.List;
import dto.RankDto;
import exception.SearchNotFoundException;

public interface RankService {

	/**
	 * 달 별 좋아요 개수 카운팅
	 */
	List<RankDto> countLike(String date) throws SearchNotFoundException;

	/**
	 * 한달 랭킹을 조회하는 메서드 
	 * 날짜
	 */
	List<RankDto> getMonthRank(String date, int type) throws SearchNotFoundException;

	/**
	 * 일주일 랭킹을 조회하는 메서드
	 * 
	 * @param
	 */
	List<RankDto> getWeekRank(String date, int type) throws SearchNotFoundException;

	/**
	 * sort 하는 메서드
	 */
	//List<RankDto> rankSort(List<RankDto> rankList);


}