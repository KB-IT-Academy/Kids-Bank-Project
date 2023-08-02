package service;

import java.util.List;

import dto.CommentDto;
import dto.EmojiDto;

public interface CommentEmojiService {
	/**
	 * 댓글 생성
	 * @param CommentDto
	 */
	void createComment(CommentDto dto);
	
	/**
	 * 댓글 수정
	 * @param Commentdto
	 */
	void updateComment(CommentDto dto);
	
	/**
	 * 댓글 삭제
	 */
	void deleteComment();
	
	/**
	 * 댓글 조회
	 * @param num, moneyDate 
	 */
	List<CommentDto> getComment(int num, String moneyDate);
	
	/**
	 * 이모지 생성
	 * @param num, moneyDate
	 */
	void craeteEmoji(int num, String moneyDate);
	
	/**
	 * 이모지 삭제
	 * @param moneyDate
	 */
	public void deleteEmoji(String moneyDate);
	
	/**
	 * 
	 * @param num, moneyDate
	 * @return
	 */
	List<EmojiDto> getEmoji(int num, String moneyDate);
}
