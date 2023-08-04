package service;

import java.sql.SQLException;
import java.util.List;


import dao.MyPageDao;
import dao.MyPageDaoImpl;
import dto.ChildDto;
import dto.ParentDto;
import dto.UserDto;
import exception.DMLException;
import exception.SearchNotFoundException;
import dto.ChildDto;

public class MyPageServiceImpl implements MyPageService {
	private static MyPageServiceImpl instance = new MyPageServiceImpl();
	private MyPageDao myPageDao = MyPageDaoImpl.getInstance();
	
	
	
	public static MyPageServiceImpl getInstance() {
		return instance;
	}
	@Override
	public List<ChildDto> childFindAll() throws SearchNotFoundException{
		List<ChildDto> list = myPageDao.childFindAll();
		if (list.isEmpty()) {
			throw new SearchNotFoundException();
		}
		return list;
	}

	@Override
	public ChildDto childFindByNumber(int num) throws SearchNotFoundException{
		ChildDto dto = myPageDao.childFindByNumber(num);
		if (dto == null) {
			throw new SearchNotFoundException();
		}
		return dto;
	}
	
	@Override
	public int childFindByRegistNum(String registNum) throws SearchNotFoundException {
		int result = myPageDao.childFindByRegistNum(registNum);
		if (result == -1) {
			throw new SearchNotFoundException("주민등록번호가 일치하는 자식이 없습니다.");
		}
		return result;
	}

	@Override
	public int childDelete(int childNum) throws DMLException{
		int result = myPageDao.childDelete(childNum);
		if (result == 0) {
			throw new DMLException("탈퇴할 수 없습니다.");
		}
		return result;

	}

	@Override
	public List<ParentDto> parentFindAll() throws SearchNotFoundException{
		List<ParentDto> list = myPageDao.parentFindAll();
		if (list.isEmpty()) {
			throw new SearchNotFoundException();
		}
		return list;
	}

	@Override
	public ParentDto parentFindByNumber(int num) throws SearchNotFoundException{
		ParentDto dto = myPageDao.parentFindByNumber(num);
		if (dto == null) {
			throw new SearchNotFoundException();
		}
		return dto;
	}

	@Override
	public int parentDelete(int parentNum) throws DMLException{
		int result = myPageDao.parentDelete(parentNum);
		if (result == 0) {
			throw new DMLException("탈퇴할 수 없습니다.");
		}
		return result;

	}

	@Override
	public List<ParentDto> getParent(int childNum) throws SearchNotFoundException{
		List<ParentDto> list = myPageDao.getParent(childNum);
		if (list.isEmpty()) {
			throw new SearchNotFoundException();
		}
		return list;
	}

	@Override
	public List<ChildDto> getChild(int num) throws SearchNotFoundException{
		List<ChildDto> list = myPageDao.getChild(num);
//		System.out.println("list size: " + list.size());
		if (list.isEmpty()) {
			System.out.println("비었다.");
		
			throw new SearchNotFoundException();
		}
		return list;
	}

	@Override
	public int createRelation(int parentNum, String registNum, int order) throws DMLException{
		int result = myPageDao.createRelation(parentNum, registNum, order);
		if (result == 0) {
			throw new DMLException("관계를 생성할 수 없습니다.");
		}
		return result;
	}
	
	
	@Override
	public String getChildPassword(int num) throws SearchNotFoundException {
		String password = myPageDao.getChildPassword(num);
		if (password == null) {
			throw new SearchNotFoundException("데이터가 존재하지 않습니다.");
		}
		return password;
	}
	@Override
	public String getParentPassword(int num) throws SearchNotFoundException {
		String password = myPageDao.getParentPassword(num);
		if (password == null) {
			throw new SearchNotFoundException("데이터가 존재하지 않습니다.");
		}
		return password;
	}
	

}
