package view;

import java.util.Scanner;


public class ChildMenuView_김휘경 {

	static Scanner sc= new Scanner(System.in);

	/**
	  메인 메뉴를 출력하는 메소드
	*/
	public static void printMenuMain(){

	     while(true){
           System.out.println("---------------------------[Kids Bank - 어린이 용돈기입장 관리 프로그램]---------------------------------");
		   System.out.println();
		   System.out.println("                                로그인 및 회원가입을 선택해주세요!             ");
		   System.out.println();
		   System.out.println("                              1. 로그인             2. 회원가입");
		   System.out.println("-------------------------------------------------------------------------------------------------");

		   String  menu = sc.nextLine();
		   switch(menu){
               case "1" : 
                 //controller.selectAll();
				   System.out.println("로그인 선택 완료");
				   printMenuLogin();
			   break;
			   case "2" : 
                 //this.inputSearch();
				   System.out.println("회원가입 선택 완료");
				   printMenuJoinParent();
			   break;
			   default:
				   System.out.println("메뉴를 다시 선택해주세요!!!!");

		   }

		 }
	}

	/**
	 로그인 화면을 출력하는 메소드
	 */
	public static void printMenuLogin(){

		System.out.println("---------------------------[Kids Bank - 어린이 용돈기입장 관리 프로그램]---------------------------------");
		System.out.println();
		System.out.println("                                     *  로그인  *                                                  ");

		System.out.print("                                  아이디를 입력해주세요: ");
		String id = sc.nextLine();
		System.out.print("                                  비밀번호를 입력해주세요: ");
		String password = sc.nextLine();

		//String type = "child"; // child or parent  - 임의로 작성함
		String type = "parent";
		if(true){ // 회원가입이 되어있으면 -> 메소드 추가하기
			System.out.println();
			System.out.println("                                      로그인 성공!");
			System.out.println();
			printMenu(type); // 로그인한 회원이 child or parent에 따라 화면 보여줌

		}else{
			System.out.println("아이디, 비밀번호를 다시 확인해주세요.");
			// 아이디, 비번 입력칸 다시 호출
		}

	}
	public static void printMenu(String type) {
		if(type.equals("child")){
			System.out.println("--------- 아이 메뉴---------------");
			ChildMenuView ch_mv = new ChildMenuView(); // 전역변수 초기화, 생성자 호출
			ch_mv.printMenu();
		}else{
			System.out.println("--------부모 메뉴---------------");
			ParentMenuView pr_mv = new ParentMenuView(); // 전역변수 초기화, 생성자 호출
			pr_mv.printMenu();
		}

	}


	/**
	 회원가입 메인 메뉴를 출력하는 메소드
	 */
	public static void printMenuJoinMain(){

		while(true){
			System.out.println("------------------------------------------* 회원가입 *--------------------------------------------");
			System.out.println("                              1. 부모 가입하기             2. 아이 가입하기");
			System.out.println("-------------------------------------------------------------------------------------------------");

			String  menu = sc.nextLine();
			switch(menu){
				case "1" :
					//controller.selectAll();
					System.out.println("부모 가입하기 선택 완료");
					printMenuJoinParent();
					break;
				case "2" :
					//this.inputSearch();
					System.out.println("아이 가입하기 선택 완료");
					printMenuJoinChild();
					break;
				default:
					System.out.println("메뉴를 다시 선택해주세요!!!!");

			}

		}
	}

	/**
	 회원가입(부모) 화면을 출력하는 메소드
	 */
	public static void printMenuJoinParent(){

		System.out.println("---------------------------[Kids Bank - 어린이 용돈기입장 관리 프로그램]---------------------------------");
		System.out.println();
		System.out.println("-------------------------------------* 부모 회원가입 *-----------------------------------------------");

		System.out.print("                                  아이디를 입력해주세요: ");
		String id = sc.nextLine();
		System.out.print("                                  비밀번호를 입력해주세요: ");
		String password = sc.nextLine();
		System.out.print("                                  이름을 입력해주세요: ");
		String name = sc.nextLine();
		System.out.print("                         아이찾기를 위해 아이 주민번호를 입력해주세요: ");
		String registrationNumber = sc.nextLine();

		if(true){ // 아이가 가입 되어있으면 -> 메소드 추가하기
			System.out.println();
			System.out.println("                                      아이찾기 성공!");
			System.out.println("                                      회원가입 성공!");
			printMenuLogin(); // 로그인 화면으로 이동
		}else{
			System.out.println("            해당 아이는 가입되어있지 않습니다. 아이를 먼저 가입해주세요.");
			printMenuJoinChild();
		}
		//controller.insert( new Parent() );
	}


	/**
	 회원가입(아이) 화면을 출력하는 메소드
	 */
	public static void printMenuJoinChild(){
		System.out.println("---------------------------[Kids Bank - 어린이 용돈기입장 관리 프로그램]---------------------------------");
		System.out.println();
		System.out.println("------------------------------------- 아이 회원가입--------------------------------------------------");

		System.out.print("아이디를 입력해주세요: ");
		String id = sc.nextLine();
		System.out.print("비밀번호를 입력해주세요: ");
		String password = sc.nextLine();
		System.out.print("이름을 입력해주세요: ");
		String name = sc.nextLine();

		if(true){ // 3가지 항목 모두 제대로 입력한 경우 -> 메소드 추가하기
			System.out.println("아이 회원가입 성공!");
		}else{ // 3가지 항목 제대로 입력하지 않은 경우
			System.out.println("정보를 다시 입력하세요.");
			// 예외처리 추가
		}

		//controller.insert( new Child() );

	}

	public static void main(String[] args) {
		printMenuMain();

	}


}
