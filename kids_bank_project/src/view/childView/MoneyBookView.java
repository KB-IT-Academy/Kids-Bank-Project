package view.childView;

import java.util.List;
import java.util.Scanner;

import controller.MoneyBookController;
import dto.MoneyBookDto;
import view.SuccessView;

/**
 * 용돈기입장 View
 */
public class MoneyBookView {
	static Scanner sc = new Scanner(System.in);
	private static int dateSize = 8;
	
	public MoneyBookView() {
	}

	/**
	 * 용돈기입장 메뉴 화면 출력하는 메소드
	 */
	static public void printMoneyBookMenu() {
		int flag = 1;
		while (flag == 1) {
			System.out.println("----------------------------------------------------------------------------------------------");
			System.out.println("                                         용 돈 기 입 장                                          ");
			System.out.println("----------------------------------------------------------------------------------------------");

			System.out.println();
			System.out.println("**********************************************************************************************");
			System.out.println("                      1.조회          2.등록          3.수정          4.삭제                       ");
			System.out.println("----------------------------------------------------------------------------------------------");
			System.out.println("메인 메뉴로 돌아가려면 q를 입력해주세요.");
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
			case "q":
				flag = 0;
				return;
			default:
				System.out.println("화면에 보이는 메뉴 번호를 입력해주세요.");
			}
		}
	}

	/**
	 * 용돈기입장 조회 화면 출력하는 메소드
	 */
	static public void printSearchMenu() {
		
		int flag = 1;
		while (flag == 1) {
			System.out.println();
			System.out.println("----------------------------------------------------------------------------------");
			System.out.println("           1. 최근 5건     2. 날짜 조회     3. 월별 조회   4. 전체 조회                     ");
			System.out.println("기입장 메뉴로 돌아가려면 q를 입력해주세요.");
			System.out.print("메뉴선택 >> ");
	
			String menu = sc.nextLine();
			switch (menu) {
			case "1":
				MoneyBookController.getRecentMoneyBook();
				break;
			case "2":
				System.out.println("날짜 입력 ex)20230803");
				String date  = getNumberInput(sc, dateSize);
				MoneyBookController.getDayMoneyBook(date);
				break;
			case "3":
				System.out.println("월 입력 ex)202308");
				date = sc.nextLine();
				MoneyBookController.getMonthMoneyBook(date);
				break;
			case "4":
				MoneyBookController.getAllMoneyBook();
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
	 * 용돈기입장 등록 화면 출력하는 메소드
	 */
	static public void printInsertMoneyBook() {
		
		System.out.println();
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("작성할 날짜 입력 : ");
		String moneydate = getNumberInput(sc, dateSize);

		System.out.println("1. 수입 2. 지출");
		System.out.print("분류 선택 : ");
		int moneyTypeInt = Integer.parseInt(sc.nextLine());

		String outComeType;
		int amount;
		String content, memo;
		MoneyBookDto dto = new MoneyBookDto();
		switch (moneyTypeInt) {
		case 1:
			System.out.println("금액 입력 : ");
			amount = Integer.parseInt(sc.nextLine());
			System.out.println("내용 입력 : ");
			content = sc.nextLine();
			System.out.println("메모 입력 : ");
			memo = sc.nextLine();
			dto =  new MoneyBookDto(); // 적어야될곳
	    	MoneyBookController.createMoneyBook(dto);
			break;
		case 2:
			System.out.println("1.식비 2.간식 3.교통비 4.문화생활 5.기념일 6.기타");
			System.out.println("지출 분류 선택 : ");
			outComeType = "-";
			System.out.println("금액 입력 : ");
			amount = Integer.parseInt(sc.nextLine());
			System.out.println("내용 입력 : ");
			content = sc.nextLine();
			System.out.println("메모 입력 : ");
			memo = sc.nextLine();
			//기능구현
			dto =  new MoneyBookDto();//적어야될곳
	    	MoneyBookController.createMoneyBook(dto);
			System.out.println("등록 완료되었습니다.");
			break;
		default:
			System.out.println("화면에 보이는 메뉴 번호를 입력해주세요.");
		}
	}

	/**
	 * 용돈기입장 수정 화면 출력하는 메소드
	 */
	static public void printUpdateMoneyBook() {

		System.out.println();
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("수정할 날짜 입력 ex)20230803 :");
		String date = sc.nextLine();

		MoneyBookController.getDayMoneyBook(date); // 하루 날짜 출력 메소드
		

		System.out.println("수정할 번호 입력(수정할 내역 없으면 q 입력) : ");
		String str_rownum = sc.nextLine();

		if (str_rownum.equals("q")) {
			return;
		} else {
			int rownum = Integer.parseInt(str_rownum);
			selectContentOfBook(date,rownum);
		}
	
	}

	/**
	 * 용돈기입장 삭제 화면 출력하는 메소드
	 */
	static public void printDeleteMoneyBook() {
		System.out.println();
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("삭제할 날짜 입력 : ");
		String date = sc.nextLine();

		MoneyBookController.getDayMoneyBook(date);
		
		System.out.println("삭제할 번호 입력(삭제할 내역 없으면 q 입력) : ");
		String exit = sc.nextLine();

		if (exit.equals("q")) {
			return;
		} else {
			MoneyBookController.deleteMoneyBook(Integer.parseInt(exit));
		}
	}

	/**
	 * 용돈기입장 수정(상세 수정) 화면 출력하는 메소드
	 */
	static private void selectContentOfBook(String date, int rownum) {
		
	
		System.out.println();
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("1.금액 2.내용 3.메모");
		System.out.println("기입장 메뉴로 돌아가려면 q를 입력해주세요.");
		System.out.print("수정할 항목 선택 : ");
		MoneyBookDto dto;

		String type = sc.nextLine();
		switch (type) {
		
		///////////모르겠음///////////////////////////
		case "1":
			System.out.println("수정할 금액 입력 : ");
			int amount = Integer.parseInt(sc.nextLine());
			dto = new MoneyBookDto(rownum,date, Integer.parseInt(type), amount, null, null) ;
			MoneyBookController.updateMoneyBook(dto);
			break;
		case "2":
			System.out.println("수정할 내용 입력 : ");
			String content = sc.nextLine();
			dto = new MoneyBookDto(rownum,date, Integer.parseInt(type), 0, content, null) ;
			MoneyBookController.updateMoneyBook(dto);
			break;
		case "3":
			System.out.println("수정할 메모 입력: ");
			String memo = sc.nextLine();
			dto = new MoneyBookDto(rownum,date, Integer.parseInt(type), 0, null, memo) ;
			MoneyBookController.updateMoneyBook(dto);
			break;
			//////////////////////////////////////////////
		case "q":
			return;
		default:
			System.out.println("화면에 보이는 메뉴 번호를 입력해주세요.");
		}
		System.out.println("수정 완료되었습니다.");

	}
	/**
	 * 날짜 받기
	 * @param scanner
	 * @param maxDigits
	 * @return
	 */
	public static String getNumberInput(Scanner scanner, int maxDigits) {
        while (true) {
        	
            String input = scanner.nextLine();

            if (input.length() == maxDigits && input.matches("\\d+")) {
                return input;
            } else {
                System.out.println("올바른 날짜를 입력하세요.");
            }
        }
    }
}
