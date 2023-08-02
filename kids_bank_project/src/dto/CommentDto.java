package dto;

public class CommentDto {
	// comment 고유 번호
	private String content;
	private String moneyDate;
	// 자식고유번호는 childDto에서 getter로 가져오기(필요로 한 곳에서)
	// 부모고유번호는 parentDto에서 getter로 가져오기
	
	/**
	 * 댓글 생성자
	 */
	public CommentDto() {}
	
	public CommentDto(String content, String moneyDate) {
		this.content = content;
		this.moneyDate = moneyDate;
		
	}
	/**
	 * getter, setter
	 */
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
		builder.append("CommentDto [content=");
		builder.append(content);
		builder.append(", moneyDate=");
		builder.append(moneyDate);
		builder.append("]");
		return builder.toString();
	}
	
	
}
