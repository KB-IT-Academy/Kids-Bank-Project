package view;

import java.util.Scanner;


public class ChildMenuView_김대현 {

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
                 //controller.selectAll();
			   break;
			   case "2" : 
                 //this.inputSearch();
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
	public void inputInsert(){
        System.out.print("모델번호는? ");
        int modelNo = Integer.parseInt(sc.nextLine());

		System.out.print("모델이름은? ");
        String modelName = sc.nextLine();

		System.out.print("모델가격은? ");
        int modelPrice = Integer.parseInt(sc.nextLine());

		System.out.print("모델설명은? ");
        String modelDetail = sc.nextLine();

        
		//controller.insert( new Electronics(modelNo, modelName, modelPrice, modelDetail) );

	}

}
