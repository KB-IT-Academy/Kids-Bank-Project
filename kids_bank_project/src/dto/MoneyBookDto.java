package dto;

public class MoneyBookDto {
	private int rownum;
	// number : 고유번호
	private int number;
	// 1 : 수입, 2 : 지출
	private int moneyType;
	// 카테고리
	private String exportType;
	private int amount;
	private String content;
	private String memo;
	private String money_date;
	
	/**
	 * 생성자
	 */
	public MoneyBookDto() {}
	
	public MoneyBookDto(int number, int moneyType, String exportType, int amount, String content, String memo,
			String money_date) {
		this.number = number;
		this.moneyType = moneyType;
		this.exportType = exportType;
		this.amount = amount;
		this.content = content;
		this.memo = memo;
		this.money_date = money_date;
	}
	/**
	 * getter, setter
	 */
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getMoneyType() {
		return moneyType;
	}
	public void setMoneyType(int moneyType) {
		this.moneyType = moneyType;
	}
	public String getExportType() {
		return exportType;
	}
	public void setExportType(String exportType) {
		this.exportType = exportType;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getMoney_date() {
		return money_date;
	}
	public void setMoney_date(String money_date) {
		this.money_date = money_date;
	}
	/**
	 * 기입장 toString
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MoneyBookDto [number=");
		builder.append(number);
		builder.append(", moneyType=");
		builder.append(moneyType);
		builder.append(", exportType=");
		builder.append(exportType);
		builder.append(", amount=");
		builder.append(amount);
		builder.append(", content=");
		builder.append(content);
		builder.append(", memo=");
		builder.append(memo);
		builder.append(", money_date=");
		builder.append(money_date);
		builder.append("]");
		return builder.toString();
	}
	
	
}
