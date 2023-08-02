package controller;

import java.util.List;

import dto.CommentDto;
import dto.EmojiDto;

public class CommentEmojiController {
	/**
	 * 댓글 생성
	 * @param CommentDto
	 */
	public void createComment(CommentDto dto) {
		
	}
	
	/**
	 * 댓글 수정
	 * @param CommentDto
	 */
	public void updateComment(CommentDto dto) {
		
	}
	
	/**
	 * 댓글 삭제
	 */
	public void deleteComment() {
		
	}
	
	/**
	 * 댓글 조회
	 * @param num : 자식 고유 번호, moneyDate : 댓글 달 날짜
	 */
	public List<CommentDto> getComment(int num, String moneyDate) {
		
		return null;
	}
	
	/**
	 * 이모지 생성
	 * @param num : 자식 고유 번호, moneyDate : 댓글 달 날짜
	 */
	public void craeteEmoji(int num, String moneyDate) {
		
	}
	
	/**
	 * 이모지 취소
	 * @param
	 */
	public void deleteEmoji(String moneyDate) {
		
	}
	
	/**
	 * 이모지 조회
	 * @param num : 자식 고유 번호, moneyDate : 댓글 달 날짜
	 */
	public List<EmojiDto> getEmoji(int num, String moneyDate) {
		
		return null;
	}
}
