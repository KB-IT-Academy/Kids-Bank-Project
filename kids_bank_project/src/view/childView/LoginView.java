package view.childView;

import java.util.Scanner;

import static view.MainView.printMenu;


public class LoginView {
    static Scanner sc= new Scanner(System.in);

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
}
