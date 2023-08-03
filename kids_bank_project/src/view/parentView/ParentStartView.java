package view.parentView;

import java.util.Scanner;

import view.StartView;
import view.SuccessView;
import view.childView.ChildStartView;

/**
 * 부모 회원 View
 */
public class ParentStartView {
	static Scanner sc = new Scanner(System.in);

	public ParentStartView() {}
	
	/**
	 * 시작 화면 출력하는 메소드
	 */
	public static void printParentStart() {
		int flag = 1;
		while (flag == 1) {
			System.out.println();
			System.out.println("==============================================================================================");
			System.out.println("                                         <부모 회원>                                             ");
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
		//System.out.println("---------------------------[Kids Bank - 어린이 용돈기입장 관리 프로그램]---------------------------------");
		System.out.println();
		System.out.println("----------------------------------------부모 회원가입---------------------------------------------");

		System.out.print("ID 입력 : ");
		String id = sc.nextLine();
		System.out.print("PW 입력 : ");
		String password = sc.nextLine();
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		System.out.print("아이와의 관계(부 or 모) : ");
		String parentType = sc.nextLine();
		
		// 반복문으로 설정 필요, 메소드로 따로 분리
		System.out.print("아이찾기를 위한 아이 주민등록번호 입력(-포함) : ");
		String registrationNumber = sc.nextLine();

		if (true) { // 아이가 가입 되어있으면 -> 메소드 추가하기
			System.out.println();
			System.out.println("아이찾기 성공!");
			System.out.println("회원가입 성공!");
			printLogin(); // 부모 로그인 화면으로 이동
		} else {
			System.out.println("해당 아이는 가입되어있지 않습니다. 아이를 먼저 가입해주세요.");
			ChildStartView.printJoin(); // 아이 회원가입 화면으로 이동
		}
		// controller.insert( new Parent() );
	}

	/**
	 * 로그인 화면을 출력하는 메소드
	 */
	public static void printLogin() {
		System.out.println();
		System.out.println("**********************************************************************************************");
		System.out.println("                                    *  부모 로그인  *                                            ");
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
	 * 메인 화면 출력 전 자녀를 선택하는 메소드
	 */
	public static void printSelectChild() {
		while (true) {
			System.out.println();
			System.out.println("**********************************************************************************************");
			// 자녀 정보 불러와서 출력
			SuccessView.printChilds();
			
			System.out.println("         1. 자녀1     2. 자녀2   ");
			System.out.println("----------------------------------------------------------------------------------------------");
			
			// 반복문으로 설정 필요, 메소드로 따로 분리
			System.out.print("자녀 선택(자녀를 추가하려면 +를 입력하세요) : ");
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

	/**
	 * 메인 메뉴 화면 출력하는 메소드
	 */
	public static void printMainMenu() {
		while (true) {
			System.out.println();
			System.out.println("**********************************************************************************************");
			System.out.println("                      1. 자녀 기입장     2. 통계 조회    3. 마이페이지    4. 로그아웃                     ");
			System.out.println("----------------------------------------------------------------------------------------------");
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
				MyPageView.printMyPageMenu();
				break;
			case "4":
				System.out.println("로그아웃 되었습니다.");
				StartView.printMain();
				break;
			default:
				System.out.println("화면에 보이는 메뉴 번호를 입력해주세요.");
			}
		}
	}
}
