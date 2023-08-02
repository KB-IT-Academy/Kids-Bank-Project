package dto;

public class CategoryDto {
	private double eat;
	private double snack;
	private double transport;
	private double culture;
	private double birthday;
	private double els;
	
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
	 */
	public double getEat() {
		return eat;
	}


	public void setEat(double eat) {
		this.eat = eat;
	}


	public double getSnack() {
		return snack;
	}


	public void setSnack(double snack) {
		this.snack = snack;
	}


	public double getTransport() {
		return transport;
	}


	public void setTransport(double transport) {
		this.transport = transport;
	}


	public double getCulture() {
		return culture;
	}


	public void setCulture(double culture) {
		this.culture = culture;
	}


	public double getBirthday() {
		return birthday;
	}


	public void setBirthday(double birthday) {
		this.birthday = birthday;
	}


	public double getEls() {
		return els;
	}


	public void setEls(double els) {
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
