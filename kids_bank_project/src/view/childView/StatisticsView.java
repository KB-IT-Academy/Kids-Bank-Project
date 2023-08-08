package view.childView;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import controller.StatisticsController;
import session.SessionSet;

/**
 * 통계 View
 */
public class StatisticsView {
	private static LocalDate currentDate = LocalDate.now();

	private static DateTimeFormatter yearFormatter = DateTimeFormatter.ofPattern("yyyy");
	private static DateTimeFormatter monthFormatter = DateTimeFormatter.ofPattern("MM");
	private static DateTimeFormatter dayFormatter = DateTimeFormatter.ofPattern("dd");
	private static String yearString = currentDate.format(yearFormatter);
	private static String monthString = currentDate.format(monthFormatter);
	private static String dayString = currentDate.format(dayFormatter);
	
	static Scanner sc = new Scanner(System.in);
	
	public StatisticsView() {}
	
	/**
	 * 통계 메뉴 화면 출력하는 메소드
	 */
	public static void printStatisticsMenu(int num) {
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
				printWeekStaticsInfo(num);
				break;
			case "2":
				printMonthStaticsInfo(num);
				break;
			case "3":
				printYearStaticsInfo(num);
				break;
			case "4":
				printRangeStaticsInfo(num);
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
	public static void printWeekStaticsInfo(int num) {
		System.out.println();
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println("                                 **"+monthString+"월 "+dayString+"일"+" 7일간 주간 통계"+"**       ");
		StatisticsController.getWeekAmountInfo(num, yearString+"-"+monthString+"-"+dayString);
		//printCategoryStaticsInfo();
	}
	
	/**
	 * 통계-월간 통계 화면 출력하는 메소드
	 */
	public static void printMonthStaticsInfo(int num) {
		System.out.println();
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println("년도 입력 : ");
		int year = Integer.parseInt(sc.nextLine());
		System.out.println("월 입력 : ");
		int month = Integer.parseInt(sc.nextLine());
		
		// 월 계산 출력
		System.out.println("                                 **"+year+"년 "+month+"월 한달간 월간 통계"+"**                     ");
		StatisticsController.getMonthAmountInfo(num, year, month);
		//printCategoryStaticsInfo();
	}
	
	/**
	 * 통계-연간 통계 화면 출력하는 메소드
	 */
	public static void printYearStaticsInfo(int num) {
		System.out.println();
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println("년도 입력 : ");
		int year = Integer.parseInt(sc.nextLine());
		
		// 년도 계산 출력
		System.out.println("                                 **"+year+"년 1년간 연간 통계"+"**                                 ");
		StatisticsController.getYearAmountInfo(num, year);
		//printCategoryStaticsInfo();
	}
	
	/**
	 * 통계-기간 통계 화면 출력하는 메소드
	 */
	public static void printRangeStaticsInfo(int num) {
		System.out.println();
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println("시작 날짜 입력 : ");
		String startDate = sc.nextLine();
		System.out.println("종료 날짜 입력 : ");
		String endDate = sc.nextLine();
		
		// 년도 계산 출력
		System.out.println("                               **"+startDate+"~"+endDate+" 기간 통계"+"**                        ");
		StatisticsController.getRangeAmountInfo(num, startDate, endDate);
		//printCategoryStaticsInfo();
	}
	
	/**
	 * 통계 화면(상세 카테고리 통계) 화면 출력하는 메소드
	 */
	private static void printCategoryStaticsInfo(int num) {
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
