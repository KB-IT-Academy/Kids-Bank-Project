package dto;

public class RankDto {
// 수익, 지츨
	private String id;
	private int inComeAmount;
	private int outComeAmount;
	private double ratio;
	private String startDate;
	private int emojiCount;
	
	/**
	 * 랭크 생성자
	 */
	public RankDto() {}
	
	public RankDto(String id, int inComeAmount, int outComeAmount, double ratio, String startDate, int emojiCount) {
		super();
		this.id = id;
		this.inComeAmount = inComeAmount;
		this.outComeAmount = outComeAmount;
		this.ratio = ratio;
		this.startDate = startDate;
		this.emojiCount = emojiCount;
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

	public int getInComeAmount() {
		return inComeAmount;
	}

	public void setInComeAmount(int inComeAmount) {
		this.inComeAmount = inComeAmount;
	}

	public int getOutComeAmount() {
		return outComeAmount;
	}

	public void setOutComeAmount(int outComeAmount) {
		this.outComeAmount = outComeAmount;
	}

	public double getRatio() {
		return ratio;
	}

	public void setRatio(double ratio) {
		this.ratio = ratio;
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

	/**
	 * 랭크 toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RankDto [id=");
		builder.append(id);
		builder.append(", inComeAmount=");
		builder.append(inComeAmount);
		builder.append(", outComeAmount=");
		builder.append(outComeAmount);
		builder.append(", ratio=");
		builder.append(ratio);
		builder.append(", startDate=");
		builder.append(startDate);
		builder.append(", emojiCount=");
		builder.append(emojiCount);
		builder.append("]");
		return builder.toString();
	}
	
	
}
