package dao;

import java.util.List;

import dto.MoneyBookDto;

public class MoneyBookDaoImpl implements MoneyBookDao{
	
private static MoneyBookDao instance = new MoneyBookDaoImpl();
	
	private MoneyBookDaoImpl() {}
	public static MoneyBookDao getInstance() {
		return instance;
	}
	@Override
	public int createMoneyBook(MoneyBookDto dto) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void updateMoneyBook(MoneyBookDto dto) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteAllMoneyBook() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteMoneyBook(int rownum) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<MoneyBookDto> getAllMoneyBook() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<MoneyBookDto> getDayMoneyBook(String date) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<MoneyBookDto> getMonthMoneyBook(String date) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<MoneyBookDto> getRecentMoneyBook() {
		// TODO Auto-generated method stub
		return null;
	}

}
