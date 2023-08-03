package view.childView;

import java.util.Scanner;

import view.StartView;

/**
 * 아이 회원 View
 */
public class ChildStartView {
	static Scanner sc = new Scanner(System.in);

	public ChildStartView() {
	}

	/**
	 * 시작 화면 출력하는 메소드
	 */
	static public void printChildStart() {

		int flag = 1;
		while (flag == 1) {
			System.out.println();
			System.out.println("==============================================================================================");
			System.out.println("                                         <아이 회원>                                             ");
			System.out.println("                               1.로그인                   2.회원가입							      ");
			System.out.println("----------------------------------------------------------------------------------------------");
			System.out.println("메인 메뉴로 돌아가려면 q를 입력해주세요.");
			System.out.print("메뉴선택 >> ");

			String menu = sc.nextLine();
			switch (menu) {
			case "1":
				printLogin();
				break;
			case "2":
				printJoin();
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
	 * 회원가입 화면을 출력하는 메소드
	 */
	public static void printJoin() {
		System.out.println();
		System.out.println(
				"----------------------------------------아이 회원가입---------------------------------------------");

		System.out.print("ID 입력 : ");
		String id = sc.nextLine();
		System.out.print("PW 입력 : ");
		String password = sc.nextLine();
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		System.out.print("주민등록번호 입력(-포함) : ");
		String registrationNumber = sc.nextLine();

		if (true) { // 4가지 항목 모두 제대로 입력한 경우 -> 메소드 추가하기
			System.out.println();
			System.out.println("아이 회원가입 성공!");
		} else { // 4가지 항목 제대로 입력하지 않은 경우
			System.out.println();
			System.out.println("정보를 다시 입력하세요.");
			// 예외처리 추가
		}
	}

	/**
	 * 로그인 화면을 출력하는 메소드
	 */
	public static void printLogin() {
		
		System.out.println();
		System.out.println(
				"**********************************************************************************************");
		System.out.println(
				"                                    *  아이 로그인  *                                            ");
		System.out.println();
		System.out.print("                                     ID : ");
		String id = sc.nextLine();
		System.out.print("                                     PW : ");
		String password = sc.nextLine();

		if (true) {
			System.out.println();
			System.out.println("                                         로그인 성공!");
			System.out.println();

			printMainMenu();
		} else {
			System.out.println("아이디, 비밀번호를 다시 확인해주세요.");
		}
	}

	/**
	 * 메인 메뉴 화면 출력하는 메소드
	 */
	public static void printMainMenu() {
		
		while (true) {
			System.out.println();
			System.out.println(
					"**********************************************************************************************");
			System.out
					.println("              1. 기입장     2. 통계 조회     3. 랭킹 조회    4. 마이페이지    5. 로그아웃                  ");
			System.out.println(
					"----------------------------------------------------------------------------------------------");
			System.out.print("메뉴선택 >> ");

			String menu = sc.nextLine();
			switch (menu) {
			case "1":
				MoneyBookView.printMoneyBookMenu();
				break;
			case "2":
				StatisticsView.printStatisticsMenu();
				break;
			case "3":
				RankView.printRankView();
				break;
			case "4":
				MyPageView.printMyPageMenu();
				break;
			case "5":
				System.out.println("로그아웃 되었습니다.");
				StartView.printMain();
				break;
			default:
				System.out.println("화면에 보이는 메뉴 번호를 입력해주세요.");
			}
		}
		
	}
}
