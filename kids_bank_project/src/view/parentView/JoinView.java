package view.parentView;

import java.util.Scanner;

import static view.childView.JoinView.printMenuJoinChild;
import static view.childView.LoginView.printMenuLogin;

public class JoinView {
    static Scanner sc= new Scanner(System.in);


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



}
