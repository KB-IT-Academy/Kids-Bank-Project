package dto;

import dto.UserDto;

/**
 * 자식 DTO
 */
public class ChildDto extends UserDto {
	private int childNum; // 고유번호
	private String registrationNumber; // 주민등록번호
	private boolean isOpen; // 공개 여부
	
	/**
	 * 생성자
	 */
	public ChildDto(){	}

	public ChildDto(int childNum, String id, String password, String name, String phone, String registrationNumber, String joinDate) {
		super(id, password, name, phone, joinDate);
		this.childNum = childNum;
		this.registrationNumber = registrationNumber;
		this.isOpen = true;
	}


	public ChildDto(String id, String password, String name, String phone, String joinDate, int childNum, String registrationNumber, boolean isOpen) {
		super(id, password, name, phone, joinDate);
		this.childNum = childNum;
		this.registrationNumber = registrationNumber;
		this.isOpen = isOpen;
	}

	/**
	 * Getter, Setter
	 */
	public int getChildNum() {
		return childNum;
	}

	public void setChildNum(int childNum) {
		this.childNum = childNum;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean open) {
		isOpen = open;
	}

	/**
	 * toString
	 */
	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("ChildDto{");
		sb.append("childNum=").append(childNum);
		sb.append(", registrationNumber='").append(registrationNumber).append('\'');
		sb.append(", isOpen=").append(isOpen);
		sb.append('}');
		return sb.toString();
	}
}
