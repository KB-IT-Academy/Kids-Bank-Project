package view;

import java.util.Scanner;

import view.childView.ChildStartView;
import view.parentView.ParentStartView;

/**
 * 프로그램 시작 View
 */
public class StartView {
	public static void main(String[] args) {

		printMain();
	}

	public static void printMain() {
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("==============================================================================================");
			System.out.println("                                       K i d s B a n k                                        ");
			System.out.println("==============================================================================================");
			System.out.println();
			System.out.println("                 1.아이 입장                   2.부모 입장		       3. 나가기			  ");
			System.out.println("----------------------------------------------------------------------------------------------");
			System.out.print("메뉴선택 >> ");
	
			String menu = sc.nextLine();
			switch (menu) {
			case "1":
				ChildStartView.printChildStart();
				break;
			case "2":
				ParentStartView.printParentStart();
				break;
			case "3":
				System.out.println("프로그램 종료되었습니다.");
				System.exit(0);
			default:
				System.out.println("화면에 보이는 메뉴 번호를 입력해주세요.");
			}
		}
	}
}
