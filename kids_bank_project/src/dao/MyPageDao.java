package dao;

import java.util.List;

import dto.ChildDto;
import dto.ParentDto;
import dto.UserDto;

public interface MyPageDao {
	
	List<ChildDto> childFindAll(); 
	
	ChildDto childFindByNumber(int num);
	
	void childDelete();
	
	List<ParentDto> parentFindAll();
	
	ParentDto parentFindByNumber(int num);
	
	void parentDelete();
	
	List<UserDto> getChild();
	/**
	 * select * from parent_child where child_num = ?
	 * select * from parent where parent_num = ?
	 */
	List<UserDto> getParent();
	
	void createRelation(String registNum) ;
}
