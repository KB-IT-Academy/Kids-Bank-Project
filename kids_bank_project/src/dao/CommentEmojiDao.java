package dao;

import java.util.List;

import dto.CommentDto;
import dto.EmojiDto;

public interface CommentEmojiDao {
	/**
	 * 댓글 생성하는 메서드
	 * @param dto
	 * insert into comments(comments_num ,child_num, parent_num, content, money_date, write_date) values (comment_seq.nextval,?, ?, ?, ?, sysdate);
	 * 1. child_num, 2. parent_num, 3. content, 4. money_date
	 */
	void createComment(CommentDto dto);
	
	/**
	 * 댓글 수정하는 메서드
	 * @param dto
	 * update comments
	 * set (content = ?)
	 * where parent_num = ? and money_date = ?
	 * 1. content, 2. parent_num, 3. money_date
	 */
	void updateComment(CommentDto dto);
	
	/**
	 * 댓글 삭제하는 메서드
	 * @param 선택할 날짜
	 * delete comments
	 * where parent_num = ?
	 * 1. parent_num
	 */
	void deleteComment(String date);
	
	/**
	 * 자식 고유 번호와 해당 날짜로 댓글들 조회하는 메서드
	 * @param num 자식 고유 번호
	 * @param moneyDate 댓글 단 날짜
	 * @return
	 * select * from comments where child_num = ? and moneyDate = ?
	 * 1. childNum 2. moneydate
	 */
	List<CommentDto> getComment(int num, String moneyDate);
	
	/**
	 * 이모지 생성하는 메서드
	 * @param EmojiDto
	 * insert into emoji
	 */
	void craeteEmoji(EmojiDto dto);
	
	/**
	 * 해당 날짜와 자기 자신(부모)의 num 값으로 이모지 삭제하는 메서드
	 * @param moneyDate
	 */
	public void deleteEmoji(String moneyDate);
	
	/**
	 * 자식 고유번호와 찾을 날짜를 활용하여 이모지를 조회하는 메서드
	 * @param num : 자식 고유 번호
	 * @param moneyDate : 찾을 날짜
	 * @return
	 */
	List<EmojiDto> getEmoji(int num, String moneyDate);
}
