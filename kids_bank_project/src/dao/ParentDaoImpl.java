package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import common.DBManager; 
import dto.ParentDto;

public class ParentDaoImpl implements ParentDao {

	/**
	 *  부모 로그인 
	 * @throws SQLException 
	 */
	@Override
	public ParentDto loginParent(String id, String password) throws SQLException{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ParentDto parentDto = null;
		
		String sql = "select * from PARENT where id=? and password=?";
		try {
			con = DBManager.getConnection();
			ps= con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, password);
		   
			rs = ps.executeQuery(); 
	        
			if(rs.next()) {
				int parentNum = rs.getInt("parent_num");
				String id1 = rs.getString("id");
				String password1 = rs.getString("password");
				String name = rs.getString("name");
				String phone = rs.getString("phone"); 
				String joinDate = rs.getString("join_date");  
				String parentType = rs.getString("parent_type");  
		 
				
				parentDto = new ParentDto(parentNum, id1, password1, name, phone, joinDate, parentType);
		
				
				 
			}
		}finally {
			 DBManager.releaseConnection(con, ps, rs);
		}
		
		return parentDto;
		
		

	}

	@Override
	public void updateParent(ParentDto dto) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void createParent(ParentDto dto, String registNum){
		// TODO Auto-generated method stub
		
	}
 

}
