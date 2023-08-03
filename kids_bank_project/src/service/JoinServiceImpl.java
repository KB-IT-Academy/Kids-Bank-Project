package service;

import dao.ChildDao;
import dao.ChildDaoImpl;
import dao.MyPageDao;
import dao.MyPageDaoImpl;
import dao.ParentDao;
import dao.ParentDaoImpl;
import dto.ChildDto;
import dto.ParentDto;
import exception.DMLException;
import exception.SearchNotFoundException;

public class JoinServiceImpl implements joinService {
private static joinService instance = new JoinServiceImpl();
static ChildDao childDao = new ChildDaoImpl();  
static ParentDao parentDao = new ParentDaoImpl();
	private JoinServiceImpl() {}
	
	public static joinService getInstance() {
		return instance;
	}
	
	@Override
	public int CreateChild(ChildDto dto) throws DMLException {
		int result = childDao.CreateChild(dto);
		if (result == 0) {
			throw new DMLException();
		}
 		return result;
	}

	@Override
	public void updateChild(ChildDto dto) {
		// TODO Auto-generated method stub

	}

	@Override
	public int createParent(ParentDto dto, String registNum) throws DMLException {
		int result = parentDao.createParent(dto, registNum);
		if (result == 0) {
			throw new DMLException();
		}
 		return result;

	}
	
	public int getParentNum(String id) throws SearchNotFoundException {
		int parentNum = parentDao.getParentNum(id);
		if (parentNum == 0) {
			throw new SearchNotFoundException();
		}
		return parentNum;
	}

	@Override
	public void updateParent(ParentDto dto) {
		// TODO Auto-generated method stub

	}

}
