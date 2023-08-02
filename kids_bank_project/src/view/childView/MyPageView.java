package view.childView;

import java.util.Scanner;

public class MyPageView {

	public MyPageView() {}
	
	static Scanner sc = new Scanner(System.in);

	/**
	 * 자식 마이페이지 메인 화면 만약 한가지 업무 끝나고 마이페이지에 있게 하려면 while문 넣기
	 */
	public static void kidsMyPage() {
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println("                                         마 이 페 이 지                                          ");
		System.out.println("----------------------------------------------------------------------------------------------");System.out.println("----------------------------------------------------------------------------------");
		
		System.out.println();
		System.out.println("**********************************************************************************************");
		System.out.println("           1. 비밀번호 변경     2. 연결된 부모 확인     3. 회원 탈퇴");
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.print("메뉴선택 >> ");

		String menu = sc.nextLine();
		switch (menu) {
		case "1":
			kidsPasswordChange();
			break;
		case "2":
			kidsRelationCheck();
			break;
		case "3":
			leaveUser();
			break;
		default:
			System.out.println("화면에 보이는 메뉴 번호를 입력해주세요.");

		}
	}

	/**
	 * 아이 닉네임 변경 
	 */
	/*public static void kidsNickChange() {
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
	}*/

	/**
	 * 아이 비밀번호 변경 
	 */
	public static void kidsPasswordChange() {
		
		System.out.println();
		System.out.println("----------------------------------------------------------------------------------");
		
		System.out.println("변경 PW:");
		System.out.print("PW : ");
		String password = sc.nextLine();
		System.out.print("PW 확인 : ");
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
	public static void kidsRelationCheck() {
		
		System.out.println();
		System.out.println("----------------------------------------------------------------------------------");
		
		// 이부분에 부모 조회하는 함수 입력
		System.out.println("<<연결된 부모>>");
		System.out.println("돌아가시려면 아무 키나 눌러주세요");
		String choice = sc.nextLine();
	}
	
	/**
	 * 회원탈퇴
	 * 비밀번호를 한번 물어볼지??
	 */
	public static void leaveUser() {
		
		System.out.println();
		System.out.println("----------------------------------------------------------------------------------");
		
		System.out.print("PW 입력: ");
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
