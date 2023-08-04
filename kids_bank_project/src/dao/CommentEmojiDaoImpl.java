package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import common.DBManager;
import dto.CommentDto;
import dto.EmojiDto;
import dto.ParentDto;
import exception.DMLException;
import exception.SearchWrongException;

public class CommentEmojiDaoImpl implements CommentEmojiDao {

	/**
	 * 댓글 생성
	 * @param 자식 고유번호, 부모 고유번호, 내용, 날짜
	 * sql : insert into comments (comments_num, child_num, parent_num, content, money_date, write_date, update_date)
	 * values (comments_seq.nextval, ?, ?, ?, ?, sysdate, sysdate); 
	 */
	@Override
	public void createComment(int childNum, int parentNum, String content, String date) throws DMLException {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		String sql = "insert into comments (comments_num, child_num, parent_num, content, money_date, write_date, update_date)"
				+ "	values (comments_seq.nextval, ?, ?, ?, ?, sysdate, sysdate)";
		try {
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, childNum);
			ps.setInt(2, parentNum);
			ps.setString(3, content);
			ps.setString(4, date);
			result = ps.executeUpdate();
			
		} catch (SQLException e) {
//			e.printStackTrace();
			throw new SearchWrongException("부모 데이터를 조회할 수 없습니다.");
		} finally {
			DBManager.releaseConnection(con, ps);
		}
	}

	@Override
	public void updateComment(CommentDto dto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteComment(String date) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<CommentDto> getComment(int num, String moneyDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int craeteEmoji(int childNum, int parentNum, int emoji, String date) throws DMLException {
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "insert into emoji (parent_num, child_num, emoji_type, money_date, write_date, update_date)"
				+ "	values (?, ?, ?, ?, sysdate, sysdate)";
		int result = 0;
		try {
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, parentNum);
			ps.setInt(2, childNum);
			ps.setInt(3, emoji);
			ps.setString(4, date);
			result = ps.executeUpdate();
			
		} catch (SQLException e) {
//			e.printStackTrace();
			throw new DMLException("이모지를 입력할 수 없습니다.");
		} finally {
			DBManager.releaseConnection(con, ps);
		}
		return result;

	}

	@Override
	public int deleteEmoji(int num, String date) throws DMLException {
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "delete emoji where parent_num = ? and money_date = ?)";
		int result = 0;
		try {
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, num);
			ps.setString(2, date);
			result = ps.executeUpdate();
			
		} catch (SQLException e) {
//			e.printStackTrace();
			throw new DMLException("이모지를 입력할 수 없습니다.");
		} finally {
			DBManager.releaseConnection(con, ps);
		}
		return result;
	}

	@Override
	public List<EmojiDto> getEmoji(int num, String moneyDate) {
		// TODO Auto-generated method stub
		return null;
	}

}
