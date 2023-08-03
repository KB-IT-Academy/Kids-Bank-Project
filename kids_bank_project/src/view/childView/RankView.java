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
		
		int flag = 1;
		while (flag == 1) {
			System.out.println();
			System.out.println("----------------------------------------------------------------------------------------------");
			System.out.println("                                       랭         킹                                     ");
			System.out.println("----------------------------------------------------------------------------------------------");
			
			System.out.println();
			System.out.println("**********************************************************************************************");
			System.out.println("                             1. 지출 랭킹                  2. 좋아요 랭킹                          ");
			System.out.println("----------------------------------------------------------------------------------------------");
			System.out.println("메인 메뉴로 돌아가려면 q를 입력해주세요.");
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
			case "q":
				flag = 0;
				return;
			default:
				System.out.println("화면에 보이는 메뉴 번호를 입력해주세요.");
	
			}
		}
	}
	/**
	 * 랭킹 기간 선택 키보드 입력을 처리하는 메소드
	 */
	public static void inputPeriod() {

		int flag = 1;
		while (flag == 1) {
			System.out.println();
			System.out.println("----------------------------------------------------------------------------------------------");
			System.out.println("1. 이번 달 랭킹    2. 최근 7일 랭킹");
			System.out.println("랭킹 메뉴로 돌아가려면 q를 입력해주세요.");
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
			case "q":
				flag = 0;
				return;
			default:
				System.out.println("화면에 보이는 메뉴 번호를 입력해주세요.");
	
			}
		}
	}
	/**
	 * 랭킹 sort 선택 키보드 입력을 처리하는 메소드
	 */
	public static void inputRowRank() {
		
		int flag = 1;
		while (flag == 1) {
			System.out.println();
			System.out.println("----------------------------------------------------------------------------------------------");
			System.out.println("1. 소비왕 랭킹    2. 절약왕 랭킹");
			System.out.println("이전 메뉴로 돌아가려면 q를 입력해주세요.");
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
			case "q":
				flag = 0;
				return;
			default:
				System.out.println("화면에 보이는 메뉴 번호를 입력해주세요.");
			}
		}
	}

}
