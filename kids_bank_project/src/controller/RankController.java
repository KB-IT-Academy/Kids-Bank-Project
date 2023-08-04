package controller;

import java.util.List;

import dto.RankDto;
import exception.SearchNotFoundException;
import service.RankService;
import service.RankServiceImpl;
import view.FailView;
import view.SuccessView;

public class RankController {

	private static RankService rankService = RankServiceImpl.getInstance();

	/**
	 * 현재 시스템 달의 좋아요 개수 세기
	 * 
	 * @param currentMonth 현재 달
	 */
	public static void countLike(String currentMonth) {
		try {
			List<RankDto> rankList = rankService.countLike(currentMonth);
			SuccessView.printLikeRank(rankList);
		} catch (SearchNotFoundException e) {
			// e.printStackTrace();
			FailView.errorMessage(e.getMessage());
		}
	}

	/**
	 * 한달 랭킹을 조회하는 메서드
	 * 
	 * @param date: 현재 날짜
	 * @param type  : 1.지출 2. 수입
	 */
	public static void getMonthRank(String date, int type) {
		try {
			List<RankDto> rankList = rankService.getMonthRank(date, type);
			SuccessView.printRank(rankList);
		} catch (SearchNotFoundException e) {
			// e.printStackTrace();
			FailView.errorMessage(e.getMessage());
		}
	}

	/**
	 * 일주일 랭킹을 조회하는 메서드
	 * 
	 * @param date: 현재 날짜
	 * @param type  : 1.지출 2. 수입
	 */
	public static void getWeekRank(String date, int type) {
		try {
			List<RankDto> rankList = rankService.getWeekRank(date, type);
			SuccessView.printRank(rankList);
		} catch (SearchNotFoundException e) {
			// e.printStackTrace();
			FailView.errorMessage(e.getMessage());
		}
	}
}
