package service;

import java.util.List;

import dao.MoneyBookDao;
import dao.MoneyBookDaoImpl;
import dto.MoneyBookDto;
import dto.UserDto;

public class MoneyBookServiceImpl implements MoneyBookService{

	private static MoneyBookServiceImpl instance = new MoneyBookServiceImpl();
	private MoneyBookDao moneyBookDao = MoneyBookDaoImpl.getInstance();
	
	public static MoneyBookServiceImpl getInstance() {
		return instance;
	}
	
	@Override
	public int createMoneyBook(MoneyBookDto dto) {
		int result = moneyBookDao.createMoneyBook(dto);
		return 0;
	}

	@Override
	public void updateMoneyBook(MoneyBookDto dto) {
		int result = moneyBookDao.updateMoneyBook(dto);
		
	}

	@Override
	public void deleteAllMoneyBook() {
		int result = moneyBookDao.deleteAllMoneyBook();
		
	}

	@Override
	public void deleteMoneyBook(int rownum) {
		int result = moneyBookDao.deleteMoneyBook(rownum);
		
	}

	@Override
	public List<MoneyBookDto> getAllMoneyBook() {
		List<MoneyBookDto> list = moneyBookDao.getAllMoneyBook();
		return list;
	}

	@Override
	public List<MoneyBookDto> getDayMoneyBook(String date) {
		List<MoneyBookDto> list = moneyBookDao.getDayMoneyBook(date);
		return list;
	}

	@Override
	public List<MoneyBookDto> getMonthMoneyBook(String date) {
		List<MoneyBookDto> list = moneyBookDao.getMonthMoneyBook(date);
		return list;
		
	}

	@Override
	public List<MoneyBookDto> getRecentMoneyBook() {
		List<MoneyBookDto> list = moneyBookDao.getRecentMoneyBook();
		return list;
		
	}

}
