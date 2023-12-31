package dao;

import java.util.List;

import dto.RankDto;
import exception.SearchNotFoundException;

public interface RankDao {
	
	/**
	 * 한달 동안의 좋아요 개수 세기
	 * @return
	 */
	List<RankDto> countLike(String date) throws SearchNotFoundException;
	
	/**
	 * 한달 랭킹을 조회하는 메서드
	 * @param (type : 1 : 지출 많은 순, 2 : 수입 많은 순)
	 * @param date : 현재 날짜
	 */
	List<RankDto> getMonthRank(String date, int type) throws SearchNotFoundException;
	
	/**
	 * 일주일 랭킹을 조회하는 메서드
	 * @param (type : 1 : 지출 많은 순, 2 : 수입 많은 순)
	 * @param date : 현재 날짜
	 */
	List<RankDto> getWeekRank(String date, int type) throws SearchNotFoundException;
	
	/**
	 * sort 하는 메서드 => DTO에서 리스트 sort로 변경
	 */
	//List<RankDto> rankSort(List<RankDto> rankList);
}
