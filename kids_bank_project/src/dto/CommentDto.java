package dto;

public class CommentDto {
	private int number;
	private String content;
	private String moneyDate;
	// 자식고유번호는 childDto에서 getter로 가져오기(필요로 한 곳에서)
	// 부모고유번호는 parentDto에서 getter로 가져오기
	
	/**
	 * 댓글 생성자
	 */
	public CommentDto() {}
	
	public CommentDto(int number, String content, String moneyDate) {
		this.number = number;
		this.content = content;
		this.moneyDate = moneyDate;
		
	}
	/**
	 * getter, setter
	 */
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getMoneyDate() {
		return moneyDate;
	}
	public void setMoneyDate(String moneyDate) {
		this.moneyDate = moneyDate;
	}

	/**
	 * 댓글 toString
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CommentDto [number=");
		builder.append(number);
		builder.append(", content=");
		builder.append(content);
		builder.append(", moneyDate=");
		builder.append(moneyDate);
		builder.append("]");
		return builder.toString();
	}
	
	
}
