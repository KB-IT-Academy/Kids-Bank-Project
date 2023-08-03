package view;

import java.util.List;

import dto.RankDto;

public class SuccessView {
	
	public SuccessView() {}
	
	/**
	 * 등록된 자식들 출력창
	 */
	public static void printChilds() {
		
	}
	/**
	 * 등록된 부모들 출력창
	 */
	public static void printParents() {
		
	}
	/**
	 * 하루 날짜에 대한 출력창
	 */
	public static void printDayMoneyBook() {
		
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
            System.out.println(dto + " ");
        }
		System.out.println();

	}
	/**
	 * 날짜에 대한 댓글들 출력
	 */
	public static void printComments() {
		// TODO Auto-generated method stub
		
	}
}
