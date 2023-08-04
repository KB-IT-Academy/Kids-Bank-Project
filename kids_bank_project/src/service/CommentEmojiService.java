package service;

import java.util.List;

import dao.ChildDao;
import dao.ChildDaoImpl;
import dao.CommentEmojiDao;
import dao.CommentEmojiDaoImpl;
import dto.CommentDto;
import dto.EmojiDto;
import exception.DMLException;

public class CommentEmojiService {
	static CommentEmojiDao commentEmojiDao = new CommentEmojiDaoImpl();  
	/**
	 * 댓글 생성하는 메서드
	 * @param dto
	 */
	public void createComment(int childNum, int parentNum, String content, String date) throws DMLException {
		
		
	}
	
	/**
	 * 댓글 수정하는 메서드
	 * @param dto
	 */
	public void updateComment(CommentDto dto) {};
	
	/**
	 * 댓글 삭제하는 메서드
	 * @param 선택할 날짜
	 */
	public void deleteComment(String date) {};
	
	/**
	 * 자식 고유 번호와 해당 날짜로 댓글들 조회하는 메서드
	 * @param num 자식 고유 번호
	 * @param moneyDate 댓글 단 날짜
	 * @return
	 */
	List<CommentDto> getComment(int num, String moneyDate) {
		return null;
	};
	
	/**
	 * 이모지 생성하는 메서드
	 * @param EmojiDto
	 */
	public int craeteEmoji(int childNum, int parentNum, String content, String date) throws DMLException {
		int result = commentEmojiDao.craeteEmoji(childNum, parentNum, content, date);
		if (result == 0) {
			throw new DMLException("이모지를 생성할 수 없습니다.");
		}
		return result;
	};
	
	/**
	 * 해당 날짜와 자기 자신(부모)의 num 값으로 이모지 삭제하는 메서드
	 * @param moneyDate
	 */
	public int deleteEmoji(int num, String date) {
		int result = commentEmojiDao.deleteEmoji(num, date);
		if (result == 0) {
			throw new DMLException("이모지를 삭제할 수 없습니다.");
		}
		return result;
	};
	
	/**
	 * 자식 고유번호와 찾을 날짜를 활용하여 이모지를 조회하는 메서드
	 * @param num : 자식 고유 번호
	 * @param moneyDate : 찾을 날짜
	 * @return
	 */
	List<EmojiDto> getEmoji(int num, String moneyDate) {
		return null;
	};
}
