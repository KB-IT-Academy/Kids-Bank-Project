package dto;
 

/**
 * 부모 DTO
 */
public class ParentDto extends UserDto {
	private int parentNum; // 고유번호
	private String parentType; // 부모 관계("부", "모")
	
	/**
	 * 생성자
	 */
	public ParentDto() {}

	public ParentDto(int parentNum, String id, String password, String name, String phone, String joinDate, String parentType) {
		super(id, password, name, phone, joinDate);
		this.parentNum = parentNum;
		this.parentType = parentType;
	}

	/**
	 * Getter, Setter
	 */
	public int getParentNum() {
		return parentNum;
	}

	public void setParentNum(int parentNum) {
		this.parentNum = parentNum;
	}

	public String getParentType() {
		return parentType;
	}

	public void setParentType(String parentType) {
		this.parentType = parentType;
	}

	/**
	 * toString
	 */
	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("ParentDto{");
		sb.append(super.toString());
		sb.append("parentNum=").append(parentNum);
		sb.append(", parentType='").append(parentType).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
