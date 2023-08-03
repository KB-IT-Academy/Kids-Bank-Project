package service;

import java.util.List;

import dao.MyPageDao;
import dao.MyPageDaoImpl;
import dto.ChildDto;
import dto.ParentDto;
import dto.UserDto;

public class MyPageServiceImpl implements MyPageService {
	private static MyPageServiceImpl instance = new MyPageServiceImpl();
	private MyPageDao myPageDao = MyPageDaoImpl.getInstance();
	
	
	
	public static MyPageServiceImpl getInstance() {
		return instance;
	}
	@Override
	public List<ChildDto> childFindAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ChildDto childFindByNumber(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void childDelete() {
		// TODO Auto-generated method stub

	}

	@Override
	public List<ParentDto> parentFindAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ParentDto parentFindByNumber(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void parentDelete() {
		// TODO Auto-generated method stub

	}

	@Override
	public List<UserDto> getParent() {
		List<UserDto> list = myPageDao.getParent();
		return list;
	}

	@Override
	public List<UserDto> getChild() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createRelation(String registNum) {
		// TODO Auto-generated method stub

	}

}
