package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import common.DBManager;
import dto.RankDto;
import exception.SearchNotFoundException;

public class RankDaoImpl implements RankDao {

	// 싱글톤
	private static RankDao instance = new RankDaoImpl();

	private RankDaoImpl() {
	}

	public static RankDao getInstance() {
		return instance;
	}

	@Override
	public List<RankDto> countLike(String date) throws SearchNotFoundException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		List<RankDto> rankList = new ArrayList<>();

		String sql = "SELECT CHILD_NUM, COUNT(CHILD_NUM) FROM EMOJI GROUP BY CHILD_NUM HAVING CHILD_NUM"
				+ " IN (SELECT CHILD_NUM FROM EMOJI WHERE TO_CHAR(MONEY_DATE, 'YYYY-MM') = ?)";

		try {
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, date);
			rs = ps.executeQuery();
			while (rs.next()) {
				int childnum = rs.getInt("CHILD_NUM");
				int countlike = rs.getInt("COUNT(CHILD_NUM)");

				String id = this.findId(con, childnum);

				RankDto rankdto = new RankDto(id, countlike, 0, date);

				rankList.add(rankdto);
			}

			// 좋아요순으로 정렬하기
			Collections.sort(rankList, RankDto.LikeComparator);

		} catch (SQLException e) {
			// e.printStackTrace();
			throw new SearchNotFoundException("좋아요 랭킹 조회에 오류가 발생했습니다.");
		} finally {
			DBManager.releaseConnection(con, ps, rs);
		}
		return rankList;
	}

	@Override
	public List<RankDto> getMonthRank(String date, int type) throws SearchNotFoundException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		List<RankDto> rankList = new ArrayList<>();

		String sql = null;
		sql = "SELECT CHILD_NUM, SUM(AMOUNT) AS TOTAL_MONEY FROM MONEY_BOOK WHERE TO_CHAR(MONEY_DATE, 'YYYY-MM') = ? AND MONEY_TYPE = ? GROUP BY CHILD_NUM";
		try {
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, date);
			ps.setInt(2, type);
			rs = ps.executeQuery();

			System.out.println("1");
			while (rs.next()) {
				int childnum = rs.getInt("CHILD_NUM");
				int total_money = rs.getInt("TOTAL_MONEY");

				String id = this.findId(con, childnum);

				RankDto rankdto = new RankDto(id, 0, total_money, date);

				rankList.add(rankdto);
			}

			// 좋아요순으로 정렬하기
			Collections.sort(rankList, RankDto.SumComparator);

		} catch (SQLException e) {
			e.printStackTrace();
			throw new SearchNotFoundException("좋아요 랭킹 조회에 오류가 발생했습니다.");
		} finally {
			DBManager.releaseConnection(con, ps, rs);
		}
		return rankList;
	}

	@Override
	public List<RankDto> getWeekRank(String date, int type) throws SearchNotFoundException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		List<RankDto> rankList = new ArrayList<>();

		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		// 문자열을 LocalDate로 변환합니다.
		LocalDate dateday = LocalDate.parse(date, dateFormatter);

		// 일주일 전으로 돌리는 방법
		LocalDate oneWeekAgo = dateday.minusWeeks(1);

		// 일주일 전 날짜를 문자열로 변환합니다.
		String oneWeekAgoString = oneWeekAgo.format(dateFormatter);

		String sql = "SELECT CHILD_NUM, SUM(AMOUNT) AS TOTAL_MONEY FROM MONEY_BOOK WHERE (TO_CHAR(MONEY_DATE, 'YYYY-MM-DD') BETWEEN ? AND ?) AND MONEY_TYPE = ? GROUP BY CHILD_NUM";

		try {
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);

			ps.setString(1, oneWeekAgoString);
			ps.setString(2, date);
			ps.setInt(3, type);

			rs = ps.executeQuery();
			while (rs.next()) {
				int childnum = rs.getInt("CHILD_NUM");
				int total_money = rs.getInt("TOTAL_MONEY");

				String id = this.findId(con, childnum);

				RankDto rankdto = new RankDto(id, 0, total_money, date);

				rankList.add(rankdto);
			}

			// 좋아요순으로 정렬하기
			Collections.sort(rankList, RankDto.SumComparator);

		} catch (SQLException e) {
			e.printStackTrace();
			throw new SearchNotFoundException("좋아요 랭킹 조회에 오류가 발생했습니다.");
		} finally {
			DBManager.releaseConnection(con, ps, rs);
		}
		return rankList;
	}

	/**
	 * 조회된 child_num 에 대한 ID 찾는 메소드
	 * 
	 * @param con
	 * @param childnum
	 * @return
	 * @throws SQLException
	 */
	private String findId(Connection con, int childnum) throws SQLException {

		PreparedStatement ps = null;
		ResultSet rs = null;
		String id = null;
		String sql = "SELECT ID FROM CHILD WHERE CHILD_NUM = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, childnum);

			rs = ps.executeQuery();
			if (rs.next()) {
				id = rs.getString("ID");
			}

		} finally {
			DBManager.releaseConnection(null, ps, rs);
		}
		return id;

	}

}
