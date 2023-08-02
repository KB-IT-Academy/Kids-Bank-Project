package view;

import java.util.Scanner;

public class ChildMenuView_나웅기 {

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
				// this.inputUpdate();
				break;
			case "5":
				this.kidsMyPage();
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
	 * 자식 마이페이지 메인 화면 만약 한가지 업무 끝나고 마이페이지에 있게 하려면 while문 넣기
	 */
	public void kidsMyPage() {
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("                               마 이 페 이 지                                     ");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("1. 닉네임 수정    2. 비밀번호 변경     3. 연결된 부모 확인     4. 회원 탈퇴");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.print("메뉴선택 > ");

		String menu = sc.nextLine();
		switch (menu) {
		case "1":
			this.kidsNickChange();
			break;
		case "2":
			this.kidsPasswordChange();
			break;
		case "3":
			 this.kidsRelationCheck();
			break;
		case "4":
			 this.leaveUser();
			break;
		default:
			System.out.println("번호를 다시 입력해주세요!!!!");

		}
	}

	/**
	 * 아이 닉네임 변경 
	 */
	public void kidsNickChange() {
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("                               닉 네 임 변 경                                     ");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("변경하실 닉네임을 입력해주세요!");
		System.out.print("닉네임 : ");
		String nickname = sc.nextLine();
		System.out.println(nickname);
		System.out.println("변경 하시겠습니까??");
		
		// 아랫 부분은 나중에 successView에서 보여줄 것
		boolean b = true;
		while (b) {
			System.out.println("1. 변경하기   2. 취소하기");
			String check = sc.nextLine();
			if (check.equals("1")) {
				// 닉네임 수정하는 함수 입력
				System.out.println("변경되었습니다.");
				b = false;
			} else if (check.equals("2")) {
				System.out.println("취소되었습니다.");
				b = false;
			} else {
				System.out.println("번호를 다시 입력해주세요");
				System.out.println();
			}
		}
	}

	/**
	 * 아이 비밀번호 변경 
	 */
	public void kidsPasswordChange() {
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("                            비 밀 번 호 변 경                                     ");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("변경하실 비밀번호를 입력해주세요!");
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		System.out.print("비밀번호 확인 : ");
		String passwordCheck = sc.nextLine();
		// 아랫 부분은 나중에 successView에서 보여줄 것
		if (password.equals(passwordCheck)) {
			// 비밀번호 수정하는 함수 입력하기
			System.out.println("변경되었습니다.");
		} else {
			System.out.println("비밀번호가 다릅니다.");
			kidsPasswordChange();
		}
	}

	/**
	 * 아이 부모 관계 추가 
	 * 일단은 추가 부분만 구현 음... 부모를 뭐로 찾을까요?? (매개변수) 
	 * 일단은 아이디로 하겠습니다
	 */
	public void kidsRelationCheck() {
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("                               부 모 님 조 회                                     ");
		System.out.println("----------------------------------------------------------------------------------");
		
		
		// 이부분에 부모 조회하는 함수 입력
		System.out.println("부모 조회 ...");
		System.out.println("돌아가시려면 아무 키나 눌러주세요");
		String choice = sc.nextLine();
	}
	
	/**
	 * 회원탈퇴
	 * 비밀번호를 한번 물어볼지??
	 */
	public void leaveUser() {
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("                               회 원 탈 퇴                                        ");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("비밀번호를 입력해주세요");
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		// 비밀번호 확인 함수 넣기
		if (password != "") {
			System.out.println("정말로 탈퇴하시겠습니까...?");
			boolean b = true;
			while (b) {
				System.out.println("1. 탈퇴하기   2. 취소하기");
				String check = sc.nextLine();
				if (check.equals("1")) {
					// 이부분에 회원 탈퇴 함수 넣기
					System.out.println("탈퇴되었습니다.");
					b = false;
				} else if (check.equals("2")) {
					System.out.println("취소되었습니다.");
					b = false;
				} else {
					System.out.println("번호를 다시 입력해주세요");
					System.out.println();
				}
			}
		} else {
			System.out.println("비밀번호가 틀립니다. 메인페이지로 돌아갑니다.");
			System.out.println();
		}
	}

}
