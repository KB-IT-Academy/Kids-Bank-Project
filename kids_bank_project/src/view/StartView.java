package view;

import java.util.Scanner;

import view.childView.ChildStartView;
import view.parentView.ParentStartView;

/**
 * 프로그램 시작 View
 */
public class StartView {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==============================================================================================");
		System.out.println("                                       K i d s B a n k                                        ");
		System.out.println("==============================================================================================");
		System.out.println();
		System.out.println("                               1.아이 입장                   2.부모 입장							  ");
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
		default:
			System.out.println("화면에 보이는 메뉴 번호를 입력해주세요.");
		}
		
		
	}
}
