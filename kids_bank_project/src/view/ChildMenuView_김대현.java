package view;

import java.util.Scanner;

public class ChildMenuView_김대현{

	Scanner sc= new Scanner(System.in);
	//ElectronicsController controller = new ElectronicsController(); // 전역변수 초기화, 생성자 호출 

	/**
	  전체 메뉴를 출력하는 메소드
	*/
	public void printMenu(){
		
		boolean b = true;
	     while(b){
           System.out.println("----------------------------------------------------------------------------------");
           System.out.println("1. 조회    2. 기입장 작성     3. 통계 조회     4. 랭킹 조회   5. 마이페이지    6. 로그아웃(누르면 부모 메뉴로 넘어감)");
		   System.out.println("----------------------------------------------------------------------------------");
		   System.out.print("메뉴선택 > ");

		   String  menu = sc.nextLine();
		   switch(menu){
               case "1" : 
                 inputSearch();
			   break;
			   case "2" : 
                 inputCreate();
			   break;
			   case "3" : 
                 //this.inputInsert();
			   break;
			   case "4" : 
                 //this.inputUpdate();
			   break;
			   case "5" : 
	                 //this.inputDelete();
				   break;
			   case "6" : 
                 //System.exit(0);
				   b = false;
				   break;
			   default:
				   System.out.println("메뉴를 다시 선택해주세요!!!!");

		   }//switch문끝

		 }//while문끝

	}//메소드끝

	/**
	   등록할때 키보드 입력을 처리하는 메소드
	*/
	public void inputSearch(){  //1. 조회 눌렀을때
		System.out.println("----------------------------------------------------------------------------------");
        System.out.println("1. 월별 조회   2. 최근 5건   3.전체조회   4.날짜 검색 조회 ");
		   System.out.println("----------------------------------------------------------------------------------");
		   System.out.print("메뉴선택 > ");
		   String  menu = sc.nextLine();
		   
		   switch(menu){
               case "1" : 
            	   System.out.print("날짜 입력 ");
			       String date = sc.nextLine(); 
         	   	  // controller.getMonthMoneyBook(date);
			   break;
			   case "2" : 
				  // controller.getRecentMoneyBook();
			   break;
			   case "3" : 
//				   controller.getAllMoneyBook();
			   break;
			   case "4" : 
			       System.out.print("날짜 입력 ");
//			       String date = sc.nextLine(); 
//				   controller.getDateMoneyBook(date);  
			   break;
			   default:
				   System.out.println("메뉴를 다시 선택해주세요!!!!");
		   			} // switch문 끝
				  
			} //inputSearch메소드 끝
		   
	 public void inputCreate(){ // 2. 기입장 작성 눌렀을 때
		 System.out.print("날짜입력 ");
		 String date = sc.nextLine();
		     
		 System.out.print("내용입력 ");
		 String content = sc.nextLine();

		 System.out.print("메모 ");
		 String memo = sc.nextLine();

		 System.out.print("돈 사용 ");
		 int money = Integer.parseInt(sc.nextLine());

		 System.out.print("카테고리 ");
		 String category = sc.nextLine();
		       
//		 controller.createMoneyBook( new MoneyBook(date,content, memo, money, category) );
			}//inputCreate 메소드 끝
		

}
