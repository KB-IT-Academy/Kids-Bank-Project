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

public class MoneyBookDaoImpl implements MoneyBookDao {

	private static MoneyBookDao instance = new MoneyBookDaoImpl();

	private MoneyBookDaoImpl() {
	}

	public static MoneyBookDao getInstance() {
		return instance;
	}

	@Override
	public int createMoneyBook(int num, MoneyBookDto dto) throws SearchNotFoundException {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		String sql = "insert into money_book (money_book_num, money_type, export_type, amount, content, memo, money_date, write_date, update_date )from money_book values (?, ?, ?, ?, ?, ?, ?, ?, sysdate, sysdate)";
		try {
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, dto.getMoneyBookNum());
			// static 으로 자식 고유번호 가져오기
			ps.setInt(2, 1);
			ps.setInt(3, dto.getMoneyTypeInt());
			ps.setString(4, dto.getOutcomeType());
			ps.setInt(5, dto.getAmount());
			ps.setString(6, dto.getContent());
			ps.setString(7, dto.getMemo());
			ps.setString(8, dto.getMoney_date());
			ps.setString(9, dto.getWrite_date());
			ps.setString(10, dto.getUpdate_date());

			result = ps.executeUpdate();
			int amount = dto.getAmount();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.releaseConnection(con, ps);
		}
		return 0;
	}

	@Override
	public int updateMoneyBook(int num, MoneyBookDto dto) throws SearchNotFoundException {

		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		List<MoneyBookDto> moneybook = getDayMoneyBook(num, dto.getMoney_date());
		MoneyBookDto dto2 = moneybook.get(dto.getRownum()-1);
		
		String sql = null;
		int type = dto.getMoneyTypeInt();
		if(type == 1) {
			sql = "UPDATE MONEY_BOOK SET AMOUNT = ? WHERE MONEY_BOOK_NUM = ?";
		}else if(type ==2 ) {
			sql = "UPDATE MONEY_BOOK SET CONTENT = ? WHERE MONEY_BOOK_NUM = ?";
		}else if(type == 3) {
			sql = "UPDATE MONEY_BOOK SET MEMO = ? WHERE MONEY_BOOK_NUM = ?";
		}
		
		try {
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			
			if(type == 1) {
				ps.setInt(1, dto.getAmount());
				ps.setInt(2, dto2.getMoneyBookNum());
			}else if(type ==2 ) {
				ps.setString(1, dto.getContent());
				ps.setInt(2, dto2.getMoneyBookNum());
			}else if(type == 3) {
				ps.setString(1, dto.getMemo());
				ps.setInt(2, dto2.getMoneyBookNum());
			}

			result = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.releaseConnection(con, ps);
		}
		return result;
	}

	@Override
	public int deleteAllMoneyBook(int num) throws SearchNotFoundException {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		String sql = "delete money_book";
		try {
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			result = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			DBManager.releaseConnection(con, ps);
		}
		return result;

	}

	@Override
	public List<MoneyBookDto> getAllMoneyBook(int num) throws SearchNotFoundException {
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
				MoneyBookDto moneybook = new MoneyBookDto();
				list.add(moneybook);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.releaseConnection(con, ps, rs);
		}

		return list;
	}

	@Override
	public List<MoneyBookDto> getDayMoneyBook(int num, String date) throws SearchNotFoundException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<MoneyBookDto> list = new ArrayList<>();
		String sql = "SELECT MONEY_BOOK_NUM, ROWNUM,TO_CHAR(MONEY_DATE,'YY-MM-DD') AS MONEY_DATE, MONEY_TYPE, AMOUNT, CONTENT, MEMO FROM (SELECT * FROM money_book WHERE TO_CHAR(MONEY_DATE,'YYYYMMDD')= ? ORDER BY MONEY_DATE DESC)";
		try {
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, date);
			rs = ps.executeQuery();
			while (rs.next()) {
				int moneyBookNum = rs.getInt("MONEY_BOOK_NUM");
				int rownum = rs.getInt("ROWNUM");
				String money_date =rs.getString("MONEY_DATE");
				int moneytype_num = rs.getInt("MONEY_TYPE");
				String moneytype;
				
				if(moneytype_num==1){
					moneytype = "지출";
				}else {
					moneytype= "수입";
				}
				
				int amount = rs.getInt("AMOUNT");
				String content = rs.getString("CONTENT");
				String memo = rs.getString("MEMO");
				
				MoneyBookDto moneybook = new MoneyBookDto(moneyBookNum,rownum,money_date,moneytype,amount,content,memo);
				list.add(moneybook);
			
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.releaseConnection(con, ps, rs);
		}

		return list;
	}

	@Override
	public List<MoneyBookDto> getMonthMoneyBook(int num, String date) throws SearchNotFoundException {
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
				MoneyBookDto moneybook = new MoneyBookDto();
				list.add(moneybook);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.releaseConnection(con, ps, rs);
		}

		return list;
	}

	@Override
	public List<MoneyBookDto> getRecentMoneyBook(int num) throws SearchNotFoundException{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		List<MoneyBookDto> list = new ArrayList<>();
		
		String sql = "SELECT MONEY_BOOK_NUM, ROWNUM, TO_CHAR(MONEY_DATE,'YY-MM-DD') AS MONEY_DATE, MONEY_TYPE, AMOUNT, CONTENT, MEMO FROM (SELECT * FROM money_book ORDER BY MONEY_DATE DESC) WHERE ROWNUM <= 5";
		try {
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				int moneyBookNum = rs.getInt("MONEY_BOOK_NUM");
				int rownum = rs.getInt("ROWNUM");
				String money_date =rs.getString("MONEY_DATE");
				int moneytype_num = rs.getInt("MONEY_TYPE");
				String moneytype;
				
				if(moneytype_num==1){
					moneytype = "지출";
				}else {
					moneytype= "수입";
				}
				
				int amount = rs.getInt("AMOUNT");
				String content = rs.getString("CONTENT");
				String memo = rs.getString("MEMO");
				
				MoneyBookDto moneybook = new MoneyBookDto(moneyBookNum, rownum,money_date,moneytype,amount,content,memo);
				list.add(moneybook);
			
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.releaseConnection(con, ps, rs);
		}
		
		return list;
	}

	@Override
	public int deleteMoneyBook(int num, int rownum) throws SearchNotFoundException {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		String sql = "delete * from money_book where rownum = ? ";
		try {
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			result = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			DBManager.releaseConnection(con, ps);
		}
		return result;
	}

}
