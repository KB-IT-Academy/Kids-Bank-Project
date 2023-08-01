package dto;

/**
 * 부모 DTO
 */
public class ParentDto extends UserDto{
	private String parentType; // 부모 관계("부", "모")
	
	/**
	 * 생성자
	 */
	public ParentDto() {}

	public ParentDto(int number, String id, String password, String name, String phone, String joinDate, String nickname, String parentType) {
		super(number, id, password, name, phone, joinDate, nickname);
		this.parentType = parentType;
	}
	
	/**
	 * Getter, Setter
	 */
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
		StringBuilder builder = new StringBuilder();
		builder.append(getClass().getSimpleName());
		builder.append("[");
		builder.append(super.toString());
		builder.append(", parentType=");
		builder.append(parentType);
		builder.append("]");
		return builder.toString();
	}
}
