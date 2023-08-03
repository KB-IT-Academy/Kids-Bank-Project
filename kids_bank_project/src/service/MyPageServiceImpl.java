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
		List<ChildDto> list = myPageDao.childFindAll();
		return list;
	}

	@Override
	public ChildDto childFindByNumber(int num) {
		ChildDto dto = myPageDao.childFindByNumber(num);
		return dto;
	}

	@Override
	public int childDelete() {
		int result = myPageDao.childDelete();
		return result;

	}

	@Override
	public List<ParentDto> parentFindAll() {
		List<ParentDto> list = myPageDao.parentFindAll();
		return list;
	}

	@Override
	public ParentDto parentFindByNumber(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int parentDelete() {
		// TODO Auto-generated method stub
		return 0;

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
	public int createRelation(String registNum) {
		// TODO Auto-generated method stub
		return 0;
	}

}
