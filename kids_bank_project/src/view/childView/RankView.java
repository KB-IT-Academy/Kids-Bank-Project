package view.childView;

import java.util.Scanner;

import view.SuccessView;

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
			SuccessView.printRank();
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
		System.out.println("----------------------------------------------------------------------------------------------");
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
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println("1. 소비왕 랭킹    2. 절약왕 랭킹");
		System.out.print("메뉴선택 >> ");

		String menu = sc.nextLine();
		switch (menu) {
		case "1":
			// 사용자 있는지 확인
			// sort 메소드
			SuccessView.printRank();
			break;
		case "2":
			// 사용자 있는지 확인
			// sort 메소드
			SuccessView.printRank();
			break;
		default:
			System.out.println("화면에 보이는 메뉴 번호를 입력해주세요.");
			inputRowRank();
		}
	}
	
	/**
	 * 랭킹창 or 메뉴창 선택 메소드
	 */
	public static void returnMenu() {
		System.out.println();
		System.out.println("----------------------------------------------------------------------------------------------");
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
