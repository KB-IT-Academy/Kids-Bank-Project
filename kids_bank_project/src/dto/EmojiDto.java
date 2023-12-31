package dto;

public class EmojiDto {

	private ParentDto parentDto; // PK
	private ChildDto childDto; // childNum(FK)

	private int emojiType; // 이모지타입(좋아요:0, 싫어요:1)
	private String moneyDate; // 이모지 등록할 수입일 or 지출일

	
	/**
	 * 이모지 생성자
	 */
	public EmojiDto() {}

	public EmojiDto(ParentDto parentDto, ChildDto childDto, int emojiType, String moneyDate) {
		this.parentDto = parentDto;
		this.childDto = childDto;
		this.emojiType = emojiType;
		this.moneyDate = moneyDate;
	}

	/**
	 * getter, setter
	 */
	public ParentDto getParentDto() {
		return parentDto;
	}

	public void setParentDto(ParentDto parentDto) {
		this.parentDto = parentDto;
	}

	public ChildDto getChildDto() {
		return childDto;
	}

	public void setChildDto(ChildDto childDto) {
		this.childDto = childDto;
	}

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
		final StringBuilder sb = new StringBuilder("EmojiDto{");
		sb.append("parentNum=").append(parentDto.getParentNum());
		sb.append(", childNum=").append(childDto.getChildNum());
		sb.append(", emojiType=").append(emojiType);
		sb.append(", moneyDate='").append(moneyDate).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
