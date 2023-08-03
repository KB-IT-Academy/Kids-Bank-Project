package dto;

public class MoneyBookDto {
	private int rownum;

	private int moneyBookNum; // 고유번호
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

	public MoneyBookDto(int rownum, int moneyBookNum, int moneyType, String exportType, int amount, String content, String memo, String money_date) {
		this.rownum = rownum;
		this.moneyBookNum = moneyBookNum;
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
		final StringBuilder sb = new StringBuilder("MoneyBookDto{");
		sb.append("rownum=").append(rownum);
		sb.append(", moneyBookNum=").append(moneyBookNum);
		sb.append(", moneyType=").append(moneyType);
		sb.append(", exportType='").append(exportType).append('\'');
		sb.append(", amount=").append(amount);
		sb.append(", content='").append(content).append('\'');
		sb.append(", memo='").append(memo).append('\'');
		sb.append(", money_date='").append(money_date).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
