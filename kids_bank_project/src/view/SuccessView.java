package view;

import java.util.List;


import dto.RankDto;
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
	public static List<UserDto> printChilds(List<UserDto> list) {
		for (int i = 0; i<list.size(); i++) {
			System.out.println(i+1 + ". " + list.get(i).getName());
		}
		return list;
		
	}
	/**
	 * 등록된 부모들 출력창
	 */
	public static void printParents(List<UserDto> list) {
		for (UserDto dto : list) {
			System.out.println(dto);
		}
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
	
	public static void moneyBookSelectPrint(List<MoneyBookDto> list) {
		for(MoneyBookDto dto : list) {
			System.out.println(dto);//board.toString()호출
		}
		
	}

	public static void messagePrint(String message) {
		System.out.println(message);
		
	}
}
