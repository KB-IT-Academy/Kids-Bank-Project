package dto;

/**
 * 사용자 DTO
 */
public class UserDto {
	private String id; // ID
	private String password; // 비밀번호
	private String name; // 이름
	private String phone; // 전화번호(-제외)
	private String joinDate; // 주민등록번호(-포함)

	
	/**
	 * 생성자
	 */
	public UserDto(){}

	public UserDto(String id, String password, String name, String phone, String joinDate) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.joinDate = joinDate;
	}

	/**
	 * Getter, Setter
	 */
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
		final StringBuilder sb = new StringBuilder("UserDto{");
		sb.append("id='").append(id).append('\'');
		sb.append(", password='").append(password).append('\'');
		sb.append(", name='").append(name).append('\'');
		sb.append(", phone='").append(phone).append('\'');
		sb.append(", joinDate='").append(joinDate).append('\'');
		sb.append('}');
		return sb.toString();
	}
}