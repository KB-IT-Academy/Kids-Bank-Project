package dto;

public class StatisticsDto {
	private int id;
	private int inComeAmount;
	private int outComeAmount;
	private String startDate;
	private String endDate;
	private CategoryDto categoryDto; 
	
	/**
	 * 생성자
	 */
	public StatisticsDto() {}
	
	public StatisticsDto(int id, int inComeAmount, int outComeAmount,
			String startDate, String endDate, CategoryDto categoryDto) {
		this.id = id;
		this.inComeAmount = inComeAmount;
		this.outComeAmount = outComeAmount;
		this.startDate = startDate;
		this.endDate = endDate;
		this.categoryDto = categoryDto;
	}
	
	/**
	 * getter, setter
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public CategoryDto getCategoryDto() {
		return categoryDto;
	}

	public void setCategoryDto(CategoryDto categoryDto) {
		this.categoryDto = categoryDto;
	}
	
	/**
	 * 통계 toString 
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StatisticsDto [id=");
		builder.append(id);
		builder.append(", inComeAmount=");
		builder.append(inComeAmount);
		builder.append(", outComeAmount=");
		builder.append(outComeAmount);
		builder.append(", startDate=");
		builder.append(startDate);
		builder.append(", endDate=");
		builder.append(endDate);
		builder.append(", categoryDto=");
		builder.append(categoryDto);
		builder.append("]");
		return builder.toString();
	}
}
