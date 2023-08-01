package view;


/*
 * 
 */
public class StartView {

	public static void main(String[] args) {
		
		System.out.println("===== Kids Bank =====");
		
		System.out.println("--------- 아이 메뉴---------------");
		ChildMenuView ch_mv = new ChildMenuView(); // 전역변수 초기화, 생성자 호출 
		ch_mv.printMenu();
	    
		System.out.println("--------부모 메뉴---------------");
		ParentMenuView pr_mv = new ParentMenuView(); // 전역변수 초기화, 생성자 호출 
		pr_mv.printMenu();
		
	}
}
