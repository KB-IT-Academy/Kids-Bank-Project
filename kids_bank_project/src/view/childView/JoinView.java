package view.childView;

import java.util.Scanner;


public class JoinView {
    static Scanner sc= new Scanner(System.in);


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

}
