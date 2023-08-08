package view.parentView;

import java.util.List;
import java.util.Scanner;

import controller.JoinController;
import controller.LoginController;
import controller.MyPageController;
import dto.UserDto;
import session.Session;
import session.SessionSet;
import view.StartView;
import view.SuccessView;
import view.childView.ChildStartView;
import dto.ChildDto;
import dto.ParentDto;

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
		System.out.print("자녀와의 관계(부 or 모) : ");
		String parentType = sc.nextLine();
		
		// 자녀 찾기
		int childCount = 0; // 자녀 찾기 성공한 횟수
		int flag = 1;
		while(flag == 1) {
			System.out.println("----------------------------------------------------------------------------------------------");
			System.out.println("추가할 자녀 없으면 q를 입력해주세요.");
			System.out.print("자녀 찾기를 위한 자녀 주민등록번호 입력(-포함) : ");
			String registrationNumber = sc.nextLine();
			
			// 자녀 가입되어 있는지 확인하는 controller
			switch (registrationNumber) {
			case "q":
				flag = 0;
				break;
			default:
				boolean existChild = false; // 자녀 가입되어 있으면
				int childNumber = MyPageController.childFindByRegistNum(registrationNumber);
				if (childNumber != -1) {
					existChild = true;
				}
				if (existChild) { // 자녀가 가입되어 있으면 -> 메소드 추가하기
					System.out.println();
					System.out.println("자녀 찾기 성공!");
					
					System.out.print("자식 순서 입력 : ");
					int childOrder = Integer.parseInt(sc.nextLine());
					if (childCount == 0) {
						ParentDto dto = new ParentDto(0, id, password, name, null, null, parentType);
						JoinController.createParent(dto, registrationNumber);
						int	parentNumber = JoinController.getParentNum(id);
						MyPageController.createRelation(parentNumber, registrationNumber, childOrder);
					}					
					// 자녀 연결(관계 설정)하는 controller
					childCount++;
					System.out.println(childCount+"자녀 연결 완료");
				} else {
					System.out.println("해당 자녀는 가입되지 않았습니다.");
				}
			}
		}
		if (childCount == 0) { // 연결한 자녀가 없으면
			System.out.println("회원가입 불가!");
			System.out.println("자녀 회원가입 화면으로 이동합니다.");
			ChildStartView.printJoin(); // 자녀 회원가입 화면으로 이동
		} else { // 연결한 자녀가 있으면
			System.out.println("회원가입 성공!");
			System.out.println("부모 로그인 화면으로 이동합니다.");
			printLogin(); // 부모 로그인 화면으로 이동
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

		
		//boolean loginCheck = LoginController.loginParent(id, password);
		int parentNum = LoginController.loginParent(id, password); 
		if (parentNum != 0) {
			System.out.println();
			System.out.println("                                         로그인 성공!");
			System.out.println();

			printSelectChild(parentNum); // 자녀 선택
		} else {
			System.out.println("아이디, 비밀번호를 다시 확인해주세요.");
		}
	}

	/**
	 * 메인 화면 출력 전 자녀를 선택하는 메소드
	 */
	public static void printSelectChild(int num) {
	
		while (true) {
			System.out.println();
			System.out.println("**********************************************************************************************");
			// 자녀 정보 불러와서 출력, 자식 순서대로

			List<ChildDto> childList = MyPageController.getChild(num);
			if(childList != null) {  
				System.out.println("----------------------------------------------------------------------------------------------");
				System.out.print("자녀 선택 : ");
				 
				
			}else {
				System.out.println();
				System.out.print("자식 등록부터 해주세요!");
				return;
			} 
			
			// 받은 데이터 저장(인덱스 값으로 가져옴)
			int childOrder = Integer.parseInt(sc.nextLine());
			
			// 자식 PK값 가져오기 
			int childNum = childList.get(childOrder-1).getChildNum();
			//UserDto childData = childs.get(childOrder-1);
			printMainMenu(num, childNum);
			
			// 반복문으로 설정 필요, 메소드로 따로 분리
//			System.out.println("자녀 추가하려면 +를 입력해주세요.");
//
//			if (choice == "+") {
//				// 자녀 추가
//			} else {
//				// 자녀 번호 입력하면
//				// 기능구현
//			}
		}
	}

	/**
	 * 메인 메뉴 화면 출력하는 메소드
	 */
	public static void printMainMenu(int num, int childNum) {
		while (true) {
			System.out.println();
			System.out.println("**********************************************************************************************");
			System.out.println("                      1. 자녀 기입장     2. 통계 조회    3. 마이페이지    4. 로그아웃                     ");
			System.out.println("----------------------------------------------------------------------------------------------");
			System.out.print("메뉴선택 >> ");

			String menu = sc.nextLine();
			switch (menu) {
			case "1":
				MoneyBookView.printMoneyBookMenu(num, childNum);
				break;
			case "2":
				StatisticsView.printStatisticsMenu(childNum);
				break;
			case "3":
				MyPageView.printMyPageMenu(num);
				break;
			case "4":
				System.out.println("로그아웃 되었습니다.");
				// 로그아웃 추가 
				SessionSet sessionSet = new SessionSet();
				Session session = sessionSet.get(num);
				LoginController.logoutParent(session);
				StartView.printMain();
				break;
			default:
				System.out.println("화면에 보이는 메뉴 번호를 입력해주세요.");
			}
		}
	}
}
