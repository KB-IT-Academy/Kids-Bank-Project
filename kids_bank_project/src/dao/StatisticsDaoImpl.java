package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import common.DBManager;
import dto.StatisticsDto;
import exception.SearchNotFoundException;

public class StatisticsDaoImpl implements StatisticsDao {

	private static StatisticsDao instance = new StatisticsDaoImpl();
	
	private StatisticsDaoImpl() {};
	
	public static StatisticsDao getInstance() {
		return instance;
	}

	@Override
	public StatisticsDto getWeekAmountInfo(int num, String date) throws SearchNotFoundException{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		StatisticsDto statistics = new StatisticsDto();
		statistics.setId(num);
		String sql = "SELECT money_type, SUM(amount) AS amountsum "
				+ "FROM MONEY_BOOK "
				+ "WHERE child_num=? "
				+ "AND money_date BETWEEN TO_DATE(?,'YYYY-MM-DD')-6 AND TO_DATE(?,'YYYY-MM-DD') "
				+ "GROUP BY money_type ";
		
		try {
			con = DBManager.getConnection(); // 연결
			con.setAutoCommit(false); // 자동 커밋 해지
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, num);
			ps.setString(2, date);
			ps.setString(3, date);
			
			// 실행
			rs = ps.executeQuery();
			while(rs.next()) {
				int moneyType = rs.getInt("money_type"); // income
				int amountSum = rs.getInt("amountsum");
				if (moneyType==1) // income
					statistics.setInComeAmount(amountSum);
				else if (moneyType==2) // outcome
					statistics.setOutComeAmount(amountSum);				
			}
			con.commit();
		} catch(SQLException e) {
			try {
				con.rollback();
				throw new SearchNotFoundException("주간 통계 조회에 오류가 발생했습니다.");
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			System.out.println(e.getMessage());
		} finally {
			DBManager.releaseConnection(con, ps, rs);
		}
		return statistics;
	}
	
	@Override
	public StatisticsDto getMonthAmountInfo(int num, int year, int month) throws SearchNotFoundException{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		StatisticsDto statistics = new StatisticsDto();
		statistics.setId(num);
		String sql = "SELECT money_type, SUM(amount) AS amountsum "
				+ "FROM MONEY_BOOK "
				+ "WHERE child_num=? "
				+ "AND EXTRACT(YEAR FROM money_date)=? "
				+ "AND EXTRACT(MONTH FROM money_date)=? "
				+ "GROUP BY money_type ";
		
		try {
			con = DBManager.getConnection(); // 연결
			con.setAutoCommit(false); // 자동 커밋 해지
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, num);
			ps.setInt(2, year);
			ps.setInt(3, month);
			
			// 실행
			rs = ps.executeQuery();
			while(rs.next()) {
				int moneyType = rs.getInt("money_type"); // income
				int amountSum = rs.getInt("amountsum");
				if (moneyType==1) // income
					statistics.setInComeAmount(amountSum);
				else if (moneyType==2) // outcome
					statistics.setOutComeAmount(amountSum);				
			}
			con.commit();
		} catch(SQLException e) {
			try {
				con.rollback();
				throw new SearchNotFoundException("월간 통계 조회에 오류가 발생했습니다.");
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			System.out.println(e.getMessage());
		} finally {
			DBManager.releaseConnection(con, ps, rs);
		}
		return statistics;
	}

	@Override
	public StatisticsDto getYearAmountInfo(int num, int year) throws SearchNotFoundException{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		StatisticsDto statistics = new StatisticsDto();
		statistics.setId(num);
		String sql = "SELECT money_type, SUM(amount) AS amountsum "
				+ "FROM MONEY_BOOK "
				+ "WHERE child_num=? "
				+ "AND EXTRACT(YEAR FROM money_date)=? "
				+ "GROUP BY money_type ";
		
		try {
			con = DBManager.getConnection(); // 연결
			con.setAutoCommit(false); // 자동 커밋 해지
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, num);
			ps.setInt(2, year);
			
			// 실행
			rs = ps.executeQuery();
			while(rs.next()) {
				int moneyType = rs.getInt("money_type"); // income
				int amountSum = rs.getInt("amountsum");
				if (moneyType==1) // income
					statistics.setInComeAmount(amountSum);
				else if (moneyType==2) // outcome
					statistics.setOutComeAmount(amountSum);				
			}
			con.commit();
		} catch(SQLException e) {
			try {
				con.rollback();
				throw new SearchNotFoundException("연간 통계 조회에 오류가 발생했습니다.");
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			System.out.println(e.getMessage());
		} finally {
			DBManager.releaseConnection(con, ps, rs);
		}
		return statistics;
	}
	
	@Override
	public StatisticsDto getRangeAmountInfo(int num, String startDate, String endDate) throws SearchNotFoundException{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		StatisticsDto statistics = new StatisticsDto();
		statistics.setId(num);
		String sql = "SELECT money_type, SUM(amount) AS amountsum "
				+ "FROM MONEY_BOOK "
				+ "WHERE child_num=? "
				+ "AND money_date BETWEEN TO_DATE(?,'YYYY-MM-DD') AND TO_DATE(?,'YYYY-MM-DD') "
				+ "GROUP BY money_type ";
		try {
			con = DBManager.getConnection(); // 연결
			con.setAutoCommit(false); // 자동 커밋 해지
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, num);
			ps.setString(2, startDate);
			ps.setString(3, endDate);
			
			// 실행
			rs = ps.executeQuery();
			while(rs.next()) {
				int moneyType = rs.getInt("money_type");
				int amountSum = rs.getInt("amountsum");
				if (moneyType==1) // income
					statistics.setInComeAmount(amountSum);
				else if (moneyType==2) // outcome
					statistics.setOutComeAmount(amountSum);				
			}
			con.commit();
		} catch(SQLException e) {
			try {
				con.rollback();
				throw new SearchNotFoundException("기간 통계 조회에 오류가 발생했습니다.");
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			System.out.println(e.getMessage());
		} finally {
			DBManager.releaseConnection(con, ps, rs);
		}
		return statistics;
	}
}
