package dto;

public class EmojiDto {
	private int emojiType;
	private String moneyDate;
	
	/**
	 * 이모지 생성자
	 */
	public EmojiDto() {}
	
	public EmojiDto(int emojiType, String moneyDate) {
		super();
		this.emojiType = emojiType;
		this.moneyDate = moneyDate;
	}
	/**
	 * getter, setter
	 */
	public int getEmojiType() {
		return emojiType;
	}
	public void setEmojiType(int emojiType) {
		this.emojiType = emojiType;
	}
	public String getMoneyDate() {
		return moneyDate;
	}
	public void setMoneyDate(String moneyDate) {
		this.moneyDate = moneyDate;
	}

	/**
	 * 이모지 toString
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EmojiDto [emojiType=");
		builder.append(emojiType);
		builder.append(", moneyDate=");
		builder.append(moneyDate);
		builder.append("]");
		return builder.toString();
	}
	
	
}
