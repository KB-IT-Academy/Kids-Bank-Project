package view;

import java.util.List;

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
	 */
	public static void printRank() {
		//DTO에 랭킹을 통해 닉네임을 출력해주기 때문에 좋아요, 지출랭킹 프린트를 같이 쓸 수 있음

		System.out.println();
		System.out.println("----------------------------------------------------------------------------------------------");

		int[] values = { 1, 6, 11, 2, 7, 12, 3, 8, 13, 4, 9, 14, 5, 10, 15 }; // 실제로는 닉네임값 순서 { 1, 6, 11, 2, 7, 12, 3, 8, 13, 4, 9, 14, 5, 10, 15 };
		int maxValue = 20; // 닉네임 값 길이를 지정해줘야함! -> 이게 칸 넓이
		int interval = 3; // 세로선의 간격

		for (int i = 0; i < values.length; i++) {
			int padding = maxValue - String.valueOf(values[i]).length();// 글자수에 따른 공백
			System.out.print(values[i]);

			// 간격에 맞게 출력
			for (int j = 0; j < padding; j++) {
				System.out.print(" ");
			}

			if ((i + 1) % interval == 0 || i == values.length - 1) {
				System.out.println("|");
			} else {
				System.out.print("|");
			}
		}

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
