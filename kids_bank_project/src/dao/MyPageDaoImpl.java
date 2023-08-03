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
		return list;
	}
	
	/**
	 * 모든 자식 회원 조회하는 메서드
	 * select * from child;
	 */
	@Override
	public List<ChildDto> childFindAll() {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<ChildDto> list = new ArrayList<>();
		String sql = "select * from child";
		try {
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				int childNum = rs.getInt("child_num");
				String id = rs.getString("id");
				String password = rs.getString("password");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				String registrationNumber = rs.getString("registration_number");
				String joinDate = rs.getString("join_date");
				ChildDto cd = new ChildDto(childNum, id, password, name, phone, registrationNumber, joinDate);
				list.add(cd);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.releaseConnection(con, ps, rs);
		}
		return list;
	}
	
	/**
	 * 자식 고유 번호로 회원 조회하는 메서드
	 * @param num 자식 고유 번호
	 * select * from child where child_num = ? (자식 고유 번호)
	 */
	@Override
	public ChildDto childFindByNumber(int num) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ChildDto dto = null;
		String sql = "select * from child where child_num = ? ";
		try {
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			// 여기에 static 자식 고유 번호 가져오기
			ps.setInt(1, 1);
			rs = ps.executeQuery();
			if (rs.next()) {
				int childNum = rs.getInt("child_num");
				String id = rs.getString("id");
				String password = rs.getString("password");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				String registrationNumber = rs.getString("registration_number");
				String joinDate = rs.getString("join_date");
				dto = new ChildDto(childNum, id, password, name, phone, registrationNumber, joinDate);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.releaseConnection(con, ps, rs);
		}
		return dto;
	}
	
	/**
	 * 자식 회원 탈퇴하는 메서드
	 * delete child where child_num = ? (자식 고유 번호)
	 */
	@Override
	public int childDelete() {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		String sql = "delete child where child_num = ?";
		try {
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			// static에 있는 자식고유번호 넣기
			ps.setInt(1, 1);
			result = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.releaseConnection(con, ps);
		}
		return result;
	}
	/**
	 * 모든 부모 회원 조회하는 메서드
	 * select * from parent
	 */
	@Override
	public List<ParentDto> parentFindAll() {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<ParentDto> list = new ArrayList<>();
		String sql = "select * from parent";
		try {
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				int parentNum = rs.getInt("parent_num");
				String id = rs.getString("id");
				String password = rs.getString("password");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				String joinDate = rs.getString("join_date");
				String parentType = rs.getString("parent_type");
				ParentDto cd = new ParentDto(parentNum, id, password, name, phone, joinDate, parentType);
				list.add(cd);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.releaseConnection(con, ps, rs);
		}
		return list;
	}
	
	/**
	 * 부모 고유 번호로 회원 조회하는 메서드
	 * @param 부모 고유 번호
	 * select * from parent where parent_num = ? (부모 고유 번호)
	 */
	@Override
	public ParentDto parentFindByNumber(int num) {
//		Connection con = null;
//		PreparedStatement ps = null;
//		ResultSet rs = null;
//		ParentDto dto = null;
//		String sql = "select * from child where child_num = ? ";
//		try {
//			con = DBManager.getConnection();
//			ps = con.prepareStatement(sql);
//			// 여기에 static 자식 고유 번호 가져오기
//			ps.setInt(1, 1);
//			rs = ps.executeQuery();
//			if (rs.next()) {
//				int childNum = rs.getInt("child_num");
//				String id = rs.getString("id");
//				String password = rs.getString("password");
//				String name = rs.getString("name");
//				String phone = rs.getString("phone");
//				String registrationNumber = rs.getString("registration_number");
//				String joinDate = rs.getString("join_date");
//				dto = new ChildDto(childNum, id, password, name, phone, registrationNumber, joinDate);
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			DBManager.releaseConnection(con, ps, rs);
//		}
		return null;
	}
	@Override
	public int parentDelete() {
		// TODO Auto-generated method stub
		return 0;
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
