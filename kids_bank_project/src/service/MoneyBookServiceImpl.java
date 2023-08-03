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
	public int createMoneyBook(MoneyBookDto dto) throws SearchNotFoundException{
		 int result = moneyBookDao.createMoneyBook(dto);
		 if(result == 0)
				throw new SearchNotFoundException("게시판에 게시물의 정보가 없습니다");
		 return 0;
				
				
	}

	@Override
	public void updateMoneyBook(MoneyBookDto dto)throws SearchNotFoundException {
		
		int result = moneyBookDao.updateMoneyBook(dto);
		if(result == 0)
			throw new SearchNotFoundException("게시판에 게시물의 정보가 없습니다");
		
	}

	@Override
	public void deleteAllMoneyBook()throws SearchNotFoundException  {
		 
		int result = moneyBookDao.deleteAllMoneyBook();
		if(result == 0) 
			throw new SearchNotFoundException("게시물 삭제되지 않았습니다.");
		
	}

	@Override
	public void deleteMoneyBook(int rownum) {
		int result = moneyBookDao.deleteMoneyBook(rownum);
		if(result == 0) 
			throw new SearchNotFoundException("게시물 삭제되지 않았습니다.");
		
	}

	@Override
	public List<MoneyBookDto> getAllMoneyBook() throws SearchNotFoundException{
		List<MoneyBookDto> list = moneyBookDao.getAllMoneyBook();
		if(list.isEmpty()) {
			throw new SearchNotFoundException("게시판에 게시물의 정보가 없습니다");
		}
		return list;
		
	}

	@Override
	public List<MoneyBookDto> getDayMoneyBook(String date) throws SearchNotFoundException{
		List<MoneyBookDto> list = moneyBookDao.getDayMoneyBook(date);
		if(list.isEmpty()) {
			throw new SearchNotFoundException("게시판에 게시물의 정보가 없습니다");
		}
		return list;
	
	}

	@Override
	public List<MoneyBookDto> getMonthMoneyBook(String date) throws SearchNotFoundException{
		List<MoneyBookDto> list = moneyBookDao.getMonthMoneyBook(date);
		if(list.isEmpty()) {
			throw new SearchNotFoundException("게시판에 게시물의 정보가 없습니다");
		}
		return list;
		
	}

	@Override
	public List<MoneyBookDto> getRecentMoneyBook() throws SearchNotFoundException{
		List<MoneyBookDto> list = moneyBookDao.getRecentMoneyBook();
		if(list.isEmpty()) {
			throw new SearchNotFoundException("게시판에 게시물의 정보가 없습니다");
		}
		return list;
		
	}

}
