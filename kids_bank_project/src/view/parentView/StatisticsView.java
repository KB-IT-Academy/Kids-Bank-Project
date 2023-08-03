package view.parentView;

import java.util.Scanner;

/**
 * 통계 View
 */
public class StatisticsView {
	static Scanner sc = new Scanner(System.in);
	
	public StatisticsView() {}
	
	/**
	 * 통계 메뉴 화면 출력하는 메소드
	 */
	public static void printStatisticsMenu() {
		int flag = 1;
		while(flag == 1) {
			System.out.println("----------------------------------------------------------------------------------------------");
			System.out.println("                                            통 계                                              ");
			System.out.println("----------------------------------------------------------------------------------------------");
			
			System.out.println();
			System.out.println("**********************************************************************************************");
			System.out.println("                      1. 주간 통계   2. 월간 통계   3. 연간 통계   4. 기간 통계                          ");
			System.out.println("----------------------------------------------------------------------------------------------");
			System.out.println("메인 메뉴로 돌아가려면 q를 입력해주세요.");
			System.out.print("메뉴선택 >> ");
	
			String menu = sc.nextLine();
			switch (menu) {
			case "1":
				printWeekStaticsInfo();
				break;
			case "2":
				printMonthStaticsInfo();
				break;
			case "3":
				printYearStaticsInfo();
				break;
			case "4":
				printRangeStaticsInfo();
				break;
			case "q":
				flag = 0;
				return;
			default:
				System.out.println("화면에 보이는 메뉴 번호를 입력해주세요.");
			}
		}
	}
	
	/**
	 * 통계-주간 통계 화면 출력하는 메소드
	 */
	public static void printWeekStaticsInfo() {
		System.out.println();
		System.out.println("----------------------------------------------------------------------------------------------");
		
		// 7일 계산 출력
		System.out.println("                        **"+"0월 0일"+"~"+"0월 0일"+" 7일간 주간 통계"+"**                           ");
		printCategoryStaticsInfo();
	}
	
	/**
	 * 통계-월간 통계 화면 출력하는 메소드
	 */
	public static void printMonthStaticsInfo() {
		System.out.println();
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println("월 입력 : ");
		int month = Integer.parseInt(sc.nextLine());
		
		// 월 계산 출력
		System.out.println("                                **"+"0월"+" 한달간 월간 통계"+"**                                   ");
		printCategoryStaticsInfo();
	}
	
	/**
	 * 통계-연간 통계 화면 출력하는 메소드
	 */
	public static void printYearStaticsInfo() {
		System.out.println();
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println("년도 입력 : ");
		int year = Integer.parseInt(sc.nextLine());
		
		// 년도 계산 출력
		System.out.println("                               **"+"0000년"+" 1년간 연간 통계"+"**                                 ");
		printCategoryStaticsInfo();
	}
	
	/**
	 * 통계-기간 통계 화면 출력하는 메소드
	 */
	public static void printRangeStaticsInfo() {
		System.out.println();
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println("시작 날짜 입력 : ");
		String startDate = sc.nextLine();
		System.out.println("종료 날짜 입력 : ");
		String endDate = sc.nextLine();
		
		// 년도 계산 출력
		System.out.println("                            **"+"0월 0일"+"~"+"0월 0일"+" 기간 통계"+"**                           ");
		printCategoryStaticsInfo();
	}
	
	/**
	 * 통계 화면(상세 카테고리 통계) 화면 출력하는 메소드
	 */
	private static void printCategoryStaticsInfo() {
		System.out.println("-지출 : "+"0"+"원");
		System.out.println("+수입 : "+"0"+"원");
		System.out.println();
		
		System.out.println("지출 카테고리 비율");
		// 카레고리별 % 출력-반복문
		System.out.println("23"+"% "+"식비");
		System.out.println();
		
		// 수입 대비 지출 비율 계산 후 결과 출력
		// 수입 대비 지출 비율 계산
		//System.out.println("많이 절약했어요!");
	}
}
