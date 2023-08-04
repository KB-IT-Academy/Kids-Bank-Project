package dto;

import java.util.Comparator;

public class RankDto {

	private String id;
	private int total_money; // 지출 or 수입 total_money
	private String startDate;
	private int emojiCount;

	/**
	 * 랭크 생성자
	 */
	public RankDto() {
	}

	/**
	 * 랭킹 생성자
	 * 
	 * @param id
	 * @param emojiCount
	 * @param currentMonth
	 */
	public RankDto(String id, int emojiCount, int total_money, String startDate) {
		super();
		this.id = id;
		this.total_money = total_money;
		this.emojiCount = emojiCount;
		this.startDate = startDate;
	}

	/**
	 * getter, setter
	 */

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public int getEmojiCount() {
		return emojiCount;
	}

	public void setEmojiCount(int emojiCount) {
		this.emojiCount = emojiCount;
	}

	public int getTotal_money() {
		return total_money;
	}

	public void setTotal_money(int total_money) {
		this.total_money = total_money;
	}

	/**
	 * 금액 랭크 toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("[ ");
		builder.append(id).append(" : ");
		builder.append(" 총 금액 = ").append(total_money);
		builder.append(" ] ");

		return builder.toString();
	}

	/**
	 * 좋아요 랭크 toString()
	 */
	public String toString(int emojiCount) {
		StringBuilder builder = new StringBuilder("[ ");
		builder.append(id).append(" : ");
		builder.append(" 좋아요 개수 = ").append(emojiCount);
		builder.append(" ] ");

		return builder.toString();
	}

	/**
	 * 좋아요순으로 정렬하기
	 */
	public static final Comparator<RankDto> LikeComparator = new Comparator<RankDto>() {
		@Override
		public int compare(RankDto r1, RankDto r2) {
			return Integer.compare(r1.emojiCount, r2.emojiCount);
		}
	};

	/**
	 * 지출, 수입 내림차순
	 */
	public static final Comparator<RankDto> SumComparator = new Comparator<RankDto>() {
		@Override
		public int compare(RankDto r1, RankDto r2) {
			return Integer.compare(r2.total_money, r1.total_money);
		}
	};

}
