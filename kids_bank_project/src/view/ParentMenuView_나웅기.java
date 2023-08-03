package view;

import java.util.Scanner;

public class ParentMenuView_나웅기 {

	Scanner sc= new Scanner(System.in);
	//ElectronicsController controller = new ElectronicsController(); // 전역변수 초기화, 생성자 호출 

	/**
	  전체 메뉴를 출력하는 메소드
	*/
	public void printMenu(){
        
	     while(true){
           System.out.println("----------------------------------------------------------------------------------");
           System.out.println("1. 조회    2. 통계 조회     3. 마이페이지     4. 로그아웃");
		   System.out.println("----------------------------------------------------------------------------------");
		   System.out.print("메뉴선택 : ");

		   String  menu = sc.nextLine();
		   switch(menu){
		   		case "1" : 
               //controller.selectAll();
			   break;
			   case "2" : 
               //this.inputSearch();
			   break;
			   case "3" : 
               this.parentMyPage();
			   break;
			   case "4" : 
               //this.inputUpdate();
//				   System.exit(0);
			   break;
			   default:
				   System.out.println("메뉴를 다시 선택해주세요!!!!");

		   }//switch문끝

		 }//while문끝

	}//메소드끝
	/**
	 * 자식 마이페이지 메인 화면 만약 한가지 업무 끝나고 마이페이지에 있게 하려면 while문 넣기
	 */
	public void parentMyPage() {
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("                               마 이 페 이 지                                     ");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("1. 닉네임 수정    2. 비밀번호 변경     3. 내가 쓴 댓글, 좋아요     4. 연결된 부모 확인     5. 회원 탈퇴");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.print("메뉴선택 : ");

		String menu = sc.nextLine();
		switch (menu) {
		case "1":
			this.parentNickChange();
			break;
		case "2":
			this.parentPasswordChange();
			break;
		case "3":
			 this.ParentHistory();
			break;
		case "4":
			 this.parentRelationCheck();
			break;
		case "5":
			 this.leaveUser();
			break;
		default:
			System.out.println("번호를 다시 입력해주세요!!!!");

		}
	}
	/**
	 * 부모 닉네임 변경 
	 */
	public void parentNickChange() {
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
				// 이 부분에 닉네임 수정하는 함수 입력
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
	 * 부모 비밀번호 변경 
	 */
	public void parentPasswordChange() {
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
			// 이 부분에 비밀번호 수정하는 함수 입력
			System.out.println("변경되었습니다.");
		} else {
			System.out.println("비밀번호가 다릅니다.");
			parentPasswordChange();
		}
	}
	
	/**
	 * 부모 댓글 좋아요 내역(수정)
	 * 여기부터 다시 생각해보기
	 */
	public void ParentHistory() {
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("                             댓 글 좋 아 요 내 역                                 ");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("조회하실 기간을 선택해주세요!");
		System.out.print("시작일 : ");
		String startDate = sc.nextLine();
		System.out.print("종료일 : ");
		String endDate = sc.nextLine();
		// 이 부분에 댓글 좋아요 리스트 받아오는 함수 입력
		// 더미 데이터
		String date = "2023-08-01";
		String comment = "용돈 올려줄게~";
		String like = "👍👍👍";
		String row = date + "    ||    " + comment + "    ||    " + like;
		System.out.println(row);
		boolean b = true;
		while (b) {
			System.out.println("1. 댓글 수정   2. 댓글 삭제   3. 좋아요 취소   4. 나가기");
			String choice = sc.nextLine();
			switch (choice) {
			case "1":
				String choiceDate = this.getDate();
				// 여기에 댓글 수정 함수 입력
				System.out.println("변경되었습니다.");
				break;
			case "2":
				String choiceDate1 = this.getDate();
				// 여기에 댓글 삭제 함수 입력
				System.out.println("삭제되었습니다.");
				break;
			case "3":
				String choiceDate2 = this.getDate();
				// 여기에 좋아요 취소 함수 입력
				System.out.println("취소되었습니다.");
				break;
			case "4":
				 b = false;
				 break;
			default:
				System.out.println("번호를 다시 입력해주세요!!!!");

			}
		}
	}
	
	/**
	 * 날짜 선택 함수
	 */
	public String getDate() {
		System.out.println("날짜를 입력해주세요");
		System.out.print("날짜 : ");
		String date = sc.nextLine();
		return date;
	}
	
	/**
	 * 아이 부모 관계 추가 
	 * 일단은 추가 부분만 구현
	 * 일단은 아이디로 하겠습니다
	 */
	public void parentRelationCheck() {
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("                                자 식 추 가                                       ");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("자식의 주민등록번호를 입력해주세요");
		System.out.print("주민등록번호 : ");
		String id = sc.nextLine();
		// 이 부분에 부모 찾는 함수 입력
		System.out.println("자식 데이터 가져오는 함수 실행 중...");
		System.out.println(id);
		// 테스트
		if (id == "") {
			System.out.println("가입되어 있는 아이가 없습니다.");
			return;
		}
		
		System.out.println("등록하시겠습니까?");
		
		boolean b = true;
		while (b) {
			System.out.println("1. 등록하기   2. 취소하기");
			String check = sc.nextLine();
			if (check.equals("1")) {
				// 이부분에 관계 연결 함수 입력
				System.out.println("등록되었습니다.");
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
		// 이 부분에 비밀번호 확인 함수 입력
		if (password != "") {
			System.out.println("정말로 탈퇴하시겠습니까...?");
			boolean b = true;
			while (b) {
				System.out.println("1. 탈퇴하기   2. 취소하기");
				String check = sc.nextLine();
				if (check.equals("1")) {
					// 이부분에 회원 탈퇴 함수 입력
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
