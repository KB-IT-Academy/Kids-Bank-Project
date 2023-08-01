package view;

import java.util.Scanner;

public class ChildMenuView_강윤서 {
	//ChildMenuView패키지->StatisticsView클래스
	// 1-메뉴 출력 printXxxMenu
	// 2-결과 출력 printXxxResult
	// static 메소드로 선언
	
	/**
	 * 통계 조회-전체 메뉴 출력
	 */
	public static void printTotalStatisticsMenu() {
		System.out.println("----------------------------------------------");
		System.out.println("1. 주간 통계 2. 월간 통계 3. 연간 통계 4. 기간 통계");		
		System.out.println("----------------------------------------------");		
	}
	
	/**
	 * 주간 통계-결과 출력
	 */
	public static void printWeekStatisticsResult() {
		System.out.println("*****"+"0월 0일"+"~"+"0월 0일"+" 7일간 주간 통계"+"*****");
		System.out.println("-지출 : "+"0"+"원");
		System.out.println("+수입 : "+"0"+"원");
		System.out.println();
		
		System.out.println("지출 카테고리 비율");
		// 카레고리별 % 출력-반복문
		System.out.println("23"+"% "+"식비");
		System.out.println();
		
		// 수입 대비 지출 비율 계산 후 결과 출력
		// 수입 대비 지출 비율 계산
		System.out.println("많이 절약했어요!");
	}
	
	/**
	 * 월간 통계-메뉴 출력
	 */
	public static void printMonthStatisticsMenu() {
		System.out.println("월을 입력해주세요: ");
		// 입력 처리
	}
	
	/**
	 * 월간 통계-결과 출력
	 */
	public static void printMonthStatisticsResult() {
		System.out.println("*****"+"0월"+" 한달간 월간 통계"+"*****");
		System.out.println("-지출 : "+"0"+"원");
		System.out.println("+수입 : "+"0"+"원");
		System.out.println();
		
		System.out.println("지출 카테고리 비율");
		// 카레고리별 % 출력-반복문
		System.out.println("23"+"% "+"식비");
		System.out.println();
		
		// 수입 대비 지출 비율 계산 후 결과 출력
		// 수입 대비 지출 비율 계산
		System.out.println("많이 절약했어요!");
	}
	
	/**
	 * 연간 통계-메뉴 출력
	 */
	public static void printYearStatisticsMenu() {
		System.out.println("년을 입력해주세요: ");
		// 입력 처리
	}
	
	/**
	 * 연간 통계-결과 출력
	 */
	public static void printYearStatisticsResult() {
		System.out.println("*****"+"0000년"+" 1년간 연간 통계"+"*****");
		System.out.println("-지출 : "+"0"+"원");
		System.out.println("+수입 : "+"0"+"원");
		System.out.println();
		
		System.out.println("지출 카테고리 비율");
		// 카레고리별 % 출력-반복문
		System.out.println("23"+"% "+"식비");
		System.out.println();
		
		// 수입 대비 지출 비율 계산 후 결과 출력
		// 수입 대비 지출 비율 계산
		System.out.println("많이 절약했어요!");
	}
	
	/**
	 * 기간 통계-메뉴 출력
	 */
	public static void printRangeStatisticsMenu() {
		System.out.println("시작 날짜를 입력해주세요: ");
		System.out.println("종료 날짜를 입력해주세요: ");
		// 입력 처리
	}
	
	/**
	 * 기간 통계-결과 출력
	 */
	public static void printRangeStatisticsResult() {
		System.out.println("*****"+"0월 0일"+"~"+"0월 0일"+" 기간 통계"+"*****");
		System.out.println("-지출 : "+"0"+"원");
		System.out.println("+수입 : "+"0"+"원");
		System.out.println();
		
		System.out.println("지출 카테고리 비율");
		// 카레고리별 % 출력-반복문
		System.out.println("23"+"% "+"식비");
		System.out.println();
		
		// 수입 대비 지출 비율 계산 후 결과 출력
		// 수입 대비 지출 비율 계산
		System.out.println("많이 절약했어요!");
	}
}
