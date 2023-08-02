package view.childView;

import java.util.Scanner;

public class MoneyBookView {

	static Scanner sc = new Scanner(System.in);

	public MoneyBookView() {
	}

	static public void printMoneyBookMenu() {

		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println("                                         용 돈 기 입 장                                          ");
		System.out.println("----------------------------------------------------------------------------------------------");
		
		System.out.println();
		System.out.println("**********************************************************************************************");
		System.out.println("          1.조회          2.등록          3.수정          4.삭제  ");
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.print("메뉴선택 >> ");

		String menu = sc.nextLine();
		switch (menu) {
		case "1":
			printSearchMenu();
			break;
		case "2":
			printInsertMoneyBook();
			break;
		case "3":
			printUpdateMoneyBook();
			break;
		case "4":
			printDeleteMoneyBook();
			break;
		default:
			System.out.println("화면에 보이는 메뉴 번호를 입력해주세요.");

		}
	}

	static public void printSearchMenu() {
		
		System.out.println();
		System.out.println("**********************************************************************************************");
		System.out.println("           1. 최근 5건     2. 날짜 조회     3. 월별 조회   4. 전체 조회   ");
		System.out.println("----------------------------------------------------------------------------------------------");
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

	static public void printInsertMoneyBook() {

		System.out.println();
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("작성할 날짜 입력: ");
		
		//에러처리+날짜 내역들 출력 메소드
		
		String moneydate = sc.nextLine();
		
		System.out.println("1. 수입     2. 지출  ");
		System.out.print("메뉴선택 >> ");

		String moneyType = sc.nextLine();
		
		int amount;
		String content;
		String memo;
		int outComeType;
		
		switch (moneyType) {
		case "1":
			System.out.println("금액: ");
			amount = Integer.parseInt(sc.nextLine());
			System.out.println("내용: ");
			content = sc.nextLine();
			System.out.println("메모: ");
			memo = sc.nextLine();
			//기능구현
			break;
		case "2":
			System.out.println("지출 분류 선택>> 1.식비 2.간식 3.교통비 4.문화생활 5.기념일 6.기타");
			outComeType = Integer.parseInt(sc.nextLine());
			System.out.println("금액: ");
			amount = Integer.parseInt(sc.nextLine());
			System.out.println("내용: ");
			content = sc.nextLine();
			System.out.println("메모: ");
			memo = sc.nextLine();
			//기능구현
			break;
		default:
			System.out.println("화면에 보이는 메뉴 번호를 입력해주세요.");

		}

	}

	static public void printUpdateMoneyBook() {
		System.out.println();
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("수정할 날짜 입력: ");
		
		
		String moneydate = sc.nextLine();
		
		//에러처리+날짜 내역들 출력 메소드
		
		System.out.println("수정할 번호 입력 (수정할 내역이 없으면 -1 입력) : ");
		String exit = sc.nextLine();
		
		if(exit.equals("-1")) {
			return;
		}else {
			selectContentOfBook();
			
		}

	}

	static public void printDeleteMoneyBook() {

		System.out.println();
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("삭제할 날짜 입력: ");
		
		
		String moneydate = sc.nextLine();
		
		//에러처리+날짜 내역들 출력 메소드
		
		System.out.println("삭제할 번호 입력 (삭제할 내역이 없으면 -1 입력) : ");
		String exit = sc.nextLine();
		
		if(exit.equals("-1")) {
			return;
		}else {
			
			//rownum int형으로 변환 뒤 메소드 실행
			//내역 번호 안누르면 에러처리
		}
		
	}
	
	static private void selectContentOfBook() {
		
		System.out.println();
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("수정할 내역 선택 : 1.금액  2.내용  3.메모 ");
		
		System.out.print("메뉴선택 >> ");

		String menu = sc.nextLine();
		switch (menu) {
		case "1":
			System.out.println("수정할 금액: ");
			int amount = Integer.parseInt(sc.nextLine());
			//rownum int형으로 변환 뒤 메소드 실행
			//내역 번호 안누르면 에러처리
			
			System.out.println("수정 완료되었습니다.");
			break;
		case "2":
			System.out.println("수정할 내용: ");
			String content = sc.nextLine();
			//rownum int형으로 변환 뒤 메소드 실행
			//내역 번호 안누르면 에러처리
			
			System.out.println("수정 완료되었습니다.");
			break;
		case "3":
			System.out.println("수정할 메모: ");
			String memo = sc.nextLine();
			//rownum int형으로 변환 뒤 메소드 실행
			//내역 번호 안누르면 에러처리
			
			System.out.println("수정 완료되었습니다.");
			break;
		default:
			System.out.println("화면에 보이는 메뉴 번호를 입력해주세요.");

		}
	}
}
