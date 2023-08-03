package dto;

public class StatisticsDto {
	private String id;
	private int inComeAmount;
	private int outComeAmount;
	private String startDate;
	private String endDate;
	private CategoryDto categoryDto; 
	
	/**
	 * 생성자
	 */
	public StatisticsDto() {}
	
	public StatisticsDto(String nickname, int inComeAmount, int outComeAmount,
			String startDate, String endDate, CategoryDto categoryDto) {
		super();
		this.categoryDto = categoryDto;
		this.inComeAmount = inComeAmount;
		this.outComeAmount = outComeAmount;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	/**
	 * getter, setter
	 */
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
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	/**
	 * 통계 toString 
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StatisticsDto [inComeAmount=");
		builder.append(inComeAmount);
		builder.append(", outComeAmount=");
		builder.append(outComeAmount);
		builder.append(", startDate=");
		builder.append(startDate);
		builder.append(", endDate=");
		builder.append(endDate);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
}
