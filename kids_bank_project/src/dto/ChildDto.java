package dto;

/**
 * 자식 DTO
 */
public class ChildDto extends UserDto {
	private String registrationNumber; // 주민등록번호
	private boolean isOpen; // 공개 여부
	
	/**
	 * 생성자
	 */
	public ChildDto(){	}
	
	public ChildDto(int number, String id, String password, String name, String phone, String registrationNumber, String joinDate) {
		super(number, id, password, name, phone, joinDate);
		this.registrationNumber = registrationNumber;
		this.isOpen = true;
	}
	
	/**
	 * Getter, Setter
	 */
	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
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
		builder.append(", registrationNumber=");
		builder.append(registrationNumber);
		builder.append(", isOpen=");
		builder.append(isOpen);
		builder.append("]");
		return builder.toString();
	}
}
