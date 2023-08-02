package view;

import java.util.Scanner;

public class ChildMenuView_백미수 {

	Scanner sc = new Scanner(System.in);
	// ElectronicsController controller = new ElectronicsController(); // 전역변수 초기화,
	// 생성자 호출

	/**
	 * 전체 메뉴를 출력하는 메소드
	 */
	public void printMenu() {

		boolean b = true;
		while (b) {
			System.out.println("----------------------------------------------------------------------------------");
			System.out.println("1. 조회    2. 기입장 작성     3. 통계 조회     4. 랭킹 조회   5. 마이페이지    6. 로그아웃(누르면 부모 메뉴로 넘어감)");
			System.out.println("----------------------------------------------------------------------------------");
			System.out.print("메뉴선택 > ");

			String menu = sc.nextLine();
			switch (menu) {
			case "1":
				// controller.selectAll();
				break;
			case "2":
				// this.inputSearch();
				break;
			case "3":
				// this.inputInsert();
				break;
			case "4":
				this.inputRankType();
				break;
			case "5":
				// this.inputDelete();
				break;
			case "6":
				// System.exit(0);
				b = false;
				break;
			default:
				System.out.println("메뉴를 다시 선택해주세요!!!!");

			}// switch문끝

		} // while문끝

	}// 메소드끝

	/**
	 * 랭킹 타입 선택 키보드 입력을 처리하는 메소드
	 */
	public void inputRankType() {

		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("1. 지출 랭킹    2. 좋아요 랭킹	");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.print("메뉴선택 > ");

		String menu = sc.nextLine();
		switch (menu) {
		case "1":
			this.inputPeriod();
			break;
		case "2":
			// 사용자 있는지 확인
			// 좋아요 count 메소드 실행
			this.printRank();
			break;
		default:
			System.out.println("메뉴를 다시 선택해주세요!!!!");
			this.inputRankType();

		}
	}
	/**
	 * 랭킹 기간 선택 키보드 입력을 처리하는 메소드
	 */
	public void inputPeriod() {

		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("1. 이번 달 랭킹    2. 최근 7일 랭킹");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.print("메뉴선택 > ");

		String menu = sc.nextLine();
		switch (menu) {
		case "1":
			// 한달 지출 계산 메소드 부르기
			this.inputRowRank();
			break;
		case "2":
			// 일주일 지출 계산 메소드 부르기
			this.inputRowRank();
			break;
		default:
			System.out.println("메뉴를 다시 선택해주세요!!!!");
			this.inputPeriod();

		}
	}
	/**
	 * 랭킹 sort 선택 키보드 입력을 처리하는 메소드
	 */
	public void inputRowRank() {

		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("1. 소비왕 랭킹    2. 절약왕 랭킹");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.print("메뉴선택 > ");

		String menu = sc.nextLine();
		switch (menu) {
		case "1":
			// 사용자 있는지 확인
			// sort 메소드
			this.printRank();
			break;
		case "2":
			// 사용자 있는지 확인
			// sort 메소드
			this.printRank();
			break;
		default:
			System.out.println("메뉴를 다시 선택해주세요!!!!");
			this.inputRowRank();

		}
	}
	/**
	 * 랭킹 출력창
	 */
	public void printRank() {
		//DTO에 랭킹을 통해 닉네임을 출력해주기 때문에 좋아요, 지출랭킹 프린트를 같이 쓸 수 있음

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
	public void returnMenu() {
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("메뉴창으로 돌아가시겠습니까? (YES: 메뉴창, NO: 랭킹창)");
		System.out.println("----------------------------------------------------------------------------------");

		String menu = sc.nextLine();
		String menu_upper = menu.toUpperCase();
		switch (menu_upper) {
		case "YES":
			// 사용자 있는지 확인
			// sort 메소드
			this.printMenu();
			break;
		case "NO":
			// 사용자 있는지 확인
			// sort 메소드
			this.inputRankType();
			break;
		default:
			System.out.println("Yes or No 로 입력하세요!!");
			this.returnMenu();
		}

	}

}
