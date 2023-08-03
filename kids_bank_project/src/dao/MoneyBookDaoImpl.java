package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import common.DBManager;
import dto.MoneyBookDto;
import exception.SearchNotFoundException;

public class MoneyBookDaoImpl implements MoneyBookDao{
	
private static MoneyBookDao instance = new MoneyBookDaoImpl();
	
	private MoneyBookDaoImpl() {}
	public static MoneyBookDao getInstance() {
		return instance;
	}
	@Override
	public int createMoneyBook(MoneyBookDto dto)throws SearchNotFoundException{
		Connection con = null;
		PreparedStatement ps= null;
		int result = 0;
		String sql = "insert into money_book (money_book_num, money_type, export_type, amount, content, memo, money_date, write_date, update_date )from money_book values (?, ?, ?, ?, ?, ?, ?, ?, sysdate, sysdate)";
		try {
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, dto.getMoneyBookNum());
			//static 으로 자식 고유번호 가져오기
			ps.setInt(2, 1);
			ps.setInt(3, dto.getMoneyType());
			ps.setString(4, dto.getOutcomeType());
			ps.setInt(5, dto.getAmount());
			ps.setString(6, dto.getContent());
			ps.setString(7, dto.getMemo());
			ps.setString(8, dto.getMoney_date());
			ps.setString(9, dto.getWrite_date());
			ps.setString(10, dto.getUpdate_date());
		
			result = ps.executeUpdate();
			int amount = dto.getAmount();
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			DBManager.releaseConnection(con, ps);
		}
		return 0;
	}
	@Override
	public int updateMoneyBook(MoneyBookDto dto) throws SearchNotFoundException{
		
		Connection con = null;
		PreparedStatement ps= null;
		int result = 0;
		String sql = "update board set amount = ?, content = ?, memo = ? from money_book where money_date = ?";
		try {
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, dto.getAmount());
			ps.setString(2, dto.getContent());
			ps.setString(3, dto.getMemo());
			ps.setString(4, dto.getMoney_date());
		
			result = ps.executeUpdate();
			
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			DBManager.releaseConnection(con, ps);
		}
		return result;
	}
	
	@Override
	public int deleteAllMoneyBook() throws SearchNotFoundException{
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		String sql = "delete money_book";
		try {
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			result = ps.executeUpdate();
			
		}catch(SQLException e){
			e.printStackTrace();
			DBManager.releaseConnection(con, ps);
		}
		return result;
		
	}
	
	@Override
	public List<MoneyBookDto> getAllMoneyBook() throws SearchNotFoundException{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<MoneyBookDto> list = new ArrayList<>();
		String sql = "select rownum, money_book_num, money_type, export_type, amount, content, memo, money_date, write_date, update_date from money_book order by money_date ";
		try {
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new MoneyBookDto(rs.getInt("rownum"), rs.getInt("money_book_num"), rs.getInt("money_type") , rs.getString( "export_type"), rs.getInt(" amount"), rs.getString("content"), rs.getString(" memo"), rs.getString(" money_date"), rs.getString( "write_date"), rs.getString ("update_date")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.releaseConnection(con, ps, rs);
		}
		
		return list;
	}
	
	@Override
	public List<MoneyBookDto> getDayMoneyBook(String date) throws SearchNotFoundException{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<MoneyBookDto> list = new ArrayList<>();
		String sql = "select rownum, money_book_num, money_type, export_type, amount, content, memo, money_date, write_date, update_date from money_book where money_date = ? order by money_date ";
		try {
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, date);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new MoneyBookDto(rs.getInt("rownum"), rs.getInt("money_book_num"), rs.getInt("money_type") , rs.getString( "export_type"), rs.getInt(" amount"), rs.getString("content"), rs.getString(" memo"), rs.getString(" money_date"), rs.getString( "write_date"), rs.getString ("update_date")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.releaseConnection(con, ps, rs);
		}
		
		return list;
	}
	@Override
	public List<MoneyBookDto> getMonthMoneyBook(String date) throws SearchNotFoundException{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<MoneyBookDto> list = new ArrayList<>();
		String sql = "select rownum, money_book_num, money_type, export_type, amount, content, memo, money_date, write_date, update_date from money_book where substr(money_date,0,6) = ? order by money_date ";
		try {
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, date);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new MoneyBookDto(rs.getInt("rownum"), rs.getInt("money_book_num"), rs.getInt("money_type") , rs.getString( "export_type"), rs.getInt(" amount"), rs.getString("content"), rs.getString(" memo"), rs.getString(" money_date"), rs.getString( "write_date"), rs.getString ("update_date")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.releaseConnection(con, ps, rs);
		}
		
		return list;
	}
	@Override
	public List<MoneyBookDto> getRecentMoneyBook() throws SearchNotFoundException{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<MoneyBookDto> list = new ArrayList<>();
		String sql = "select rownum, money_book_num, money_type, export_type, amount, content, memo, money_date, write_date, update_date from money_book order by money_date ";
		try {
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			for(int i = 0; i<5; i++) {
				if (rs.next()) {
					list.add(new MoneyBookDto(rs.getInt("rownum"), rs.getInt("money_book_num"), rs.getInt("money_type") , rs.getString( "export_type"), rs.getInt(" amount"), rs.getString("content"), rs.getString(" memo"), rs.getString(" money_date"), rs.getString( "write_date"), rs.getString ("update_date")));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.releaseConnection(con, ps, rs);
		}
		
		return list;
	}
	
	@Override
	public int deleteMoneyBook(int rownum) throws SearchNotFoundException{
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		String sql = "delete * from money_book where rownum = ? ";
		try {
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			result = ps.executeUpdate();
			
		}catch(SQLException e){
			e.printStackTrace();
			DBManager.releaseConnection(con, ps);
		}
		return result;
	}

}
