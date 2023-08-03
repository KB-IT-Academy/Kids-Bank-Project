package service;

import dao.ChildDao;
import dao.ChildDaoImpl;
import dao.MyPageDao;
import dao.MyPageDaoImpl;
import dto.ChildDto;
import dto.ParentDto;
import exception.DMLException;

public class JoinServiceImpl implements joinService {
private static joinService instance = new JoinServiceImpl();
static ChildDao childDao = new ChildDaoImpl();  
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
	public void createParent(ParentDto dto, String registNum) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateParent(ParentDto dto) {
		// TODO Auto-generated method stub

	}

}
