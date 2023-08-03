package service;

import java.util.List;

import dao.MyPageDao;
import dao.MyPageDaoImpl;
import dto.ChildDto;
import dto.ParentDto;
import dto.UserDto;
import exception.DMLException;
import exception.SearchNotFoundException;

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
	public int childDelete() throws DMLException{
		int result = myPageDao.childDelete();
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
	public int parentDelete() throws DMLException{
		int result = myPageDao.parentDelete();
		if (result == 0) {
			throw new DMLException("탈퇴할 수 없습니다.");
		}
		return result;

	}

	@Override
	public List<UserDto> getParent() throws SearchNotFoundException{
		List<UserDto> list = myPageDao.getParent();
		if (list.isEmpty()) {
			throw new SearchNotFoundException();
		}
		return list;
	}

	@Override
	public List<UserDto> getChild() throws SearchNotFoundException{
		List<UserDto> list = myPageDao.getChild();
		if (list.isEmpty()) {
			throw new SearchNotFoundException();
		}
		return list;
	}

	@Override
	public int createRelation(String registNum, int order) throws DMLException{
		int result = myPageDao.createRelation(registNum, order);
		if (result == 0) {
			throw new DMLException("관계를 생성할 수 없습니다.");
		}
		return result;
	}

}
