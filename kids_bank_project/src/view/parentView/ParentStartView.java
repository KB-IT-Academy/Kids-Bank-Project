package view.parentView;

import java.util.Scanner;

import view.childView.ChildStartView;
import view.childView.MoneyBookView;
import view.childView.MyPageView;

public class ParentStartView {

	static Scanner sc = new Scanner(System.in);

	public ParentStartView() {
	}

	public void printParentStart() {

		System.out.println();
		System.out.println(
				"==============================================================================================");
		System.out.println("                                         <부모 회원>");
		System.out
				.println("                               1.로그인                   2.회원가입							  ");
		System.out.println(
				"----------------------------------------------------------------------------------------------");
		System.out.print("메뉴선택 >> ");

		String menu = sc.nextLine();
		switch (menu) {
		case "1":
			printLogin();
			break;
		case "2":
			printJoin();
			break;
		default:
			System.out.println("메뉴를 다시 선택해주세요!!!!");

		}
	}

	/**
	 * 회원가입(부모) 화면을 출력하는 메소드
	 */
	public static void printJoin() {

		System.out
				.println("---------------------------[Kids Bank - 어린이 용돈기입장 관리 프로그램]---------------------------------");
		System.out.println();
		System.out.println(
				"-------------------------------------* 부모 회원가입 *-----------------------------------------------");

		System.out.print("                                  아이디를 입력해주세요: ");
		String id = sc.nextLine();
		System.out.print("                                  비밀번호를 입력해주세요: ");
		String password = sc.nextLine();
		System.out.print("                                  이름을 입력해주세요: ");
		String name = sc.nextLine();
		System.out.print("                         아이찾기를 위해 아이 주민번호를 입력해주세요: ");
		String registrationNumber = sc.nextLine();

		if (true) { // 아이가 가입 되어있으면 -> 메소드 추가하기
			System.out.println();
			System.out.println("                                      아이찾기 성공!");
			System.out.println("                                      회원가입 성공!");
			printLogin(); // 로그인 화면으로 이동
		} else {
			System.out.println("            해당 아이는 가입되어있지 않습니다. 아이를 먼저 가입해주세요.");
			ChildStartView.printJoin();
		}
		// controller.insert( new Parent() );
	}

	/**
	 * 로그인 화면을 출력하는 메소드
	 */
	public static void printLogin() {

		System.out.println();
		System.out.println(
				"**********************************************************************************************");
		System.out.println(
				"                                        *  로그인  *                                                  ");
		System.out.println();
		System.out.print("                                     ID: ");
		String id = sc.nextLine();
		System.out.print("                                     PW: ");
		String password = sc.nextLine();

		if (true) {
			System.out.println();
			System.out.println("                                         로그인 성공!");
			System.out.println();

			printSelectChild();

		} else {
			System.out.println("아이디, 비밀번호를 다시 확인해주세요.");
		}
	}

	public static void printSelectChild() {

		boolean b = true;
		while (b) {
			System.out.println();
			System.out.println(
					"**********************************************************************************************");
			System.out.println("         1. 자녀1     2. 자녀2   ");
			System.out.println(
					"----------------------------------------------------------------------------------------------");
			System.out.print("자녀선택(자녀를 추가하고 싶으시면 +를 입력하세요) >> ");

			String choice = sc.nextLine();

			if (choice == "+") {
				// 자녀 추가
			} else {
				// 자녀 번호 입력하면
				int childOrder = Integer.parseInt(choice);

				printMainMenu();
				// 기능구현

			}

		}

	}

	public static void printMainMenu() {

		boolean b = true;
		while (b) {
			System.out.println();
			System.out.println(
					"**********************************************************************************************");
			System.out.println("       1. 자녀 기입장     2. 통계 조회    3. 마이페이지    4. 로그아웃  ");
			System.out.println(
					"----------------------------------------------------------------------------------------------");
			System.out.print("메뉴선택 >> ");

			String menu = sc.nextLine();
			switch (menu) {
			case "1":
				break;
			case "2":
				break;
			case "3":
				break;
			case "4":
				System.exit(0);
				break;
			default:
				System.out.println("화면에 보이는 메뉴 번호를 입력해주세요.");

			}

		}

	}

}
