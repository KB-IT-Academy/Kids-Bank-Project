package dto;

/**
 * 사용자 DTO
 */
public class UserDto {
	private int number; // 고유번호
	private String id; // ID
	private String password; // 비밀번호
	private String name; // 이름
	private String phone; // 전화번호(-제외)
	private String joinDate; // 주민등록번호(-포함)

	
	/**
	 * 생성자
	 */
	public UserDto(){}

	public UserDto(int number, String id, String password, String name, String phone, String joinDate) {
		this.number = number;
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.joinDate = joinDate;
	}

	/**
	 * Getter, Setter
	 */
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}

	/**
	 * toString
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("number=");
		builder.append(number);
		builder.append(", id=");
		builder.append(id);
		builder.append(", password=");
		builder.append(password);
		builder.append(", name=");
		builder.append(name);
		builder.append(", phone=");
		builder.append(phone);
		builder.append(", joinDate=");
		builder.append(joinDate);
		return builder.toString();
	}
}
