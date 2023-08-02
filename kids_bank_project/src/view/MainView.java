package view;

import java.util.Scanner;

import static view.childView.LoginView.printMenuLogin;
import static view.parentView.JoinView.printMenuJoinParent;

public class MainView {
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
            System.out.println("                        1. 로그인        2. 부모 로그인        2. 회원가입");
            System.out.println("-------------------------------------------------------------------------------------------------");

            String  menu = sc.nextLine();
            switch(menu){
                case "1" :
                    //controller.selectAll();
                    System.out.println("아이 로그인 선택 완료");
                    printMenuLogin();
                    break;
                case "2" :
                    //this.inputSearch();
                    System.out.println("부모 로그인 선택 완료");
                    printMenuJoinParent();
                    break;
                case "3" :
                    //this.inputSearch();
                    System.out.println("회원가입 선택 완료");
                    printMenuJoinParent();
                    break;
                default:
                    System.out.println("메뉴를 다시 선택해주세요!!!!");

            }

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
}
