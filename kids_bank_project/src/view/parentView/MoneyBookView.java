package view.parentView;

import java.util.Scanner;

/**
 * 용돈기입장 View
 */
public class MoneyBookView {
	static Scanner sc = new Scanner(System.in);

	public MoneyBookView() {}

	/**
	 * 용돈기입장 메뉴 화면 출력하는 메소드
	 */
	static public void printMoneyBookMenu() {
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println("                                         용 돈 기 입 장                                          ");
		System.out.println("----------------------------------------------------------------------------------------------");
		
		System.out.println();
		System.out.println("**********************************************************************************************");
		System.out.println("                         1.조회          2.댓글 기능         3.좋아요 기능                           ");
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.print("메뉴선택 >> ");

		String menu = sc.nextLine();
		switch (menu) {
		case "1":
			printSearchMenu();
			break;
		case "2":
			printCommentsMoneyBookMenu();
			break;
		case "3":
			printLikeMoneyBookMenu();
			break;
		default:
			System.out.println("화면에 보이는 메뉴 번호를 입력해주세요.");
		}
	}

	/**
	 * 용돈기입장 조회 화면 출력하는 메소드
	 */
	static public void printSearchMenu() {
		System.out.println();
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("           1. 최근 5건     2. 날짜 조회     3. 월별 조회   4. 전체 조회                     ");
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

			break;
		default:
			System.out.println("화면에 보이는 메뉴 번호를 입력해주세요.");
		}
	}
	
	/**
	 * 용돈기입장 댓글 화면 출력하는 메소드
	 */
	static public void printCommentsMoneyBookMenu() {
		//날짜가 잘 등록하면
		System.out.println();
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println("                           1.댓글 등록     2. 댓글 수정     3. 댓글 삭제   ");
		System.out.print("메뉴선택 >> ");

		String menu = sc.nextLine();

		String moneyDate;
		String content; //댓글
		String rownum;
		
		switch (menu) {
		case "1":
			System.out.println();
			System.out.println("----------------------------------------------------------------------------------");
			System.out.println("댓글 작성할 날짜 입력 : ");		
			moneyDate = sc.nextLine();
			//날짜가 알맞게 들어오면
			System.out.println("댓글 내용 입력 : ");
			content = sc.nextLine();
			//댓글 등록 기능 실행
			System.out.println("댓글 등록 완료되었습니다.");
			break;
		case "2":
			System.out.println();
			System.out.println("----------------------------------------------------------------------------------");
			System.out.println("댓글 수정할 날짜 입력 : ");		
			moneyDate = sc.nextLine();
			//날짜가 알맞게 들어오면 날짜에 따른 댓글들 출력(rownum사용)
			System.out.println("수정할 번호 입력(수정할 내역 없으면 -1 입력) : ");
			rownum = sc.nextLine();
			
			if(rownum.equals("-1")) {
				return;
			}else {
				System.out.println("수정할 댓글 내용 입력 : ");
				content = sc.nextLine();
				//rownum int형으로 변환 뒤 메소드 실행
				//내역 번호 안누르면 에러처리
				
				System.out.println("수정 완료되었습니다.");
			}
			//수정 구현
			break;
		case "3":
			System.out.println();
			System.out.println("----------------------------------------------------------------------------------");
			System.out.println("댓글 삭제할 날짜 입력: ");		
			moneyDate = sc.nextLine();
			//날짜가 알맞게 들어오면 날짜에 따른 댓글들 출력(rownum사용)
			System.out.println("삭제할 번호 입력(삭제할 내역이 없으면 -1 입력) : ");
			rownum = sc.nextLine();
			
			if(rownum.equals("-1")) {
				return;
			}else {
				//rownum int형으로 변환 뒤 메소드 실행
				//내역 번호 안누르면 에러처리
				
				System.out.println("삭제 완료되었습니다.");
			}
			break;
		default:
			System.out.println("화면에 보이는 메뉴 번호를 입력해주세요.");
		}
	}
	
	/**
	 * 용돈기입장 좋아요 화면 출력하는 메소드
	 */
	static public void printLikeMoneyBookMenu() {
		//날짜가 잘 등록하면
		System.out.println();
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println("                              1.좋아요 등록     2. 좋아요 삭제                                       ");
		System.out.print("메뉴선택 >> ");

		String menu = sc.nextLine();

		String moneyDate;
		String emoji; //좋아요,싫어요
		String rownum;
		
		switch (menu) {
		case "1":
			System.out.println();
			System.out.println("----------------------------------------------------------------------------------");
			System.out.println("좋아요 등록할 날짜 입력 : ");		
			moneyDate = sc.nextLine();
			//날짜가 알맞게 들어오면
			//댓글 등록 기능 실행
			System.out.println("좋아요 등록 완료되었습니다.");
			break;
		case "2":
			System.out.println();
			System.out.println("----------------------------------------------------------------------------------");
			System.out.println("좋아요 삭제할 날짜 입력 : ");		
			moneyDate = sc.nextLine();
			//날짜가 알맞게 들어오면 날짜에 따른 댓글들 출력(rownum사용)
			System.out.println("삭제할 번호 입력(수정할 내역 없으면 -1 입력) : ");
			rownum = sc.nextLine();
			
			if(rownum.equals("-1")) {
				return;
			}else {
				//rownum int형으로 변환 뒤 메소드 실행
				//내역 번호 안누르면 에러처리
				
				System.out.println("삭제 완료되었습니다.");
			}
			break;
		default:
			System.out.println("화면에 보이는 메뉴 번호를 입력해주세요.");
		}
	}
}
