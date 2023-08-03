package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import common.DBManager;
import dto.ChildDto; 

public class ChildDaoImpl implements ChildDao  {
	 
	
	/*
	 * 아이 로그인
	 */
	@Override
	public ChildDto loginChild(String id, String password) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ChildDto childDto = null;
		
		String sql = "select * from CHILD where id=? and password=?";
		try {
			con = DBManager.getConnection();
			ps= con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, password);
		   
			rs = ps.executeQuery(); 
	        
			if(rs.next()) {
				int childNum = rs.getInt("child_num");
				String id1 = rs.getString("id");
				String password1 = rs.getString("password");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				String registrationNumber = rs.getString("registration_number");
				String joinDate = rs.getString("join_date");  
				
				childDto = new ChildDto(childNum, id1, password1, name, phone, registrationNumber, joinDate);
				 
			}
		}finally {
			 DBManager.releaseConnection(con, ps, rs);
		}
		
		return childDto;
		
		
	}
	@Override
	public void CreateChild(ChildDto dto) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateChild(ChildDto dto) {
		// TODO Auto-generated method stub
		
	} 

}
