package controller;

import java.util.List;

import dto.CommentDto;
import dto.EmojiDto;

public class CommentEmojiController {
	/**
	 * 댓글 생성하는 메서드
	 * @param dto
	 */
	public static void createComment(CommentDto dto) {
		
	}
	
	/**
	 * 댓글 수정하는 메서드
	 * @param dto
	 */
	public static void updateComment(CommentDto dto) {
		
	}
	
	/**
	 * 댓글 삭제하는 메서드
	 * @param 선택할 날짜
	 */
	public static void deleteComment(String date) {
		
	}
	
	/**
	 * 자식 고유 번호와 해당 날짜로 댓글들 조회하는 메서드
	 * @param num 자식 고유 번호
	 * @param moneyDate 댓글 단 날짜
	 * @return
	 */
	public static void getComment(int num, String moneyDate) {
		
	}
	
	/**
	 * 이모지 생성하는 메서드
	 * @param EmojiDto
	 */
	public static void craeteEmoji(EmojiDto dto) {
		
	}
	
	/**
	 * 해당 날짜와 자기 자신(부모)의 num 값으로 이모지 삭제하는 메서드
	 * @param moneyDate
	 */
	public static void deleteEmoji(String moneyDate) {
		
	}
	
	/**
	 * 자식 고유번호와 찾을 날짜를 활용하여 이모지를 조회하는 메서드
	 * @param num : 자식 고유 번호
	 * @param moneyDate : 찾을 날짜
	 * @return
	 */
	public static void getEmoji(int num, String moneyDate) {

	}
}
