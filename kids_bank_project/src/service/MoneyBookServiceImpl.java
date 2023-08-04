package service;

import java.util.List;


import dao.MoneyBookDao;
import dao.MoneyBookDaoImpl;
import dto.MoneyBookDto;
import dto.UserDto;
import exception.SearchNotFoundException;
import view.FailView;
import view.SuccessView;

public class MoneyBookServiceImpl implements MoneyBookService{

	private static MoneyBookServiceImpl instance = new MoneyBookServiceImpl();
	private MoneyBookDao moneyBookDao = MoneyBookDaoImpl.getInstance();
	
	public static MoneyBookServiceImpl getInstance() {
		return instance;
	}
	
	@Override
	public int createMoneyBook(int num, MoneyBookDto dto) throws SearchNotFoundException{
		 int result = moneyBookDao.createMoneyBook(num, dto);
		 if(result == 0)
				throw new SearchNotFoundException("게시판에 게시물의 정보가 없습니다");
		 return 0;
				
				
	}

	@Override
	public void updateMoneyBook(int type, int num, MoneyBookDto dto)throws SearchNotFoundException {
		
		int result = moneyBookDao.updateMoneyBook(type, num, dto);
		if(result == 0)
			throw new SearchNotFoundException("게시판에 게시물의 정보가 없습니다");
		
	}

	@Override
	public void deleteAllMoneyBook(int num)throws SearchNotFoundException  {
		 
		int result = moneyBookDao.deleteAllMoneyBook(num);
		if(result == 0) 
			throw new SearchNotFoundException("게시물 삭제되지 않았습니다.");
		
	}

	@Override
	public void deleteMoneyBook(String date, int childNum, int rownum) {
		int result = moneyBookDao.deleteMoneyBook(date,childNum, rownum);

		if(result == 0) 
			throw new SearchNotFoundException("게시물 삭제되지 않았습니다.");
		
	}

	@Override
	public List<MoneyBookDto> getAllMoneyBook(int childNum) throws SearchNotFoundException{
		List<MoneyBookDto> list = moneyBookDao.getAllMoneyBook(childNum);
		if(list.isEmpty()) {
			throw new SearchNotFoundException("게시판에 게시물의 정보가 없습니다");
		}
		return list;
		
	}

	@Override
	public List<MoneyBookDto> getDayMoneyBook(int childNum, String date) throws SearchNotFoundException{
		List<MoneyBookDto> list = moneyBookDao.getDayMoneyBook(childNum, date);
		if(list.isEmpty()) {
			throw new SearchNotFoundException("게시판에 게시물의 정보가 없습니다");
		}
		return list;
	
	}

	@Override
	public List<MoneyBookDto> getMonthMoneyBook(int childNum, String date) throws SearchNotFoundException{
		List<MoneyBookDto> list = moneyBookDao.getMonthMoneyBook(childNum, date);
		if(list.isEmpty()) {
			throw new SearchNotFoundException("게시판에 게시물의 정보가 없습니다");
		}
		return list;
		
	}

	@Override
	public List<MoneyBookDto> getRecentMoneyBook(int childNum) throws SearchNotFoundException{
		List<MoneyBookDto> list = moneyBookDao.getRecentMoneyBook(childNum);
		if(list.isEmpty()) {
			throw new SearchNotFoundException("게시판에 게시물의 정보가 없습니다");
		}
		return list;
		
	}

}
