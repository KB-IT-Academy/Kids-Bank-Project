package dto;

public class MoneyBookDto {
	private int rownum;

	private int moneyBookNum; // 고유번호
	// 1 : 수입, 2 : 지출
	private int moneyType;
	// 카테고리
	private String outcomeType; // 지출 분류
	private int amount; // 금액
	private String content; // 내용
	private String memo; // 메모
	private String money_date; // 수입일 or 지출일

	private String write_date; // 등록일
	private String update_date; // 수정일


	
	/**
	 * 생성자
	 */
	public MoneyBookDto() {}
	
	public MoneyBookDto(int amount, String content, String memo) {
		this.amount = amount;
		this.content = content;
		this.memo = memo;
	}
	
	public MoneyBookDto(String outComeType, int amount, String content, String memo) {
		this.outcomeType = outcomeType;
		this.amount = amount;
		this.content = content;
		this.memo = memo;
	}


	public MoneyBookDto(int rownum, int moneyBookNum, int moneyType, String outcomeType, int amount, String content, String memo, String money_date, String write_date, String update_date) {
		this.rownum = rownum;
		this.moneyBookNum = moneyBookNum;
		this.moneyType = moneyType;
		this.outcomeType = outcomeType;
		this.amount = amount;
		this.content = content;
		this.memo = memo;
		this.money_date = money_date;
		this.write_date = write_date;
		this.update_date = update_date;
	}

	/**
	 * getter, setter
	 */
	public int getRownum() {
		return rownum;
	}

	public void setRownum(int rownum) {
		this.rownum = rownum;
	}

	public int getMoneyBookNum() {
		return moneyBookNum;
	}

	public void setMoneyBookNum(int moneyBookNum) {
		this.moneyBookNum = moneyBookNum;
	}

	public int getMoneyType() {
		return moneyType;
	}

	public void setMoneyType(int moneyType) {
		this.moneyType = moneyType;
	}

	public String getOutcomeType() {
		return outcomeType;
	}

	public void setOutcomeType(String outcomeType) {
		this.outcomeType = outcomeType;
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

	public String getWrite_date() {
		return write_date;
	}

	public void setWrite_date(String write_date) {
		this.write_date = write_date;
	}

	public String getUpdate_date() {
		return update_date;
	}

	public void setUpdate_date(String update_date) {
		this.update_date = update_date;
	}

	

	/**
	 * 기입장 toString
	 */
	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("MoneyBookDto{");
		sb.append("rownum=").append(rownum);
		sb.append(", moneyBookNum=").append(moneyBookNum);
		sb.append(", moneyType=").append(moneyType);
		sb.append(", outcomeType='").append(outcomeType).append('\'');
		sb.append(", amount=").append(amount);
		sb.append(", content='").append(content).append('\'');
		sb.append(", memo='").append(memo).append('\'');
		sb.append(", money_date='").append(money_date).append('\'');
		sb.append(", write_date='").append(write_date).append('\'');
		sb.append(", update_date='").append(update_date).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
