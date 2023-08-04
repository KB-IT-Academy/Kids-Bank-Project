package view;

import java.util.List;


import dto.RankDto;
import dto.StatisticsDto;
import controller.MyPageController;
import dto.ChildDto;
import dto.MoneyBookDto;
import dto.ParentDto;
import dto.UserDto;
import view.childView.RankView;

public class SuccessView {
	
	public SuccessView() {}
	
	/**
	 * 등록된 자식들 출력창
	 */
	public static List<ChildDto> printChilds(List<ChildDto> list) {
		System.out.println("---------------------------------- 연결된 아이 리스트 --------------------------------------------");
		for (int i = 0; i<list.size(); i++) {
			System.out.println(i+1 + ". " + list.get(i).getName());
		}
		return list;
	}
	
	/**
	 * 자식 단일 데이터 조회
	 */
	public static void printOneChild(ChildDto dto) {
		System.out.println(dto);
	}
	
	/**
	 * 자식 부모 데이터 조회
	 */
	public static void printOneParent(ParentDto dto) {
		System.out.println(dto);
	}
	
	/**
	 * 등록된 부모들 출력창
	 */
	public static void printParents(List<ParentDto> list) {
		for (ParentDto dto : list) {
			System.out.println(dto);
		}
	}
	/**
	 * 하루 날짜에 대한 출력창
	 */
	public static void printDayMoneyBook() {
		
	}

	/**
	 * 통계 출력창
	 */
	public static void printStatistics(StatisticsDto statistics) {
		System.out.println();
		System.out.println("----------------------------------------------------------------------------------------------");
		
		System.out.println("수입 총합 : " + statistics.getInComeAmount() + "원");
		System.out.println("지출 총합 : " + statistics.getOutComeAmount() + "원");
		System.out.println();
	}
	
	/**
	 * 랭킹 출력창
	 * @param rankList 
	 */
	public static void printRank(List<RankDto> rankList) {
		//DTO에 랭킹을 통해 닉네임을 출력해주기 때문에 좋아요, 지출랭킹 프린트를 같이 쓸 수 있음

		System.out.println();
		System.out.println("----------------------------------------------------------------------------------------------");

		for (RankDto dto : rankList) {
            System.out.println(dto.toString() + " ");
        }
		System.out.println();

	}
	/**
	 * 좋아요 랭킹 출력창
	 * @param rankList 
	 */
	public static void printLikeRank(List<RankDto> rankList) {
		//DTO에 랭킹을 통해 닉네임을 출력해주기 때문에 좋아요, 지출랭킹 프린트를 같이 쓸 수 있음

		System.out.println();
		System.out.println("----------------------------------------------------------------------------------------------");

		for (RankDto dto : rankList) {
            System.out.println(dto.toString(dto.getEmojiCount()) + " ");
        }
		System.out.println();

	}
	/**
	 * 날짜에 대한 댓글들 출력
	 */
	public static void printComments() {
		// TODO Auto-generated method stub
		
	}
	
	public static void moneyBookSelectPrint(List<MoneyBookDto> list) {
		for(MoneyBookDto dto : list) {
			System.out.println(dto);//board.toString()호출
		}
		
	}

	public static void messagePrint(String message) {
		System.out.println(message);
		
	}

}
