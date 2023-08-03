package view.childView;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import controller.RankController;
import dto.RankDto;

public class RankView {

	// 시스템 달, 월 불러오기
	private static LocalDate currentDate = LocalDate.now();
	private static List<RankDto> rankList;

	private static DateTimeFormatter yearFormatter = DateTimeFormatter.ofPattern("yyyy");
	private static DateTimeFormatter monthFormatter = DateTimeFormatter.ofPattern("MM");
	private static DateTimeFormatter dayFormatter = DateTimeFormatter.ofPattern("dd");
	private static String yearString = currentDate.format(yearFormatter);
	private static String monthString = currentDate.format(monthFormatter);
	private static String dayString = currentDate.format(dayFormatter);

	static Scanner sc = new Scanner(System.in);


	public RankView() {
	}

	/**
	 * 랭킹 타입 선택 키보드 입력을 처리하는 메소드
	 */
	public static void printRankView() {

		int flag = 1;
		while (flag == 1) {
			System.out.println();
			System.out.println("----------------------------------------------------------------------------------------------");
			System.out.println("                                       랭         킹                                     ");
			System.out.println("----------------------------------------------------------------------------------------------");

			System.out.println();
			System.out.println("**********************************************************************************************");
			System.out.println("                             1. 머니 랭킹                  2. 좋아요 랭킹                          ");
			System.out.println("----------------------------------------------------------------------------------------------");
			System.out.println("메인 메뉴로 돌아가려면 q를 입력해주세요.");
			System.out.print("메뉴선택 >> ");

			String type = sc.nextLine();
			switch (type) {
			case "1":
				inputPeriod();
				break;
			case "2":
				String currentMonth = yearString + "-" + monthString;

				RankController.countLike(currentMonth);

				// SuccessView.printRank(rankList);=>controller에서 해줌
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
	 * 랭킹 기간 선택 키보드 입력을 처리하는 메소드
	 */
	public static void inputPeriod() {

		int flag = 1;
		String period;
		while (flag == 1) {
			System.out.println();
			System.out.println("----------------------------------------------------------------------------------------------");
			System.out.println("1. 이번 달 랭킹    2. 최근 7일 랭킹");
			System.out.println("랭킹 메뉴로 돌아가려면 q를 입력해주세요.");
			System.out.print("메뉴선택 >> ");

			String menu = sc.nextLine();
			switch (menu) {
			case "1":
				// 한달 지출 계산 메소드 부르기
				String currentMonth = yearString + "-" + monthString;
				period = "1";
				inputRowRank(currentMonth, period);
				break;
			case "2":
				// 일주일 지출 계산 메소드 부르기
				String date = yearString + "-" + monthString + "-" + dayString;
				period = "2";
				inputRowRank(date, period);
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
	 * 랭킹 sort 선택 키보드 입력을 처리하는 메소드
	 */
	public static void inputRowRank(String date, String period) {

		int flag = 1;
		while (flag == 1) {
			System.out.println();
			System.out.println("----------------------------------------------------------------------------------------------");
			System.out.println("1. 지출왕 랭킹    2. 수입왕 랭킹");
			System.out.println("이전 메뉴로 돌아가려면 q를 입력해주세요.");
			System.out.print("메뉴선택 >> ");

			String menu = sc.nextLine();
			int type =0;
			switch (menu) {
			case "1":
				// 사용자 있는지 확인
				// sort 메소드
				type = Integer.parseInt(menu);
				if(period=="1") {
					RankController.getMonthRank(date, type);
				}else if(period=="2") {
					RankController.getWeekRank(date, type);
				}
				flag=0;
				break;
			case "2":
				// 사용자 있는지 확인
				// sort 메소드
				type = Integer.parseInt(menu);
				if(period=="1") {
					RankController.getMonthRank(date, type);
				}else if(period=="2") {
					RankController.getWeekRank(date, type);
				}
				flag=0;
				break;
			case "q":
				flag = 0;
				return;
			default:
				System.out.println("화면에 보이는 메뉴 번호를 입력해주세요.");
			}
		}
	}

}
