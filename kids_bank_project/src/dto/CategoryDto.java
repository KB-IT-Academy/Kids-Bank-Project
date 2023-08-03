package dto;

public class CategoryDto {
	private int eat;
	private int snack;
	private int transport;
	private int culture;
	private int birthday;
	private int els;
	
	/**
	 * 카테고리 생성자
	 */
	public CategoryDto() {}
	

	public CategoryDto(int eat, int snack, int transport, int culture, int birthday, int els) {
		super();
		this.eat = eat;
		this.snack = snack;
		this.transport = transport;
		this.culture = culture;
		this.birthday = birthday;
		this.els = els;
	}
	
	/**
	 * getter, setter
	 * @return
	 */
	public int getEat() {
		return eat;
	}


	public void setEat(int eat) {
		this.eat = eat;
	}


	public int getSnack() {
		return snack;
	}


	public void setSnack(int snack) {
		this.snack = snack;
	}


	public int getTransport() {
		return transport;
	}


	public void setTransport(int transport) {
		this.transport = transport;
	}


	public int getCulture() {
		return culture;
	}


	public void setCulture(int culture) {
		this.culture = culture;
	}


	public int getBirthday() {
		return birthday;
	}


	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}


	public int getEls() {
		return els;
	}


	public void setEls(int els) {
		this.els = els;
	}


	/**
	 * 카테고리 toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CategoryDto [eat=");
		builder.append(eat);
		builder.append(", snack=");
		builder.append(snack);
		builder.append(", transport=");
		builder.append(transport);
		builder.append(", culture=");
		builder.append(culture);
		builder.append(", birthday=");
		builder.append(birthday);
		builder.append(", els=");
		builder.append(els);
		builder.append("]");
		return builder.toString();
	}


	
	
}
