package dto;

public class CommentDto {
	// comment 고유 번호
	private String content;
	private String moneyDate;
	// 자식고유번호는 childDto에서 getter로 가져오기(필요로 한 곳에서)
	private ChildDto childDto;
	// 부모고유번호는 parentDto에서 getter로 가져오기
	private ParentDto parentDto;
	
	/**
	 * 댓글 생성자
	 */
	public CommentDto() {}

	public CommentDto(String content, String moneyDate, ChildDto childDto, ParentDto parentDto) {
		this.content = content;
		this.moneyDate = moneyDate;
		this.childDto = childDto;
		this.parentDto = parentDto;
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

	public ChildDto getChildDto() {
		return childDto;
	}

	public void setChildDto(ChildDto childDto) {
		this.childDto = childDto;
	}

	public ParentDto getParentDto() {
		return parentDto;
	}

	public void setParentDto(ParentDto parentDto) {
		this.parentDto = parentDto;
	}

	/**
	 * 댓글 toString
	 */
	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("CommentDto{");
		sb.append("content='").append(content).append('\'');
		sb.append(", moneyDate='").append(moneyDate).append('\'');
		sb.append(", childNum=").append(childDto.getChildNum());
		sb.append(", parentNum=").append(parentDto.getParentNum());
		sb.append('}');
		return sb.toString();
	}
}
