package view.parentView;

import java.util.Scanner;

import controller.CommentEmojiController;
import controller.MoneyBookController;
import dto.UserDto;
import view.SuccessView;

/**
 * 용돈기입장 View
 */
public class MoneyBookView {
	static Scanner sc = new Scanner(System.in);
	private static int dateSize = 8;

	public MoneyBookView() {}

	/**
	 * 용돈기입장 메뉴 화면 출력하는 메소드
	 */
	static public void printMoneyBookMenu(int num, int childNum) {
		int flag = 1;
		while(flag == 1) {
			System.out.println("----------------------------------------------------------------------------------------------");
			System.out.println("                                         용 돈 기 입 장                                          ");
			System.out.println("----------------------------------------------------------------------------------------------");
			
			System.out.println();
			System.out.println("**********************************************************************************************");
			System.out.println("                         1.조회                   2.좋아요 기능                           ");
			System.out.println("----------------------------------------------------------------------------------------------");
			System.out.println("메인 메뉴로 돌아가려면 q를 입력해주세요.");
			System.out.print("메뉴선택 >> ");

			String menu = sc.nextLine();
			switch (menu) {
			case "1":
				printSearchMenu(num, childNum);
				break;
//			case "2":
//				printCommentsMoneyBookMenu(num, childNum);
//				break;
			case "2":
				printLikeMoneyBookMenu(num, childNum);
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
	static public void printSearchMenu(int num, int childNum) {
		int flag = 1;
		while(flag == 1) {
			System.out.println();
			System.out.println("----------------------------------------------------------------------------------------------");
			System.out.println("           1. 최근 5건     2. 날짜 조회     3. 월별 조회   4. 전체 조회                     ");
			System.out.println("기입장 메뉴로 돌아가려면 q를 입력해주세요.");
			System.out.print("메뉴선택 >> ");
	
			String menu = sc.nextLine();
			String date = "";
			switch (menu) {
			case "1":  
				MoneyBookController.getRecentMoneyBook(childNum); 
				break;
			case "2":
				System.out.println("날짜 입력 ex)20230803");
				date  = getNumberInput(sc, dateSize); 
				//MoneyBookController.getDayMoneyBook(date); 
				MoneyBookController.getDayMoneyBook(num, childNum, date); 
				break;
			case "3":
				System.out.println("월 입력 ex)202308");
				date = sc.nextLine(); 
				//MoneyBookController.getMonthMoneyBook(date);
				break;
			case "4":
				date  = getNumberInput(sc, dateSize); 
				//MoneyBookController.getAllMoneyBook();  
				MoneyBookController.getMonthMoneyBook(childNum, date); 
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
	 * 용돈기입장 댓글 화면 출력하는 메소드
	 */
	static public void printCommentsMoneyBookMenu(int num, int childNum) {
		int flag = 1;
		while(flag == 1) {
			//날짜가 잘 등록하면
			System.out.println();
			System.out.println("----------------------------------------------------------------------------------------------");
			System.out.println("                           1.댓글 등록     2. 댓글 수정     3. 댓글 삭제   ");
			System.out.println("기입장 메뉴로 돌아가려면 q를 입력해주세요.");
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
				//날짜가 알맞게 들어오면 날짜에 따른 댓글들 출력(rownum사용)
				SuccessView.printComments(num, childNum);
				
				//날짜에 댓글 내역 있으면 댓글 등록 못하게 해야함
				
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
				SuccessView.printComments(num, childNum);
				
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
				SuccessView.printComments(num, childNum);
				
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
			case "q":
				flag = 0;
				return;
			default:
				System.out.println("화면에 보이는 메뉴 번호를 입력해주세요.");
			}
		}
	}
	
	/**
	 * 용돈기입장 좋아요 화면 출력하는 메소드
	 * num : parent, 
	 */
	static public void printLikeMoneyBookMenu(int num, int childNum) {
		int flag = 1;
		while(flag == 1) {
			//날짜가 잘 등록하면
			System.out.println();
			System.out.println("----------------------------------------------------------------------------------------------");
			System.out.println("                              1.좋아요 등록     2. 좋아요 삭제                                       ");
			System.out.println("기입장 메뉴로 돌아가려면 q를 입력해주세요.");
			System.out.print("메뉴선택 >> ");

			String menu = sc.nextLine();

			String moneyDate;
			String emoji; //좋아요,싫어요
			
			switch (menu) {
			case "1":
				System.out.println();
				System.out.println("----------------------------------------------------------------------------------");
				System.out.println("좋아요 등록할 날짜 입력 : ");		
				moneyDate = sc.nextLine();
				//날짜가 알맞게 들어오면
				
				//좋아요 누르려는 날짜에 대한 내역들 출력
				SuccessView.printDayMoneyBook(num, childNum);
				
				//댓글 등록 기능 실행
				CommentEmojiController.craeteEmoji(childNum, num, 1, moneyDate);
				System.out.println("좋아요 등록 완료되었습니다. ");
				break;
			case "2":
				System.out.println();
				System.out.println("----------------------------------------------------------------------------------");
				System.out.println("좋아요 삭제할 날짜 입력 : ");		
				moneyDate = sc.nextLine();
				
				int likes = CommentEmojiController.deleteEmoji(num, moneyDate);
				//삭제할 날짜에 좋아요 없으면 없다는 메시지창 출력
				
				//좋아요 누른 날짜에 대한 내역들 출력(좋아요 하지 않았으면 출력 안함)
				SuccessView.printDayMoneyBook(num, childNum);
				if (likes == 0) {
					return;
				}
				System.out.println("좋아요 삭제 하시겠습니까?(Yes or No)");
				String choice = sc.nextLine();
				String choice_upper = choice.toUpperCase();
				
				if(choice_upper.equals("NO")) {
					return;
				}else if(choice_upper.equals("YES")) {
					//rownum int형으로 변환 뒤 메소드 실행
					System.out.println("삭제 완료되었습니다.");
				}else {
					System.out.println("Yes or No 로 입력해주세요.");
				}
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

