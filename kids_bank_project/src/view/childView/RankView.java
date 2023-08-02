package view.childView;

import java.util.Scanner;

public class RankView {

	static Scanner sc = new Scanner(System.in);
	
	public RankView() {}
	
	/**
	 * 랭킹 타입 선택 키보드 입력을 처리하는 메소드
	 */
	public static void printRankView() {
		
		System.out.println();
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println("                                       랭         킹                                     ");
		System.out.println("----------------------------------------------------------------------------------------------");
		
		System.out.println();
		System.out.println("**********************************************************************************************");
		System.out.println("                             1. 지출 랭킹                  2. 좋아요 랭킹                          ");
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.print("메뉴선택 >> ");

		String type = sc.nextLine();
		switch (type) {
		case "1":
			inputPeriod();
			break;
		case "2":
			// 사용자 있는지 확인
			// 좋아요 count 메소드 실행
		    printRank();
			break;
		default:
			System.out.println("화면에 보이는 메뉴 번호를 입력해주세요.");

		}
	}
	/**
	 * 랭킹 기간 선택 키보드 입력을 처리하는 메소드
	 */
	public static void inputPeriod() {

		System.out.println();
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("1. 이번 달 랭킹    2. 최근 7일 랭킹");
		System.out.print("메뉴선택 >> ");

		String menu = sc.nextLine();
		switch (menu) {
		case "1":
			// 한달 지출 계산 메소드 부르기
			inputRowRank();
			break;
		case "2":
			// 일주일 지출 계산 메소드 부르기
			inputRowRank();
			break;
		default:
			System.out.println("화면에 보이는 메뉴 번호를 입력해주세요.");
			inputPeriod();

		}
	}
	/**
	 * 랭킹 sort 선택 키보드 입력을 처리하는 메소드
	 */
	public static void inputRowRank() {
		System.out.println();
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("1. 소비왕 랭킹    2. 절약왕 랭킹");
		System.out.print("메뉴선택 >> ");

		String menu = sc.nextLine();
		switch (menu) {
		case "1":
			// 사용자 있는지 확인
			// sort 메소드
			printRank();
			break;
		case "2":
			// 사용자 있는지 확인
			// sort 메소드
			printRank();
			break;
		default:
			System.out.println("화면에 보이는 메뉴 번호를 입력해주세요.");
			inputRowRank();
		}
	}
	/**
	 * 랭킹 출력창
	 */
	public static void printRank() {
		//DTO에 랭킹을 통해 닉네임을 출력해주기 때문에 좋아요, 지출랭킹 프린트를 같이 쓸 수 있음

		System.out.println();
		System.out.println("----------------------------------------------------------------------------------");

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

		returnMenu();

	}
	
	/**
	 * 랭킹창 or 메뉴창 선택 메소드
	 */
	public static void returnMenu() {
		System.out.println();
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("메뉴창으로 돌아가시겠습니까? (YES: 메뉴창, NO: 랭킹창)");
		
		String menu = sc.nextLine();
		String menu_upper = menu.toUpperCase();
		switch (menu_upper) {
		case "YES":
			return;
		case "NO":
			printRankView();
			break;
		default:
			System.out.println("Yes or No 로 입력해주세요.");
			returnMenu();
		}

	}


}
