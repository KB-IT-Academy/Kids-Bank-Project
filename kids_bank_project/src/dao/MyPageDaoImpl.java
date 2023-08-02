package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import common.DBManager;
import dto.ChildDto;
import dto.ParentDto;
import dto.UserDto;

public class MyPageDaoImpl implements MyPageDao {
	private static MyPageDao instance = new MyPageDaoImpl();
	
	private MyPageDaoImpl() {}
	public static MyPageDao getInstance() {
		return instance;
	}
	/**
	 * 자식 마이페이지에 보여줄 부모 데이터
	 * 이후에는 첫번 째 sql 문에 1 대신 static 변수에 들어있는
	 * child_num을 넣어주어야 함.
	 */
	@Override
	public List<UserDto> getParent() {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<UserDto> list = new ArrayList<>();
		String sql = "select * from parent_child where child_num = 1";
		try {
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				int parentNum = rs.getInt("parent_num");
				UserDto user = getUserData(con, parentNum);
				list.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.releaseConnection(con, ps, rs);
		}
		
		System.out.println(list);
		return list;
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
	public List<UserDto> getChild() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void createRelation(String registNum) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * getParent의 추가 쿼리
	 * @param con
	 * @param num
	 * @return
	 */
	private UserDto getUserData(Connection con, int num) throws SQLException {
		PreparedStatement ps = null;
		ResultSet rs = null;
		UserDto dto = null;
		String sql = "select * from parent where parent_num = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, num);
			rs = ps.executeQuery();
			if (rs.next()) {
				int number = rs.getInt("parent_num");
				String id = rs.getString("id");
				String pass = rs.getString("password");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				String joinDate = rs.getString("join_date");
				String type = rs.getString("parent_type");
				dto = new ParentDto(number, id, pass, name, phone, joinDate, type);
				
			}
		} finally {
			DBManager.releaseConnection(null, ps, rs);
		}
		return dto;
	}

}
